import javax.swing.JOptionPane;

public class Calculadora{
    public static class Calculo
    {
        double A, B;
        char operador;

        public Calculo(double A, double B, char operador)
        {
            this.A = A;
            this.B = B;
            this.operador = operador;
        }

        public void setA(double A) {
            this.A = A;
        }

        public double getA() {
            return A;
        }

        public void setB(double B) {
            this.B = B;
        }

        public double getB() {
            return B;
        }

        public void setOperador(char operador) {
            this.operador = operador;
        }

        public char getOperador() {
            return operador;
        }

        public double calcular()
        {
            switch(operador)
            {
                case '+' :
                    return A + B;

                case '-' :
                    return A - B;

                case '*' :
                    return A * B;

                case '/' :
                    return A / B;

                default: return -1;

            }
            
        }


    }

   
    public static void main(String[] args) {
        Calculo C1 = new Calculo(0, 0, '+');
        C1.setA(Double.parseDouble(JOptionPane.showInputDialog(null, "1º número")));
        C1.setB(Double.parseDouble(JOptionPane.showInputDialog(null, "2º número")));
        C1.setOperador((JOptionPane.showInputDialog(null, "Operação").charAt(0)));

        JOptionPane.showMessageDialog(null, String.valueOf(C1.calcular()), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}