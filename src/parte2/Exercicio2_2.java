package parte2;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exercicio2_2 {
	public static void main(String[] args) {
		int a = 0, contF = 0, mediaM = 0, contM = 0;
		float maior = 0, menor = 100000, mediaGeral = 0;;
		char sexo;
		//int[] alturas; -- ↓ (Array Dinamico) 
		ArrayList<Float> alturas = new ArrayList<>();
		try {
			do {	
				alturas.add(Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do " + (a + 1) + "º atleta da delegação (em metros):").replace(",", 	".")));
				while(alturas.get(a) < 0 && alturas.get(a) > 2.5) {
					alturas.add(Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do " + (a + 1) + "º atleta da delegação (em metros):")));
				}
				mediaGeral += alturas.get(a);
				sexo = JOptionPane.showInputDialog("Informe o sexo do " + (a + 1) + "º atleta da delegação (M ou F):").charAt(0);
				
				if (sexo == 'X')
					break;
				else {
					while(sexo != 'F' && sexo != 'M') {
						sexo = JOptionPane.showInputDialog("Informe o sexo do " + (a + 1) + "º atleta da delegação (M ou F):").charAt(0);						
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
			JOptionPane.showMessageDialog(null, "A maior altura encontrada foi: " + maior + " metros.\n"
												+ "A menor altura encontrada foi: " + menor + " metros.\n"
												+ "A quantidade de atletas femininas é: " + contF + ".\n"
												+ "A média de alturas masculinas é: " + (mediaM / contM) + " metros.\n"
												+ "A média geral das alturas é: " + Math.round((mediaGeral / alturas.size())) + " metros.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage().toString());
		}
	}
}