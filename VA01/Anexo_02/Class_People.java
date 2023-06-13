
//Sara Gonçalves de Lima
import java.util.Scanner;
import java.util.Locale;

public class Class_People {
    
    public static class Pessoa {

        String nome;
        int idade;
        float peso, altura;

        public Pessoa(String nome, int idade, float peso, float altura){
            
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;

        }

        public float Imc(){
            return peso / (altura * altura);
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        //Lendo os dados da pessoa
        System.out.println("Nome:");
        String nome = input.nextLine();

        System.out.println("Idade:");
        int idade = input.nextInt();

        System.out.println("Peso:");
        float peso = input.nextFloat();

        System.out.println("Altura:");
        float altura = input.nextFloat();
        
        Pessoa p1 = new Pessoa(nome, idade, peso, altura);
        
        float Imc =  p1.Imc();
        
        System.out.println("Nome:" + nome + "\nIdade:" + idade + "\nPeso:" + peso + "\nAltura:" + altura + "\nIMC: " + Imc);

    }
}
