//Sara Gonçalves De Lima

import java.util.Scanner;

public class Esfera_Volume_Area {

    

    public static class Esfera{

        final double PI = 3.14159;
        double raio;
        
        public Esfera(double raio){
            this.raio = raio;
        }

        public double calcularVolume()
        {
            //volume  =((4/3)*3.1415*raio3)
            return (4.0/3.0) * PI * (Math.pow(raio,3));
        }

        public double calcularArea()
        {
            //área total = (4*3.1415*raio2)
            return 4.0 * PI * raio * raio; 
        }
    }

    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double raio;
        do {
            System.out.println("Calcular o volume e a área da esfera:\n Raio:");
            raio = input.nextDouble();
            if (raio <= 0) {
                System.out.println("Raio inválido!");
            }
        } while (raio <= 0);

        Esfera e1 = new Esfera(raio);

        System.out.printf("Área: %f \nVolume: %f", e1.calcularArea(), e1.calcularVolume());
    }

}