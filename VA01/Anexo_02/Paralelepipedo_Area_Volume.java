import javax.swing.JOptionPane;

//Sara Gonçalves De Lima

public class Paralelepipedo_Area_Volume {

    public static class Paralelepipedo{

        /*Paralelepípedo
        ----------------------------------------
        altura: double
        largura: double
        comprimento: double
        ----------------------------------------
        calculaVolume(): double
        calculaArea(): double */

        double altura, largura, comprimento;

        public Paralelepipedo(double altura, double largura, double comprimento) {
            this.altura = altura;
            this.largura = largura;
            this.comprimento = comprimento;
        }

        public double calculoVolume(){
            //Volume(altura * comprimento *largura)
            return (altura * comprimento * largura);
        }

        public double calculaArea(){
            //( 2 * (altura * largura + altura * comprimento + largura *comprimento)).
            return( 2 * (altura * largura + altura * comprimento + largura * comprimento));
        }

        

    }

    public static boolean maiorQue0 (double x) {

    return x > 0 ;
    }

    public static void main(String[] args) {
    
        double altura, largura, comprimento;
        String ler;

        do{
            ler = JOptionPane.showInputDialog( null, "Altura:","Cálculo do Paralelepípedo", 3);
            altura = Float.parseFloat(ler);
        }while(!(maiorQue0(altura)));

        do{
            ler = JOptionPane.showInputDialog(null,"Largura:","Cálculo do Paralelepípedo", 3);
            largura = Float.parseFloat(ler);
        }while(!(maiorQue0(largura)));

        do{
            ler = JOptionPane.showInputDialog(null, "Comprimento:","Cálculo do Paralelepípedo", 3);
            comprimento = Float.parseFloat(ler);
        }while(!(maiorQue0(comprimento)));

        Paralelepipedo p1 = new Paralelepipedo(altura, largura, comprimento);

        JOptionPane.showMessageDialog(null, "Volume:" + p1.calculoVolume() + "\nÁrea:" + p1.calculaArea()); 

    }
}
