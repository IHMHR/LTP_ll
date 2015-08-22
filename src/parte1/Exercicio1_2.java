package parte1;
import java.util.Scanner;

public class Exercicio1_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		try {
			int[] lado = new int[3];
			for(byte i = 1; i <= 3; i++) {
				System.out.println("Informe o " + i + "� lado do tri�ngulo:");
				lado[i-1] = leia.nextInt();
			}
		
			if((lado[0]+lado[1]) <= lado[2] && (lado[0]+lado[2]) <= lado[1] && (lado[2]+lado[1]) <= lado[0]) {
				System.out.println("N�o � um tri�ngulo !");
			} else if((lado[0] == lado[1]) && (lado[0] == lado[2])) {
				System.out.println("Este � um tri�ngulo EQUIL�TERO !");
			} else if(((lado[0] == lado[1]) && (lado[1] != lado[2]) || ((lado[1] == lado[2]) && (lado[1] != lado[3])) || ((lado[0] == lado[2]) && (lado[0] != lado[1])))) {
				System.out.println("Este � um tri�ngulo IS�SCELES !");
			} else {
				System.out.println("Este � um tri�ngulo ESCALENO !");
			}
		} catch (Exception e) {
			System.out.println("Aconteceu alguma coisa errada! ");
		} finally {
			
			leia.close();
		}
	}
}