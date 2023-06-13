import java.util.Scanner;

public class Valida_CPF {
    public static class CPF{
        String cpf;

        public CPF(String cpf)
        {
            this.cpf = cpf;
        }
        public String getCpf() {
            return cpf;
        }
        public void setCpf(String cpf) {

            this.cpf = cpf;

        }
        public boolean cpfValido()
        {
            boolean cpfFormato = cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11}|\\d{3}-\\d{3}-\\d{3}-\\d{2}");
            int cont = 0;
            for(int i = 0; i < cpf.length() ; i++)
            {
                if(Character.isDigit(cpf.charAt(i)))
                {
                    cont++;
                }
            }
            if(cont == 11 && cpfFormato)
            {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o CPF a ser validado: ");
        String cpf = input.next();

        CPF cpfObj = new CPF(cpf);

        if (cpfObj.cpfValido()) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }

        input.close();
    }


}
