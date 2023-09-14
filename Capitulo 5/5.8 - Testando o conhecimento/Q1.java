/* 1) O objetivo dos exercícios a seguir é fixar os conceitos vistos até agora. 
Se você está com dificuldade em alguma parte desse capítulo, aproveite e 
treine tudo o que vimos até agora no pequeno programa abaixo:
• Programa:
Classe: Casa 
Atributos: 
cor, 
totalDePortas,
portas[] Métodos: 
void pinta(String s),
int quantasPortasEstaoAbertas(),
 void adicionaPorta(Porta p), 
 int totalDePortas()
Crie uma casa, pinte-a. 
Crie três portas e coloque-as na casa através do método adicionaPorta,
abra e feche-as como desejar.
Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas 
abertas e o método totalDePortas para imprimir o total de portas em sua casa. */

class Casa{
    String cor;
    int totalDePortas;
    Porta[] portas = new Porta[3];

    void pinta(String s){
        this.cor = s;
    }
    int quantasPortasEstaoAbertas(){
        int cont = 0;
        for(int i = 0; i < this.portas.length; i++){
            if(this.portas[i].estaAberta()){
                cont++;
            }
        }
        return cont;
    }
    void adicionaPorta(Porta p){
        for(int i = 0; i < this.portas.length; i++){
            if(this.portas[i] == null){
                this.portas[i] = p;
                break;
            }
        }
    }
    int totalDePortas(){
        return this.portas.length;
    }
}

class Porta{
    boolean aberta;
    String cor;

    void abre(){
        this.aberta = true;
    }
    void fecha(){
        this.aberta = false;
    }
    void pinta(String s){
        this.cor = s;
    }
    boolean estaAberta(){
        return this.aberta;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Casa minhaCasa = new Casa();
        minhaCasa.pinta("Azul");
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();
        porta1.abre();
        porta2.abre();
        porta3.fecha();
        minhaCasa.adicionaPorta(porta1);
        minhaCasa.adicionaPorta(porta2);
        minhaCasa.adicionaPorta(porta3);
        System.out.println("Quantidade de portas abertas: " + minhaCasa.quantasPortasEstaoAbertas());
        System.out.println("Total de portas: " + minhaCasa.totalDePortas());
    }
}