package br.com.cwi.reset.exemploreset;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWordController {

    private static String mensagem = "Hello World";

    @GetMapping("/hello-world")
    public String helloWord(){
        return mensagem;
    }


    @PutMapping("/hello-world/{novaMensagem}")
    public String mudarMensagem(@RequestBody String novaMensagem) {
        this.mensagem = novaMensagem;
        return this.mensagem;
    }

}
