package parte2;
import java.util.*;
import javax.swing.JOptionPane;

public class Exercicio2_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cod, pe�as = 0, fabricadas = 0, menor = 1000000, pe�asB = 0;
		float sal, gastos = 0;
		char classe;
		try {
			while (true) {
				System.out.println("Informe o c�digo do funcion�rio:");
				cod = in.nextInt();
				if (cod == 0) {
					break;
				}
				System.out.println("Informe a classe do funcion�rio:");
				classe = in.next().charAt(0);
				while (classe != 'A' && classe != 'B' && classe != 'C') {
					System.out.println("** Informe a classe do funcion�rio:");
					classe = in.next().charAt(0);
				}
				System.out.println("Informe o n�mero de pe�as fabricadas:");
				pe�as = in.nextInt();				
				while (pe�as < 0) {
					System.out.println("** Informe o n�mero de pe�as fabricadas:");
					pe�as = in.nextInt();
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
				
				System.out.println("O sal�rio deste funcion�rio � R$" + sal + ".");
				System.out.println();
				gastos += sal;
			}
			System.out.println("O total gasto pela empresa com pagamento dos sal�rios �: R$" + gastos + ".");
			System.out.println("O total de pe�as fabricadas pela empresa �: " + fabricadas + ".");
			System.out.println("O C�digo do oper�rio que fabricou o menor n�mero de pe�as �: " + menor + ".");
			System.out.println("O total de pe�as fabricadas por Colaboradora da Classe B �: " + pe�asB + ".");
		} catch (Exception e) {
			System.err.println(e.getMessage().toString());
		} finally {
			in.close();
		}
	}
}