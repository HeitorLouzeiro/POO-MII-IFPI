/*4 )  Aumente a quantidade de n u meros que tera o os fatoriais impressos, ate 20, 30, 40. Em um 
determinado momento, al e m desse calculo demorar, vai comecar a mostrar respostas 
completamente erradas. Por que ? Mude de int para long , e voce podera ver alguma mudanca.  */ 
class Q4 {
    public static void main(String[] args) {
        long fatorial = 1;
        for(int i = 1; i <= 40; i++){
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }        
        System.out.println("Ocorre um estouro de memoria, pois o tipo int suporta apenas 32 bits(4294967295),\r\n" + //
                "e o tipo long suporta 64 bits .");
    }
}
/* 
Ocorre um estouro de memoria, pois o tipo int suporta apenas 32 bits(4294967295),
e o tipo long suporta 64 bits .
*/ 