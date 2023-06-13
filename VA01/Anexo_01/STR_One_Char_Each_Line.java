import java.util.Scanner;

public class STR_One_Char_Each_Line {
    
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite algo:");
        String Str = input.nextLine();

        for (char c : Str.toCharArray()) {
            System.out.println(c);
        }
    }
}
