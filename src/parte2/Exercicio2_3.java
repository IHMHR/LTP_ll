package parte2;
import javax.swing.JOptionPane;

public class Exercicio2_3 {
	public static void main(String[] args) {
		int cod, pe�as = 0, fabricadas = 0, menor = 1000000, pe�asB = 0;
		float sal, gastos = 0;
		char classe;
		try {
			while (true) {
				cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo do funcion�rio:"));
				if (cod == 0) {
					break;
				}
				classe = JOptionPane.showInputDialog("Informe a classe do funcion�rio:").charAt(0);
				while (classe != 'A' && classe != 'B' && classe != 'C') {
					classe = JOptionPane.showInputDialog("** Informe a classe do funcion�rio:").charAt(0);
				}
				pe�as = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de pe�as fabricadas:"));
				while (pe�as < 0) {
					pe�as = Integer.parseInt(JOptionPane.showInputDialog("** Informe o n�mero de pe�as fabricadas:"));
				}
				
				fabricadas += pe�as;
				if (menor > pe�as) {
					menor = cod;
				}
				if (classe == 'B') {
					pe�asB += pe�as;
				}
				if (pe�as <= 30 && classe == 'A') {
					sal = 500 + (pe�as*2);
				} else if (pe�as <= 40 && classe == 'A') {
					sal = (float) (500 + (pe�as*2.3));
				} else if (pe�as > 40 && classe == 'A') {
					sal = (float) (500 + (pe�as*2.8));
				} else if (pe�as <= 50 && classe == 'C') {
					sal = pe�as * 40;
				} else if (pe�as > 50 && classe == 'C') {
					sal = pe�as * 45;
				} else {
					sal = 1200;
				}
				
				JOptionPane.showMessageDialog(null, "O sal�rio deste funcion�rio � R$" + sal + ".");
				gastos += sal;
			}
			JOptionPane.showMessageDialog(null, "O total gasto pela empresa com pagamento dos sal�rios �: R$" + gastos + ".\n"
												+ "O total de pe�as fabricadas pela empresa �: " + fabricadas + ".\n"
												+ "O C�digo do oper�rio que fabricou o menor n�mero de pe�as �: " + menor + ".\n"
												+ "O total de pe�as fabricadas por Colaboradora da Classe B �: " + pe�asB + ".");
		} catch (Exception e) {
			System.err.println(e.getMessage().toString());
		}
	}
}