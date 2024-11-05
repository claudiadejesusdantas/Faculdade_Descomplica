import javax.swing.*;

class atividadePratica14c {
	public static void main (String args[]){
		//declaração de variáveis
		int n1,n2;
		double  quociente, potencia;
		String msg="";
	
		//entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
		
		//processamento
		quociente = n1/n2;
		potencia = Math.pow(n1,n2);
		
		//saída de dados
		msg = "O número 1 é: "+ n1 + " e o número 2 é: "+ n2 +"\n";
		msg = msg+ "O valor do quociente é: "+quociente+".\n";
		msg = msg+ "O valor da potência é: "+potencia+".\n";				
		JOptionPane.showMessageDialog(null, msg);
		
		System.exit(0);
	}
}
