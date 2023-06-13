//Sara Gonçalves de Lima
import java.util.Scanner;

public class Retangulo_Perimetro_Area {
    
    public static class Retangulo {
        double  comprimento, largura;
        
        public Retangulo(double comprimento, double largura){
            this.comprimento = comprimento;
            this.largura = largura;
        }

        public double calcularPerimetro()
        {
            //perímetro (soma dos quatro lados)
            return (comprimento*2) + (largura*2);
        }

        public double calcularArea()
        {
            //cálculo da área (largura * comprimento)
            return largura * comprimento; 
        }

    }
    public static boolean MaiorQue0 (double x) {

        return x > 0 ;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double comprimento, largura;
        
        System.out.println("Calcular a área e o perímetro do retângulo :\n(os valores devem ser maiores  que 0):");
        
        do{
            System.out.println("comprimento");
            //verifica maior que 0
        }while(!(MaiorQue0(comprimento = input.nextDouble())));

        do{
            System.out.println("largura:");
            //verifica maior que 0
        }while(!(MaiorQue0(largura = input.nextDouble())));

        Retangulo ret = new Retangulo(comprimento, largura);

        System.out.printf("Área: %f\nPerímetro: %f", ret.calcularArea(), ret.calcularPerimetro());

    }
}
