// salvar como ProgRepeticao2.java
import javax.swing.*;

class Prog5{
	public static void main (String entrada[]){
		int n1,n2,soma=0;
		char op=0;
		String msg="", msgEntr="Digite \n 1 para adição \n 2 para somatória: \n";
		
		//entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
		op = (JOptionPane.showInputDialog(msgEntr).charAt(0));
		
		//processamento
		
		switch(op){
			case'1': {
				if(n1%2==0 && n1%2==0){
					soma = n1+n2;
					msg = msg + "Soma de "+ n1 + " por " + n2 + " = " + soma + "\n\n";
				} 
				break;
			}
			case'2': {
				for(int i=1; i<=n2; i=i+1){
					soma = soma + n1;
				}
				msg = msg + "Somatória de " + n1 + ", " + n2 + " vezes é: " + soma + "\n\n";
				break;
			}
			default:JOptionPane.showMessageDialog(null, "Opção inválida, cálculos não realizados");
		}
		
		// saída de resultados
		if (op >= '1' && op <='3') {
			JOptionPane.showMessageDialog(null,msg);
		}
		System.exit(0);
	}
}
