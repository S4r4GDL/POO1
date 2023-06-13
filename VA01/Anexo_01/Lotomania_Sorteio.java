import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

import javax.swing.JOptionPane;

public class Lotomania_Sorteio {
    
    public static class Lotomania{
        int[] sorteados;

        public Lotomania(int[] sorteados){

            this.sorteados = sorteados;
        }
        
        public int[] getSorteados() {
            Random rand = new Random();

            HashSet<Integer> listaNum = new HashSet<>();

            int i = 0;
            
            while( i <  sorteados.length )
            {
                int numero = rand.nextInt(99)+1;

                if(!listaNum.contains(numero))
                {
                    sorteados[i] = numero;
                    listaNum.add(numero);
                    i++;
                }
                
            }

            return sorteados;
        }

    }
    public static void main(String[] args) {

        int[] sorteados = new int[50];

        Lotomania s1 = new Lotomania(sorteados);


        JOptionPane.showMessageDialog(null, Arrays.toString(s1.getSorteados()));

    }
}
