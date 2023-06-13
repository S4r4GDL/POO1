import java.util.Scanner;

/*"5) Escreva um programa em Java que filtre uma String, de forma
 que a partir de uma String lida do teclado, o programa crie uma 
 nova String contendo somente os valores numéricos da
String entrada. Por exemplo, se a String entrada for ”1a2b09cd”, a String resultante deve
ser ”1209”. Dica: você pode usar o método estático isDigit() da classe Character." */

public class STR_Is_Digit{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str1 = input.nextLine();

        char[] newStr = new char[str1.length()];

        int n=0;

        for(int i = 0; i < str1.length(); i++)
        {
            if(Character.isDigit(str1.charAt(i)) )
            { 
                newStr[n] = str1.charAt(i);
                n++;
            }
        }

        String str2 = new String(newStr);

        if(n>0)
        {
            System.out.println(str1 + "\n" + str2);
        }
        else{
            System.out.println("Não há números nesta string!");
        }
    }
}