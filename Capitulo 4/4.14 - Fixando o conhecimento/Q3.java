/* 3) Programa 3
Classe: Casa Atributos: cor, porta1, porta2, porta3 Método: 
void pinta(String s), int quantasPortasEstaoA-bertas()
Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; abra e feche as mesmas como desejar. 
Utilize o métodoquantasPortasEstaoAbertas para imprimir o número de portas abertas. */

class Casa{
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;
    // Esse s atribui o valor de s para o atributo cor ou seja recebe uma String
    void pinta(String s){
        this.cor = s;
    }

    int quantasPortasEstaoAbertas(){
        int portasAbertas = 0;
        if(this.porta1.estaAberta){
            portasAbertas++;
        }
        if(this.porta2.estaAberta){
            portasAbertas++;
        }
        if(this.porta3.estaAberta){
            portasAbertas++;
        }
        return portasAbertas;
    }
}

class Porta{
    boolean estaAberta;
    String cor;
    
    void abre(){
        this.estaAberta = true;
    }
    void fecha(){
        this.estaAberta = false;
    }
    void pinta(String s){
        this.cor = s;
    }
    boolean estaAberta(){
        return this.estaAberta;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Casa casa = new Casa();
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();

        casa.porta1 = porta1;
        casa.porta2 = porta2;
        casa.porta3 = porta3;

        casa.porta1.abre();
        casa.porta2.abre();
        casa.porta3.abre();

        System.out.println(casa.quantasPortasEstaoAbertas());

        casa.porta1.fecha();
        casa.porta2.fecha();
        casa.porta3.fecha();

        System.out.println(casa.quantasPortasEstaoAbertas());

        casa.porta1.pinta("Azul");
        casa.porta2.pinta("Vermelho");
        casa.porta3.pinta("Verde");

        System.out.println(casa.porta1.cor);
        System.out.println(casa.porta2.cor);
        System.out.println(casa.porta3.cor);
        
    }
}