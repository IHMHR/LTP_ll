package parte2;
import javax.swing.JOptionPane;

public class Exercicio2_3 {
	public static void main(String[] args) {
		int cod, peças = 0, fabricadas = 0, menor = 1000000, peçasB = 0;
		float sal, gastos = 0;
		char classe;
		try {
			while (true) {
				cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do funcionário:"));
				if (cod == 0) {
					break;
				}
				classe = JOptionPane.showInputDialog("Informe a classe do funcionário:").charAt(0);
				while (classe != 'A' && classe != 'B' && classe != 'C') {
					classe = JOptionPane.showInputDialog("** Informe a classe do funcionário:").charAt(0);
				}
				peças = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de peças fabricadas:"));
				while (peças < 0) {
					peças = Integer.parseInt(JOptionPane.showInputDialog("** Informe o número de peças fabricadas:"));
				}
				
				fabricadas += peças;
				if (menor > peças) {
					menor = cod;
				}
				if (classe == 'B') {
					peçasB += peças;
				}
				if (peças <= 30 && classe == 'A') {
					sal = 500 + (peças*2);
				} else if (peças <= 40 && classe == 'A') {
					sal = (float) (500 + (peças*2.3));
				} else if (peças > 40 && classe == 'A') {
					sal = (float) (500 + (peças*2.8));
				} else if (peças <= 50 && classe == 'C') {
					sal = peças * 40;
				} else if (peças > 50 && classe == 'C') {
					sal = peças * 45;
				} else {
					sal = 1200;
				}
				
				JOptionPane.showMessageDialog(null, "O salário deste funcionário é R$" + sal + ".");
				gastos += sal;
			}
			JOptionPane.showMessageDialog(null, "O total gasto pela empresa com pagamento dos salários é: R$" + gastos + ".\n"
												+ "O total de peças fabricadas pela empresa é: " + fabricadas + ".\n"
												+ "O Código do operário que fabricou o menor número de peças é: " + menor + ".\n"
												+ "O total de peças fabricadas por Colaboradora da Classe B é: " + peçasB + ".");
		} catch (Exception e) {
			System.err.println(e.getMessage().toString());
		}
	}
}