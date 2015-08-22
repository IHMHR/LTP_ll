package parte1;
import java.util.Scanner;

public class Exercicio1_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		try {
			System.out.println("Informe o tempo de casa:");
			byte tempo = leia.nextByte();
			System.out.println("Informe o salário do empregado:");
			double salario = leia.nextDouble();
		
			if (tempo <= 5 && salario <= 300) {
				System.out.println("Colaborador receberá um bônus de R$50,00 e o Desconto do Vale Transporte é de R$" + (salario * .05) + ".");
			} else if (tempo <= 5 && salario > 300) {
				System.out.println("Colaborador receberá um bônus de R$80,00 e o Desconto do Vale Transporte é de R$" + (salario * .06) + ".");
			} else if (tempo <=10 && salario <= 500) {
				System.out.println("Colaborador receberá um bônus de R$" + (salario * .15) + " e o Desconto do Vale Transporte é de R$70,00.");
			} else if (tempo <=10 && salario <= 2000) {
				System.out.println("Colaborador receberá um bônus de R$" + (salario * .13) + " e o Desconto do Vale Transporte é de R$90,00.");
			} else if (tempo <=10 && salario > 2000) {
				System.out.println("Colaborador receberá um bônus de R$" + (salario * .12) + " e o Desconto do Vale Transporte é de R$" + (salario * .08) + ".");
			} else {
				System.out.println("Colaborador receberá um bônus de R$300,00 e o Desconto do Vale Transporte é de R$" + (salario * .04) + ".");
			}			
		} catch (Exception e) {
			System.out.println("Aconteceu alguma coisa errada! ");
		} finally {
			leia.close();
		}
	}
}