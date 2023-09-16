/* 8) (opcional) Como garantir que datas como 31/2/2005 não sejam aceitas pela sua classe Data? */

class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            System.out.println("Mês invalido");
           
        }

        if (ano < 0) {
            System.out.println("Ano invalido");
            
        }

        // Verifica se o dia é válido de acordo com o mês
        if (dia < 1 || dia > diasNoMes(mes, ano)) {
            System.out.println("Dia invalido");

        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getData() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    // Método auxiliar para determinar o número de dias em um mês
    private int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 31;
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Data data = new Data(31, 2, 2005);
        System.out.println(data.getData());
    }
}

