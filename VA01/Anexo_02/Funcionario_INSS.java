import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class Funcionario_INSS{
    public static class Funcionario{
        /* Funcionário
        ----------------------------------------
        - nome do funcionario: string
        - numero de filhos: int
        - salario: float
        ----------------------------------------
        + aumentoSalario()
        + descontoImposto()
        + inss() */        

        String nome;
        int filhos;
        float salario;

        public Funcionario(String nome, int filhos, float salario)
        {
            this.filhos = filhos;
            this.salario = salario;
            this.nome = nome;
        }

        public void setFilhos(int filhos) {
            this.filhos = filhos;
        }
        public int getFilhos() {
            return filhos;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome() {
            return nome;
        }

        public void setSalario(float salario) {
            this.salario = salario;
        }
        public float getSalario() {
            return salario;
        }

        public float aumentoSalario(float aumento)
        {
            return salario + (salario * aumento);
        }

        public float descontoImposto()
        {
            //(R$1250,25 por filho)
            float desconto = salario - (filhos * (float)1250.25);
            if (desconto < 0) {
                return 0;
            }
            return desconto;
            

        }

        public float inss()
        {
            // ( 6% para salário <= R$2545,00 e 10% para o restante).
            if(salario <= 2545.00)
            {
                return salario - (salario * (float)0.06);
            }
            return salario - (salario * (float)0.1);
            
        }
        
    }

    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario(null, 0, 0);

        f1.setNome(JOptionPane.showInputDialog("Nome: "));
        f1.setFilhos(Integer.parseInt(JOptionPane.showInputDialog("Filhos: ")));
        f1.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salario: ")));

        float aumento = Float.parseFloat(JOptionPane.showInputDialog("Aumento de (ex: 12%): ")) ;

        JOptionPane.showMessageDialog(null, "Salario com Aumento:"
         + f1.aumentoSalario(aumento) 
         + "\n Desconto imposto de renda: "
         + f1.descontoImposto()
         + "\n Com desconto do Inss: "
         + f1.inss());


    }
}

