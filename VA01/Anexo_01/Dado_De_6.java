import java.util.Random;
import java.util.Scanner;

public class Dado_De_6 {
    public static class Dado
    {
        int lados;

        public Dado(int lados)
        {
            this.lados = lados;
        }

        public void setlado(int lados)
        {
            this.lados = lados;
        }

        public int getlado()
        {
            return lados;
        }
        
        public int sorteia()
        {
            Random rand = new Random();
            return  rand.nextInt(lados);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lados;
        do {
            System.out.println("Sorteia dado\n Quantos lados?\n");
            lados = input.nextInt();
            if (lados <= 0) {
                System.out.println("Dado inválido! Deve ser maior que 3");
            }
        } while (lados <= 0);

        Dado dado = new Dado(lados);

        System.out.printf("Dado de %d lados\nNúmero sorteado: %d", dado.getlado(), dado.sorteia());
    }
}
