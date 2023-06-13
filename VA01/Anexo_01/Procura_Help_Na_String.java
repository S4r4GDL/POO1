import javax.swing.JOptionPane;

public class Procura_Help_Na_String {
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Digite a frase");

        if(frase.contains("-help"))
        {
            JOptionPane.showMessageDialog(null, "Há -help na frase");

        }
        else if(frase.contains("-h"))
        {
            JOptionPane.showMessageDialog(null, "Há -h na frase");

        }
        else{
            JOptionPane.showMessageDialog(null, "Não há -help ou -h na frase");
        }
       
    }
}
