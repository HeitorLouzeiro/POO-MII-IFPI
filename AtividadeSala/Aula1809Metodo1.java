 // EXERCICIO 3 - AULA 18/09
/* 
1 - Crie um metodo para demitir um funcionario de uma empresa.
Lembre-se a demissão de um funcionario impacta em alguns atributos da empresa.
(ex. Quantidade de funcionarios, folha salarial, etc.)
*/

/* 2- Ao demitir um funcionario, a empresa deve pagar uma idenização ao funcionario.
essa idenização corresponde a 0,001% do salario do funcionario para cada dia trabalhado.
Crie um metodo que calcule essa idenização e imprima o valor da idenização no momento da demissão. */

/* 3. Crie um metodo que imprima todas as fichas dos funcionarios cadastrados na empresa.
Cada ficha deve mostrar os dados (atributos) dos funcionario. */

/* 4- Crie um metodo que dê um aumento salarial para todos os funcionarios da empresa.Ex: 10% de aumento. */


class Aula1809Metodo1{
	public static void main(String[] args){
		Empresa empresa1 = new Empresa("IFPI", "Promover uma educação de excelência direcionada às demandas sociais.");

		empresa1.adimiteNovoFuncionario("Jurandir", 5000, new Data(01,01,2022));
		empresa1.adimiteNovoFuncionario("Felipinho", 6000, new Data(17,8,2014));
		empresa1.adimiteNovoFuncionario("Tulio", 3000, new Data(02,02,2023));

		System.out.println("O "+empresa1.getNome()+" tem "+empresa1.getContadorDeFuncionarios()+" funcionário(s) e uma folha salarial de R$ "+empresa1.getFolhaSalarial()+".");

		System.out.println(empresa1.getFuncionario(0).getNome()+" tem a matricula = "+empresa1.getFuncionario(0).getIdentificador());
		System.out.println(empresa1.getFuncionario(1).getNome()+" tem a matricula = "+empresa1.getFuncionario(1).getIdentificador());
		System.out.println(empresa1.getFuncionario(2).getNome()+" tem a matricula = "+empresa1.getFuncionario(2).getIdentificador());
		
        /* empresa1.mostrarFuncionario(); */
        empresa1.aumentoSalario(10);
        empresa1.demiteFuncionario(0, new Data(22,03,2022));
        empresa1.mostrarFuncionario();

	}

}



class Empresa{
	private String nome;
	private String slogam;
	private Funcionario[] listaDeFuncionarios;
	private double folhaSalarial;
	private int contadorDeFuncionarios;
    private double indenizacao;

	Empresa(String nome, String slogam){
		this.nome = nome;
		this.slogam = slogam;
		this.listaDeFuncionarios = new Funcionario[100];
	}

    public void mostrarFuncionario(){
        for(int i = 0; i <= contadorDeFuncionarios; i++){
            if (listaDeFuncionarios[i] != null) {
                
                System.out.println("Identificador: " + listaDeFuncionarios[i].getIdentificador());
                System.out.println("Nome: " + listaDeFuncionarios[i].getNome());
                System.out.println("Salário: " + listaDeFuncionarios[i].getSalario());
                System.out.println("Data de entrada: " + listaDeFuncionarios[i].getDataDeEntrada().getData());
                
                if(listaDeFuncionarios[i].getDataDeSaida() == null){
                    System.out.println("Data de saída: Não demitido");
                }else{
                    System.out.println("Data de saída: " + listaDeFuncionarios[i].getDataDeSaida().getData());
                }
            }

        }
    }

	public void adimiteNovoFuncionario(String nome, double salario, Data dataDeEntrada){
		this.listaDeFuncionarios[contadorDeFuncionarios] = new Funcionario(nome, salario, dataDeEntrada);
		folhaSalarial = folhaSalarial + salario;
		incrementaContadorDeFuncionarios();
	}

	public void demiteFuncionario(int id, Data dataDeSaida) {
		Funcionario funcionario = listaDeFuncionarios[id];
		Data dataEntrada = funcionario.getDataDeEntrada();

		int diasTrabalhados = calculaDias(dataEntrada, dataDeSaida);
		double indenizacao = funcionario.getSalario() * (diasTrabalhados * 0.001);

		System.out.println("O funcionário " + funcionario.getNome() + " foi demitido e receberá uma indenização de R$ " + indenizacao + ".");
		
		funcionario.setDataDeSaida(dataDeSaida); // Defina a data de saída após calcular a indenização
		
        // Se quiser remover o funcionário da lista, descomente a linha abaixo
        /* listaDeFuncionarios[id] = null; */
        decrementaContadorDeFuncionarios();
	}

	/* Metodo 1 */
	public int calculaDias(Data dataEntrada, Data dataSaida) {
		int diaEntrada = dataEntrada.getDia();
		int mesEntrada = dataEntrada.getMes();
		int anoEntrada = dataEntrada.getAno();

		int diaSaida = dataSaida.getDia();
		int mesSaida = dataSaida.getMes();
		int anoSaida = dataSaida.getAno();

		int quantidadeDiasAnoEntrada = anoEntrada * 365;
		int quantidadeDiasAnoSaida = anoSaida * 365;

		int totalDiasMesEntrada = 0;
		int totalDiasMesSaida = 0;

		for (int i = 1; i < mesEntrada; i++) {
			totalDiasMesEntrada += diasMes(i);
		}

		for (int i = 1; i < mesSaida; i++) {
			totalDiasMesSaida += diasMes(i);
		}

		int totalDiasEntrada = diaEntrada + totalDiasMesEntrada + quantidadeDiasAnoEntrada;
		int totalDiasSaida = diaSaida + totalDiasMesSaida + quantidadeDiasAnoSaida;

		int diasTrabalhados = totalDiasSaida - totalDiasEntrada;
		return diasTrabalhados;
	}


    private int diasMes(int mes) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28; // Pode ser 29 em anos bissextos
            default:
                System.out.println("Mês inválido");
                return -1; // Ou outro valor que indique um erro
        }
    } 

    public void aumentoSalario(double aumento){
        for(int i = 0; i < contadorDeFuncionarios; i++){

/*             double valorPorcento = aumento/100;
            double resultadoValor = listaDeFuncionarios[i].getSalario() * valorPorcento;
            double resultadoFinal = listaDeFuncionarios[i].getSalario() + resultadoValor;
            listaDeFuncionarios[i].setSalario(resultadoFinal);
            System.out.println("O funcionário "+listaDeFuncionarios[i].getNome()+" recebeu um aumento de "+aumento+"% e seu novo salário é de R$ "+listaDeFuncionarios[i].getSalario()+".");
 */
            listaDeFuncionarios[i].setSalario(listaDeFuncionarios[i].getSalario() + (listaDeFuncionarios[i].getSalario() * (aumento/100)));
            System.out.println("O funcionário "+listaDeFuncionarios[i].getNome()+" recebeu um aumento de "+aumento+"% e seu novo salário é de R$ "+listaDeFuncionarios[i].getSalario()+".");
        }
    }




	private void incrementaContadorDeFuncionarios(){
		contadorDeFuncionarios++;
	}

    private void decrementaContadorDeFuncionarios(){
        contadorDeFuncionarios--;
    }

	public double getFolhaSalarial(){
		return folhaSalarial;
	}

	public int getContadorDeFuncionarios(){
		return contadorDeFuncionarios;
	}

	public String getNome(){
		return nome;
	}

	public Funcionario[] getListaDeFuncionarios(){
		return listaDeFuncionarios;
	}

	public Funcionario getFuncionario(int id){
		return listaDeFuncionarios[id];
	}

}



class Data{
	private int ano;
	private int mes;
	private int dia;
	private int anoAtual;

	Data(int dia, int mes, int ano){
		this.anoAtual = 2023;
		novaData(dia, mes, ano);
	}

	public void novaData(int dia, int mes, int ano){
		if(checaDiaMes(mes,dia) && checaAno(ano)){
			this.ano = ano;
			this.mes = mes;
			this.dia = dia;
		}else{
			System.out.println("Data inválida!");
		}
	}

	private boolean checaAno(int ano){
		if((ano>0) && (ano<=this.anoAtual)){
			return true;
		}else{
			return false;
		}
	}

/*	private boolean checaMes(int mes){
		if((mes>=1) && (mes<=12)){
			return true;
		}else{
			return false;
		}
	}
*/
	private boolean checaDiaMes(int mes, int dia){
		switch (mes){
		case 2:
			if((dia>=1) && (dia<=28)){
				return true;
			}else{
				return false;
			}
		case 1,3,5,7,8,10,12:
			if((dia>=1) && (dia<=31)){
				return true;
			}else{
				return false;
			}
		case 4,6,9,11:
			if((dia>=1) && (dia<=30)){
				return true;
			}else{
				return false;
			}
		default:
			return false;
		}

	}

    public String getData(){
        return dia+"/"+mes+"/"+ano;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

}



class Funcionario{
	private String nome;
	private String departamento;
	private double salario;
	private Data dataDeEntrada;
    private Data dataDeSaida;
	private String rg;
	private boolean estaAtivo;
	private static int contadorDeFuncionarios;
	private int identificador;

	Funcionario(String nome, double salario, Data data){
		incrementaContadorDeFuncionarios();
		this.nome = nome;
		this.salario = salario;
		this.dataDeEntrada = data;
		this.identificador = getContadorDeFuncionarios();
		System.out.println("Funcionário criado!");
	}

	private static void incrementaContadorDeFuncionarios(){
		contadorDeFuncionarios++;
	}

	public void bonifica(double valor){
		this.salario = this.salario + valor;
	}

	public void demite(){
		this.estaAtivo = false;
	}

	public double getSalario(){
		return salario;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public String getNome(){
		return nome;
	}

	public int getIdentificador(){
		return identificador;
	}

	public static int getContadorDeFuncionarios(){
		return contadorDeFuncionarios;
	}

    public Data getDataDeEntrada(){
        return dataDeEntrada;
    }

    public Data getDataDeSaida(){
        return dataDeSaida;
    }

    public void setDataDeSaida(Data dataDeSaida){
        this.dataDeSaida = dataDeSaida;
    }

}