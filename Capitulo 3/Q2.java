//2 )  Imprima todos os multiplos de 3, entre 1 e 100.
class Q2{
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}