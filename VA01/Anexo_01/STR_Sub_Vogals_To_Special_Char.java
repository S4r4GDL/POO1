import java.util.Scanner;
import javax.swing.JOptionPane;

public class STR_Sub_Vogals_To_Special_Char {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        String Str, StrNew = "";
        Str = JOptionPane.showInputDialog("Insira  o texto:");
        for(int i=0; i < Str.length(); i++)
        {
            if (Str.charAt(i) == 'A' || Str.charAt(i) == 'E' || Str.charAt(i) == 'I' || Str.charAt(i) == 'O' || Str.charAt(i) == 'U' || Str.charAt(i) == 'a' || Str.charAt(i) == 'e' || Str.charAt(i) == 'i' || Str.charAt(i) == 'o' || Str.charAt(i) == 'u')
            {
                StrNew = StrNew + '?';
            }
            else{
                StrNew = StrNew + Str.charAt(i);
            }
        }
        
        JOptionPane.showMessageDialog(null, StrNew);
    }
}