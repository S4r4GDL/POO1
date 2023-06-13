import javax.swing.JOptionPane;

public class Triangulo_Area_Tipo{

    public static class Triangulo{
        double A, B, C;
        public Triangulo(double A, double B, double C)
        {
            this.A = A;
            this.B = B;
            this.C = C;
        }

        public void setA(double A) {
            this.A = A;
        }

        public void setB(double B) {
            this.B = B;
        }

        public void setC(double C) {
            this.C = C;
        }

        public double getA() {
            return A;
        }
        public double getB() {
            return B;
        }
        public double getC() {
            return C;
        }

        public String getTipo()
        {
            if(A + B > C && B + C > A && A + C > B)
            {
                if(A == B && A == C)
                {
                    return "Equilatero";
                }
                else if((A == B) ^ (A == C) ^ (B == C))
                {
                    return "Isóceles";
                }
                else{
                    return "Retangulo";
                }
            }
            else{
                return "Não é triangulo";
            }
        }

        public double getArea()
        {
            //raizQuadrada(T*(T-A)*(T-B)*(T-C)) onde T = (A+B+C)/2. 
            double s = (A + B + C) / 2;
            return Math.sqrt(s * (s - A) * (s - B) * (s - C));
        }

    }
    public static void main(String[] args) {
        
        Triangulo t1 = new Triangulo(0, 0, 0);
        try{

            t1.setA(Double.parseDouble(JOptionPane.showInputDialog("Lado A: ")));
            t1.setB(Double.parseDouble(JOptionPane.showInputDialog("Lado B: ")));
            t1.setC(Double.parseDouble(JOptionPane.showInputDialog("Lado C: ")));

            

            JOptionPane.showMessageDialog(null, "Tipo: " + t1.getTipo() + 
            "\nArea: " + t1.getArea());

        }
        catch(NumberFormatException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro, valores invalidos");
        }

        System.exit(0);

    }
}