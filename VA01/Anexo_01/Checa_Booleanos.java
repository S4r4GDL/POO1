import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.BoldAction;

public class Checa_Booleanos {
    
    public static class Booleanos{

        boolean[] boos; 
        

        public Booleanos(boolean[] boos)
        {
            this.boos = boos;
        }

        public boolean[] getBoos() {
            
            return boos;
        }


        public void setArray()
        {
            for(int i = 0; i < boos.length; i++)
            {
                boos[i] = input.nextBoolean();
            }
        }
        public int getTrue()
        {
            int cont = 0;
            for(int i = 0; i < boos.length; i++)
            {
                if(boos[i])
                {
                    cont++;
                }
            }
            return cont;
        }
    }
    public static void main(String[] args) {

        boolean[] boos = new boolean[5];
        Scanner input = new Scanner(System.in);

        Booleanos b1 = new Booleanos(boos);
        setArray();        
        System.out.println( Arrays.toString(b1.getBoos()) + "\nTrue: " + b1.getTrue());
        
        
    }
}
