import javax.swing.JOptionPane;

public class IMC_COM_PAINEL{

	public static class Pessoa{

		float altura, peso;

		public Pessoa(float altura, float peso){
			this.altura = altura;
			this.peso = peso;
		}

		public float Imc(){
            return peso / (altura * altura);
        }
		
}
	public static String nivelImc(float imc)
	{
			/*abaixo de 20 abaixo do peso ideal 
			a partir de 20 até 25 peso normal 
			acima de 25 até 30 excesso de peso 
			acima de 30 até 35 obesidade 
			acima de 35 obesidade mórbida
			*/

			if(imc < 20)
			{
				return "Abaixo do peso ideal";
			}
			else if(imc > 19.0 && imc < 26.0)
			{
				return "Peso ideal";
			}	
			else if(imc > 25.0 && imc < 31.0)
			{
				return "Excesso de peso";
			}
			else if(imc > 30.0 && imc < 36.0)
			{
				return "Obesidade";
			}
			else{
				return "Obesidade Mórbida";
			}


	}

	
	public static void main(String args[]){

		String show, name;
		int idade;
		float peso, altura;

		try {

			name = JOptionPane.showInputDialog("Nome:");

			show = JOptionPane.showInputDialog("Idade:");
			idade = Integer.parseInt(show);

			show = JOptionPane.showInputDialog("Peso:");
			peso = Float.parseFloat(show);

			show = JOptionPane.showInputDialog("Altura:");
			altura = Float.parseFloat(show);

			Pessoa p1 = new Pessoa(altura, peso);

			JOptionPane.showMessageDialog(null, "Dados da pessoa\nNome: " + name + "\nIdade: " + idade
						 + "\nPeso: " + peso + "\nAltura: " + altura + "\nIMC: " + p1.Imc() + "\n" + nivelImc(p1.Imc()));
		
			}
		catch (NumberFormatException erro) {

			JOptionPane.showMessageDialog(null, "Erro ao gerar IMC, insira valores válidos!" 
			+ erro.toString());

		}

	}
}