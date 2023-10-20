
package poo;


public class AreaCirc {
    static final double pi = 3.1415;
    double raio;
    
    public AreaCirc(){

    }
    
    public AreaCirc(double raioEntrada){
        raio = raioEntrada;
    }
    
    public double calcular(){
        return pi * Math.pow(raio,2);
    }
    
    public double calcular(double raio){
        return pi * raio * raio;
    }
    
    public double getPi() {
        return pi;
    }
    /*
    public void setPi(float pi){
        this.pi = pi;
    }
    
    public void setPi(double pi) {
        this.pi = pi;
    }
    */
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
