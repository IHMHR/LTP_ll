package parte1;
import javax.swing.JOptionPane;

public class Exercicio1_2 {
	public static void main(String[] args) {

		try {
			int[] lado = new int[3];
			for(byte i = 1; i <= 3; i++) {
				lado[i-1] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + i + "� lado do tri�ngulo:"));
				
			}
		
			if((lado[0]+lado[1]) <= lado[2] && (lado[0]+lado[2]) <= lado[1] && (lado[2]+lado[1]) <= lado[0]) {
				JOptionPane.showMessageDialog(null, "N�o � um tri�ngulo !");
			} else if((lado[0] == lado[1]) && (lado[0] == lado[2])) {
				JOptionPane.showMessageDialog(null, "Este � um tri�ngulo EQUIL�TERO !");
			} else if(((lado[0] == lado[1]) && (lado[1] != lado[2]) || ((lado[1] == lado[2]) && (lado[1] != lado[3])) || ((lado[0] == lado[2]) && (lado[0] != lado[1])))) {
				JOptionPane.showMessageDialog(null, "Este � um tri�ngulo IS�SCELES !");
			} else {
				JOptionPane.showMessageDialog(null, "Este � um tri�ngulo ESCALENO !");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Aconteceu alguma coisa errada! ");
		}
	}
}