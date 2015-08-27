package parte1;

import javax.swing.JOptionPane;

public class Exercicio1_3 {
	public static void main(String[] args) {

		try {
			byte tempo = Byte.parseByte(JOptionPane.showInputDialog("Informe o tempo de casa:"));
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do empregado:"));
		
			if (tempo <= 5 && salario <= 300) {
				JOptionPane.showMessageDialog(null, "Colaborador receberá um bônus de R$50,00 e o Desconto do Vale Transporte é de R$" + (salario * .05) + ".");
			} else if (tempo <= 5 && salario > 300) {
				JOptionPane.showMessageDialog(null, "Colaborador receberá um bônus de R$80,00 e o Desconto do Vale Transporte é de R$" + (salario * .06) + ".");
			} else if (tempo <=10 && salario <= 500) {
				JOptionPane.showMessageDialog(null, "Colaborador receberá um bônus de R$" + (salario * .15) + " e o Desconto do Vale Transporte é de R$70,00.");
			} else if (tempo <=10 && salario <= 2000) {
				JOptionPane.showMessageDialog(null, "Colaborador receberá um bônus de R$" + (salario * .13) + " e o Desconto do Vale Transporte é de R$90,00.");
			} else if (tempo <=10 && salario > 2000) {
				JOptionPane.showMessageDialog(null, "Colaborador receberá um bônus de R$" + (salario * .12) + " e o Desconto do Vale Transporte é de R$" + (salario * .08) + ".");
			} else {
				JOptionPane.showMessageDialog(null, "Colaborador receberá um bônus de R$300,00 e o Desconto do Vale Transporte é de R$" + (salario * .04) + ".");
			}			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Aconteceu alguma coisa errada! ");
		}
	}
}