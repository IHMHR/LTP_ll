package parte2;
import java.util.*;

public class Exercicio2_2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a = 0, contF = 0, mediaM = 0, contM = 0;
		float maior = 0, menor = 100000, mediaGeral = 0;;
		char sexo;
		//int[] alturas; -- ↓ (Array Dinamico) 
		ArrayList<Float> alturas = new ArrayList<>();
		try {
			do {	
				System.out.println("Informe a altura do " + (a + 1) + "º atleta da delegação (em metros):");
				alturas.add(leia.nextFloat());
				while(alturas.get(a) < 0 && alturas.get(a) > 2.5) {
					System.out.println("Informe a altura do " + (a + 1) + "º atleta da delegação (em metros):");
					alturas.add(leia.nextFloat());
				}
				mediaGeral += alturas.get(a);
				System.out.println("Informe o sexo do " + (a + 1) + "º atleta da delegação (M ou F):");
				sexo = leia.next().charAt(0);
				if (sexo == 'X')
					break;
				else {
					while(sexo != 'F' && sexo != 'M') {
						System.out.println("Informe o sexo do " + (a + 1) + "º atleta da delegação (M ou F):");
						sexo = leia.next().charAt(0);
					}
				}
				if (maior < alturas.get(a)) {
					maior = alturas.get(a);
				}
				if (menor > alturas.get(a)) {
					menor = alturas.get(a);
				}
				if (sexo == 'F')
					contF += 1;
				else {
					mediaM += alturas.get(a);
					contM += 1;
				}
				a++;
			} while (a != -1);
			System.out.println("A maior altura encontrada foi: " + maior + " metros.");
			System.out.println("A menor altura encontrada foi: " + menor + " metros.");
			System.out.println("A quantidade de atletas femininas é: " + contF + ".");
			System.out.println("A média de alturas masculinas é: " + (mediaM / contM) + " metros.");
			System.out.println("A média geral das alturas é: " + Math.round((mediaGeral / alturas.size())) + " metros.");
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		} finally {
			leia.close();
		}
	}
}