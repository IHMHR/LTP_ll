package parte2;
import java.util.*;
import javax.swing.JOptionPane;

public class Exercicio2_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cod, peças = 0, fabricadas = 0, menor = 1000000, peçasB = 0;
		float sal, gastos = 0;
		char classe;
		try {
			while (true) {
				System.out.println("Informe o código do funcionário:");
				cod = in.nextInt();
				if (cod == 0) {
					break;
				}
				System.out.println("Informe a classe do funcionário:");
				classe = in.next().charAt(0);
				while (classe != 'A' && classe != 'B' && classe != 'C') {
					System.out.println("** Informe a classe do funcionário:");
					classe = in.next().charAt(0);
				}
				System.out.println("Informe o número de peças fabricadas:");
				peças = in.nextInt();				
				while (peças < 0) {
					System.out.println("** Informe o número de peças fabricadas:");
					peças = in.nextInt();
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
				
				System.out.println("O salário deste funcionário é R$" + sal + ".");
				System.out.println();
				gastos += sal;
			}
			System.out.println("O total gasto pela empresa com pagamento dos salários é: R$" + gastos + ".");
			System.out.println("O total de peças fabricadas pela empresa é: " + fabricadas + ".");
			System.out.println("O Código do operário que fabricou o menor número de peças é: " + menor + ".");
			System.out.println("O total de peças fabricadas por Colaboradora da Classe B é: " + peçasB + ".");
		} catch (Exception e) {
			System.err.println(e.getMessage().toString());
		} finally {
			in.close();
		}
	}
}