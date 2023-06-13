import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Funcionarios {
    
    public static class Funcionario {
        private String nome, cpf;
        private float valorHora, horas;

        public Funcionario(String nome, String cpf, float valorHora, float horas){

            this.nome = nome;
            this.cpf = cpf;
            this.valorHora = valorHora;
            this.horas = horas;

        }
        public void setName(String nome)
        {
            this.nome = nome;
        }

        public String getNome()
        {
            return nome;
        }

        public void setCpf(String cpf)
        {
            this.cpf = cpf;
        }

        public String getCpf()
        {
            return cpf;'                                                                                                                                                                                                                                                                                                                    '
        }

        public void setValorHora(float valorHora)
        {
            this.valorHora = valorHora;
        }

        public float getValorHora()
        {
            return valorHora;
        }

        public void setHoras(float horas)
        {
            this.horas = horas;
        }

        public float getHoras()
        {
            return horas;
        }

        public float calcularSalario()
        {
            return horas * valorHora;
        }


        
    }

    
    public static boolean cpfValido(String cpf)
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
    
    public static void main(String[] args) {

        try{

        /*DataInputStream input = new DataInputStream(System.in);
        System.out.println("Nome do funcionário:\n");
        String nome = input.readLine();
        System.out.println("Nome do funcionário:" + nome);*/

        /*BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nome do funcionário:\n");
        String nome = input.readLine();
        System.out.println("Nome do funcionário:" + nome);*/

        /*Scanner input = new Scanner(System.in);
        System.out.println("Nome do funcionário:\n");
        String nome = input.nextLine();
        System.out.println("Nome do funcionário:" + nome);*/
        String cpf;
        String nome = JOptionPane.showInputDialog("Nome do funcionário:");

        do {
            cpf = JOptionPane.showInputDialog("Cpf do funcionário:");
        } while (!cpfValido(cpf));

        float horas = Float.parseFloat(JOptionPane.showInputDialog("Horas trabalhadas:"));
        float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor da hora:"));

        Funcionario f1 = new Funcionario(nome, cpf, valorHora, horas);

        JOptionPane.showMessageDialog(null, 
        "Nome: " + f1.getNome() +
        "\nCpf: " + f1.getCpf() +
        "\nHoras trabalhadas: " + f1.getHoras() +
        "\nValor da hora: " + f1.getValorHora() +
        "\nSalário: " + f1.calcularSalario());


        }
        /*catch(IOException erro)
        {
            System.out.println("Erro na entrada de dados" + erro.toString() );
        }*/
        catch(NumberFormatException erro){
            System.out.println("Erro na conversão, formato inválido!" + erro.toString() );
        }

        System.exit(0);
    }
}
