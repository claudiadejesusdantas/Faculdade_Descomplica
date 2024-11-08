// salvar como ProgRepeticao.java
import javax.swing.*;

class ProgRepeticao{
	public static void main (String args[]){
		int Tabuada;
		char op=0;
		String msg="", msgEntr="Digite:\n 1 para repetição FOR \n 2 para repetição  WHILE \n 3 para repetição DO/WHILE";

		//ENTRADA DE DADOS
		Tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
		
		//PROCESSAMENTO
		switch(op){
			case '1': {
			msg = msg + "Tabuada do " + Tabuada + " pelo for: \n\n";
			for(int i=1; i<=10;i++){
				msg = msg + Tabuada + " x " + i + " = " + Tabuada*i + "\n";
			}
			break;
			}
			case '2': {
			msg = msg + "Tabuada do " + Tabuada + " pelo while: \n\n";
			int i=1;
			while(i<=10){
				msg = msg + Tabuada + " x " + i + " = " + Tabuada*i + "\n";
				i = i+1;
			}
			break;
			}
			case '3': {
			msg = msg + "Tabuada do " + Tabuada + " pelo do/while: \n\n";
			int i = 1;
			do {
				msg = msg + Tabuada + " x " + i + " = " + Tabuada*i + "\n";
				i = i+1;
			} while (i<=10);
			break;
			}
		}
		//SAÍDA DE DADOS
		if ( op >= '1' && op <= '3'){
			JOptionPane.showMessageDialog(null, msg);
		}
		System.exit(0);	
	}
}

