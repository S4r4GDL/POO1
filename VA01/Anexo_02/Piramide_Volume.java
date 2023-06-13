import java.util.Scanner;

public class Piramide_Volume {
    
    public static class Piramide{
        double altura, base;
        public Piramide( double altura, double base){
            this.altura = altura;
            this.base = base;
        }
        public double calcularVolume()
        {
            //volume da piramide: (1/3 *  base * altura) 
            return (1.0/3.0 * base * altura);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calcular o volume da piramide:\n Altura:");
        double altura = input.nextDouble();

        System.out.println("Base: ");
        double base = input.nextDouble();

        Piramide p1 = new Piramide(altura, base);

        System.out.println("O volume é: " + p1.calcularVolume());
    }
}
