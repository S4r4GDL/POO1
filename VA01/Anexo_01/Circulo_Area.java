import java.util.Scanner;

/*7) Escreva um programa que calcule a área de um círculo,
usando o valor constante de pi e o valor do raio lido do teclado. */

 public class Circulo_Area {
    public static class Circulo{

        final double PI = 3.14159;
        double raio;
        
        public Circulo(double raio){
            this.raio = raio;
        }

        public double getArea()
        {
            //área total = (3.1415*raio2)
            return PI * raio * raio; 
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double raio;
        do {
            System.out.println("Calcular a área do circulo:\n Raio:");
            raio = input.nextDouble();
            if (raio <= 0) {
                System.out.println("Raio inválido!");
            }
        } while (raio <= 0);

        Circulo c1 = new Circulo(raio);

        System.out.printf("Área: %f", c1.getArea());
    }

}
