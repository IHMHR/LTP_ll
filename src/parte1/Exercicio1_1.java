package parte1;
import javax.swing.JOptionPane;

public class Exercicio1_1 {
	public static void main(String[] args) {
		
		try	{
			String aluno = JOptionPane.showInputDialog("Informe o nome do aluno:"); 
			int[] nota = new int[3];
			for(byte i = 1; i <= 3; i++) {
				nota[i-1] = Integer.parseInt(JOptionPane.showInputDialog("Informe a " + i + "º nota do aluno:"));
			}
			
			JOptionPane.showMessageDialog(null, "O aluno " + aluno + " teve uma média: " + (nota[0] + nota[1] + nota[2])/3);

			if((nota[0] + nota[1] + nota[2])/3 <= 4) {
				JOptionPane.showMessageDialog(null, "Aluno Reprovado !");
			} else if((nota[0] + nota[1] + nota[2])/3 >= 7) {
				JOptionPane.showMessageDialog(null, "Aluno Aprovado !");
			} else {
				JOptionPane.showMessageDialog(null, "Aluno em Recuperação !");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage().toString());
		}
	}
}