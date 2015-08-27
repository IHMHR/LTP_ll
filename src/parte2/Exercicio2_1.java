package parte2;
import javax.swing.JOptionPane;

public class Exercicio2_1 {
	public static void main(String[] args) {
		
		try {
			String[] nomes = new String[10];
			int[] salarios = new int[10];
			int[] novosSalarios = new int[10];
			int[] dependentes = new int[10];
			for (int i = 0; i <= nomes.length; i++) {
				nomes[i] = JOptionPane.showInputDialog("Informe o nome do " + (i + 1) + "º funcionário:");
				salarios[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o salário do " + (i + 1) + "º funcionário:"));
				dependentes[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de dependentes que o " + (i + 1) + "º funcionário tem:"));
				
				if (salarios[i] <= 1000) {
					novosSalarios[i] = (int) (salarios[i] * 1.3); 
				} else if (salarios[i] < 2000) {
					novosSalarios[i] = (int) (salarios[i] * 1.2);
				} else {
					novosSalarios[i] = (int) (salarios[i] * 1.1);
				}
				switch (dependentes[i]) {
				case 1:
					novosSalarios[i] += 50;  
					break;
				case 2:
					novosSalarios[i] += 100;  
					break;
				case 3:
					novosSalarios[i] += 150;  
					break;
				case 4:
					novosSalarios[i] += 200;  
					break;
				case 5:
					novosSalarios[i] += 250;  
					break;
				case 6:
					novosSalarios[i] += 300;  
					break;
				case 7:
					novosSalarios[i] += 350;  
					break;
				case 8:
					novosSalarios[i] += 400;  
					break;
				case 9:
					novosSalarios[i] += 450;  
					break;
				case 10:
					novosSalarios[i] += 500;  
					break;
				case 11:
					novosSalarios[i] += 550;  
					break;
				case 12:
					novosSalarios[i] += 600;  
					break;
				}
				JOptionPane.showMessageDialog(null, "O novo salário do funcionário é R$" + novosSalarios[i] + ".");
			}
			int soma = 0, cont = 0;
			for (int j = 0; j < dependentes.length; j++) {
				soma += novosSalarios[j];
				if (novosSalarios[j] > 1700) {
					cont += 1;
				}
			}
			JOptionPane.showMessageDialog(null, "A soma dos novos salários é R$" + soma + ".\n"
					+ "A média dos novos salários é R$" + (soma / novosSalarios.length) + ".");
			if (cont != 0) {
				JOptionPane.showMessageDialog(null, "A quantidade de novos salários acima de R$1700,00 é " + cont + " funcionários.");
			} else {
				JOptionPane.showMessageDialog(null, "Nenhum funcionário teve reajuste de salário acima de R$1700,00.");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage().toString());
		}
	}
}