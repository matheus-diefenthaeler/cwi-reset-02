package oo;

public class SituacaoAluno {

    private String name;
    private int notaFinal;

    public SituacaoAluno(String name, int nota){
        this.name = name;
        this.notaFinal = nota;
    }

    public void getSituacao(){
        System.out.println("Nome do Aluno: " + name);
        System.out.println("Nota Final: " + notaFinal);
        if(notaFinal<7){
            System.out.println("Situacao: Reprovado \n");
        }else{
            System.out.println("Situacao: Aprovado \n");
        }
    }

//    public int getNotaFinal(){
//        return notaFinal;
//    }
//
//    public String getName(){
//        return name;
//    }
//
}
