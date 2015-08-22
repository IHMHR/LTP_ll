package parte1;
import java.util.*;

public class Exercicio1_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		try	{
			System.out.println("Informe o nome do aluno:");
			String aluno = leia.nextLine();
			int[] nota = new int[3];
			for(byte i = 1; i <= 3; i++) {
				System.out.println("Informe a " + i + "º nota do aluno:");
				nota[i-1] = leia.nextInt();
			}
			
			System.out.println("O aluno " + aluno + " teve uma média: " + ((nota[0] + nota[1] + nota[2])/3));

			if((nota[0] + nota[1] + nota[2])/3 <= 4) {
				System.out.println("Aluno Reprovado !");
			} else if((nota[0] + nota[1] + nota[2])/3 >= 7) {
				System.out.println("Aluno Aprovado !");
			} else {
				System.out.println("Aluno em Recuperação !");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		} finally {
			leia.close();
		}
		
	}
}