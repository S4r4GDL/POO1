import java.util.Scanner;

//Sara Gonçalves de Lima
public class STR_More_Than_10 {
    public static void main(String[] args)
    {
        int tam, i = 0, n=0;
        Scanner input = new Scanner(System.in);

        do{
            
            System.out.println("Digite algo");
            String Str = input.nextLine();
            tam = Str.length();
            if(tam < 10)
            {
                for(i = tam; i<10; i++)
                {
                    Str = Str + '*';
                }

            }

            n++;

            System.out.println(Str);

        } while(tam<10 && n < 5);
        
        
    }

}
