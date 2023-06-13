import java.util.Scanner;

public class STR_Print_Until_N {
    
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite algo: ");
        String Str = input.nextLine();
        
        System.out.println("Digite ate onde imprimir: ");
        int lim = input.nextInt();
        
        if(lim <= Str.length())
        for(int i=0; i< lim; i++)
        System.out.print(Str.charAt(i));
    }
}
