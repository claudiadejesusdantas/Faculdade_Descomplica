//salvar como ProgrDecisao.java

import javax.swing.*;

class ProgDecisao {
	public static void main (String args[]) {
		int num;
		char op=0;
		String msg="", msgEntr="Digite 1 para par/ímpar \n Ou 2 para positivo/negativo.";
		
		//ENTRADA DE DADOS
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
		
		//PROCESSAMENTO
		switch(op) {
			case '1': {
				if(num % 2 == 0) {
					msg = msg + num + " é par. \n";
				}
				else{
					msg = msg + num + " é ímpar. \n";
				}
				break;				
			}
			case '2': {
				if(num > 0) {
					msg = msg + num + " é positivo. \n";
				}
				else{
					msg = msg + num + " é negativo. \n";
				}
				break;
			}
		}
		
		
		//SAÍDA DE DADOS
		if ( op == '1' || op == '2') {
			JOptionPane.showMessageDialog(null, msg);
		}
		
		System.exit(0);
	}
}
