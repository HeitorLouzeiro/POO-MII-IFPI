/* 1) Programa 1
Classe: Pessoa Atributos: nome, idade. Método: void fazAniversario()
Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns aniversários (aumentando a idade) e 
imprima seu nome e sua idade. */

class Pessoa{
    String nome;
    int idade;

    void fazAniversario(){
        // this.idade += 1;
        this.idade++;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "João";
        pessoa.idade = 20;

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);

        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
    }
}