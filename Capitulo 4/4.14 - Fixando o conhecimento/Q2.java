/* 2) Programa
Classe: Porta Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ 
Métodos: void abre(), void fecha(), void pinta(String s), boolean estaAberta()
Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas dimensões e use o método 
estaAbertapara verifcar se ela está aberta. */

class Porta{
    boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

    void abre(){
        this.aberta = true;
    }
    void fecha(){
        this.aberta = false;
    }
    // Esse s atribui o valor de s para o atributo cor ou seja recebe uma String
    void pinta(String s){
        this.cor = s;
    }
    boolean estaAberta(){
        return this.aberta;

    }
}

public class Q2 {
    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.abre();
        System.out.println(porta.estaAberta());

        porta.fecha();
        System.out.println(porta.estaAberta());

        porta.pinta("Azul");
        System.out.println(porta.cor);

        porta.dimensaoX = 10;
        porta.dimensaoY = 20;
        porta.dimensaoZ = 30;

        System.out.println(porta.dimensaoX + " " + porta.dimensaoY + " " + porta.dimensaoZ);

        
    }
}