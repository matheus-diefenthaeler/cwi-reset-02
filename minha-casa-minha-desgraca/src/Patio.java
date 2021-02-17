public class Patio {

    private Boolean temPiscina;
    private Double metrosQuadrados;

    public Patio(Boolean temPiscina, Double metrosQuadrados) {
        this.temPiscina = temPiscina;
        this.metrosQuadrados = metrosQuadrados;
    }

    public String getTemPiscina() {
        if(temPiscina){
            return "com piscina!!";
        }
        return null;
    }

    public void setTemPiscina(Boolean temPiscina) {
        this.temPiscina = temPiscina;
    }

    public Double getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public void setMetrosQuadrados(Double metrosQuadrados) {
        this.metrosQuadrados = metrosQuadrados;
    }

    public String getPatioInfo(){
        return "\nCasa com patio de " + getMetrosQuadrados().toString() + " metros quadrados"+ " e ainda " + getTemPiscina();
    }

}
