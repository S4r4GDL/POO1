import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cone_Geratriz_Volume_AreaTotal_AreaLateral {
    public static class Cone{
        
        /*Cone
        ----------------------------------------
        altura: double
        raio: double
        ----------------------------------------
        calculaGeratriz(): double 
        calculaVolume(): double
        calculaAreaLateral(): double
        calculaAreaTotal(): double */

        double raio, altura;
        final double PI = 3.14159;
        public Cone(double raio, double altura){

            this.altura = altura;
            this.raio = raio;

        }

        public double calculaGeratriz()
        {
            //(Raiz Quadrada((altura^2 )+(raio^2 )))
            return Math.sqrt(Math.pow(altura, 2) + Math.pow(altura, 2));
        }

        public double calculaAreaLateral(double geratriz)
        {
            //3.1415*raio*geratriz
            return PI * raio * geratriz;
        }

        public double calculaAreaTotal(double geratriz)
        {
            //(3.1415*raio*(geratriz+raio))
            return PI * raio * (geratriz + raio);
        }

        public double calculaVolume(double geratriz)
        {
            //(1.0/3.0*3.1415*raio^2 *altura)
            return 1.0/3.0 * Math.pow(raio, 2) * altura;

        }
        
        
    }
    
    public static boolean maiorQue0 (double x) {

        return x > 0 ;
    }

    public static void main(String[] args) {
        String ler;
        double raio, altura;

        do{
            ler = JOptionPane.showInputDialog( null, "Altura:","Cálculo do Cone", 3);
            altura = Float.parseFloat(ler);
        }while(!(maiorQue0(altura)));

        do{
            ler = JOptionPane.showInputDialog(null,"Raio:","Cálculo do Cone", 3);
            raio = Float.parseFloat(ler);
        }while(!(maiorQue0(raio)));

        Cone c1 = new Cone(raio, altura);

        double geratriz = c1.calculaGeratriz();

        JOptionPane.showMessageDialog(null, "Geratriz: " + c1.calculaGeratriz()+ "\nÁrea lateral: "
         + c1.calculaAreaLateral(geratriz) + "\nÁrea total: " +  c1.calculaAreaTotal(geratriz) + "\nVolume: " + c1.calculaVolume(geratriz));
    }
}
