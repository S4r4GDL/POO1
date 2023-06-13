import javax.swing.JOptionPane;

public class Conta_Poupanca {
    public static class Conta{

        /*Conta poupança
        ----------------------------------------
        - nome do cliente: string
        - número da conta: int
        - agencia: int
        - saldo: double
        ----------------------------------------
        + sacarDinheiro()
        + depositarDinheiro()*/

        String nome;
        int conta, agencia;
        double saldo;

        public Conta(String nome, int conta, int agencia, double saldo){
            
            this.nome = nome;
            this.conta = conta;
            this.agencia = agencia;
            this.saldo = saldo;
        } 

        public void sacarDinheiro()
        {
            String saca;
            do{
                saca = JOptionPane.showInputDialog(null, "Valor a sacar:", "Conta Poupança", 3);
            }while((Double.parseDouble(saca) > saldo));

            saldo -= Double.parseDouble(saca);
        }
        
        public void depositarDinheiro()
        {
            String deposita;
            do{
                deposita = JOptionPane.showInputDialog(null, "Valor a depositar:", "Conta Poupança", 3);
            }while((Double.parseDouble(deposita) < 1.0));

            saldo += Double.parseDouble(deposita);
        }

    }
    public static boolean maiorQue0 (double x) {

        return x > 0 ;
    }
    
    public static void main(String[] args) {

        String nome, resposta;
        int conta, agencia;
        double saldo;
        
        try {

            nome = JOptionPane.showInputDialog("Nome:");

            resposta = JOptionPane.showInputDialog("Conta:");
            conta = Integer.parseInt(resposta);

            resposta = JOptionPane.showInputDialog("Agencia:");
            agencia = Integer.parseInt(resposta);

            do{
                resposta = JOptionPane.showInputDialog(null,"Saldo:","Conta poupança", 3);
                saldo = Double.parseDouble(resposta);
                if(saldo <= 0 )
                {
                    JOptionPane.showMessageDialog(null, "Valor inválido!\nDidite um valor acima de 0");
                }
            }while(!(maiorQue0(saldo)));

            Conta c1 = new Conta(nome, conta, agencia, saldo);
            
            String[] op = {"Sacar", "Depositar"};
            resposta = (String) JOptionPane.showInputDialog(null, "Selecione a operação:\n", "Conta poupança", JOptionPane.PLAIN_MESSAGE, null, op, op[0]);

            if(resposta.equals("Sacar"))
            {
                c1.sacarDinheiro();
            }
            else if(resposta.equals("Depositar"))
            {
                c1.depositarDinheiro();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Você cancelou a operação");
                System.exit(1);
            }

            JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nConta:" + conta + "\nAgencia:" + agencia + "\nSaldo:" + c1.saldo);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite valores válidos!!" + erro);
        }
        System.exit(0);
    }
}
