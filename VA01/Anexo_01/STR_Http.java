import java.util.Scanner;

/*6) Escreva um programa em Java que tenha um método chamado é URL que recebe uma 
String como argumento e verdadeiro se esta String começa com ”http:” ou ”ftp:” 
ou falso caso contrário. */

public class STR_Http {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        if(str.startsWith("http:") || str.startsWith("ftp:"))
        {
            System.out.println(str + " é valido!");
        }
        else{
            System.out.println(str + " não é valido!");
        }
    }
}
 