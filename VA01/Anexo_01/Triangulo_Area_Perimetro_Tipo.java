import javax.swing.JOptionPane;

public class Triangulo_Area_Perimetro_Tipo{

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

        public int getTipo()
        {
            if(A + B > C && B + C > A && A + C > B)
            {
                if(A == B && A == C)
                {
                    return 3;
                }
                else if((A == B) ^ (A == C) ^ (B == C))
                {
                    return 2;
                }
                else{
                    return 1;
                }
            }
            else{
                return -1;
            }
        }

        public double getArea()
        {
            double s = (A + B + C) / 2;
            return Math.sqrt(s * (s - A) * (s - B) * (s - C));
        }

        public double getAltura()
        {
            return (2 * getArea()) / B;
        }

        public double getPerimetro()
        {
            return A + B + C;
        }

    }
    public static void main(String[] args) {
        
        double A, B, C;
        try{

            A = Double.parseDouble(JOptionPane.showInputDialog("Lado A: "));
            B = Double.parseDouble(JOptionPane.showInputDialog("Lado B: "));
            C = Double.parseDouble(JOptionPane.showInputDialog("Lado C: "));

            Triangulo t1 = new Triangulo(A, B, C);

            JOptionPane.showMessageDialog(null, "Tipo: " + t1.getTipo() + 
            "\nArea: " + t1.getArea() + 
            "\nPerimetro: " + t1.getPerimetro());

        }
        catch(NumberFormatException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro, valores invalidos");
        }

        System.exit(0);

    }
}