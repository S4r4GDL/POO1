import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Array_De_Strings {
    public static void main(String[] args) {

        String[] lista = new String[5];
        int cont = 0;

        for(int i = 0; i < 5 ; i++)
        {
            lista[i] = JOptionPane.showInputDialog("Digite a " + (i+1) + "° string: ");

            if(lista[i].length() < 10)
            {
                cont++;
            }
        }

        JOptionPane.showMessageDialog(null, "Palavras com menos de 10 caracteres" + cont);
    }
}
