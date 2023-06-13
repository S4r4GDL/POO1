import javax.swing.JOptionPane;

//Sara Gonçlves de Lima

public class Cilindro_AreaTotal_Area_Volume {
    public static class Cilindro {

        /*Cilíndro
        -------------------------------
        - altura: double
        - raio: double
        -------------------------------
        calculaVolume(): double
        calculaAreaLateral(): double
        calculaAreaTotal(): double */

        double altura, raio;
        final double PI = 3.14159;

        public Cilindro(double altura, double raio){

            this.raio = raio;
            this.altura = altura;    
        }

        //lembrar que as ações ficam fora do construtor!

        public double calculaAreaTotal(){
                //(2*3.1415*raio*(altura+raio))
                return 2.0 * PI * raio * (altura * raio);
            }

            public double calculaAreaLateral(){
                //(2*3.1415*raio*altura)
                return 2.0 * PI * raio * altura;
            }

            public double calculaVolume(){
                //(3.1415*raio*raio*altura)
                return PI * raio * raio * altura;
            }
    }

    public static boolean maiorQue0 (double x) {

        return x > 0 ;
    }

    public static void main(String[] args) {

        String ler;
        double altura, raio;

        do{
            ler = JOptionPane.showInputDialog( null, "Altura:","Cilíndro", 3);
            altura = Float.parseFloat(ler);
        }while(!(maiorQue0(altura)));

        do{
            ler = JOptionPane.showInputDialog(null,"Raio:","Cálculo do Cilíndro", 3);
            raio = Float.parseFloat(ler);
        }while(!(maiorQue0(raio)));

        Cilindro c1 = new Cilindro(altura, raio);

        JOptionPane.showMessageDialog(null,"Área lateral: " + c1.calculaAreaLateral() +"\nÁrea total:" + c1.calculaAreaTotal() + "\nVolume: " + c1.calculaVolume());

    }
}
