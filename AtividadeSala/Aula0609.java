/* 
    Covertendo um número decimal para binário.
*/
public class Aula0609 {
    public static void main(String[] args) {
        int valor = 14;
        int[] binario = new int[32]; // Comprimento máximo de 32 bits

        int indice = 0; // Variável para rastrear a posição atual no array

        while (valor != 0) {
            int resto = valor % 2;
            binario[indice] = resto; // Armazena o dígito binário no array
            valor /= 2;
            indice++; // Incrementa o índice.
        }

        // Imprime os dígitos binários do array (começando pelo final).
        for (int i = indice - 1; i >= 0; i--) {
            System.out.print(binario[i]);
            
        }
        /* Exemplo:
            while(valor != 0){
                14 / 2 = 7, resto 0
                indice = 0
                7 / 2 = 3, resto 1
                indice = 1
                3 / 2 = 1, resto 1
                indice = 2
                1 / 2 = 0, resto 1
                indice = 3
            }
            for(int i = 3; i >= 0; i--){
                System.out.print(binario[i]);

                i = 3, binario[3] = 1
                i = 2, binario[2] = 1
                i = 1, binario[1] = 1
                i = 0, binario[0] = 0
            }
         */
    }
}