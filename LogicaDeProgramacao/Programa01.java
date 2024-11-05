//salvar como Programa01.java

class Programa01{
	public static void main (String args[]){
		//declaração de variáveis
		int NumInt;
		double NumReal, soma;
		char Caracter;
		
		//entrada de dados
		NumInt = Integer.parseInt(args[0]);
		NumReal = Double.parseDouble(args[1]);
		Caracter =(args[2]).charAt(0);
		
		//processamento
		soma = (double)NumInt + NumReal;
		
		//saída de resultados
		System.out.println((double)NumInt + " + " + NumReal + " = " + soma + ". O Sinal é: "+ Caracter);
		
		System.exit(0);
	}
}
