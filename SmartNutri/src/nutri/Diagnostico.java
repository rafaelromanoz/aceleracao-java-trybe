package nutri;
import java.util.Scanner;
public class Diagnostico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avaliacao instanciaDeAvaliacao = new Avaliacao();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o seu peso?");
		String pesoEntrada = scan.next();
		
		System.out.println("Qual a sua altura");
		String alturaEntrada = scan.next();
		
		System.out.println("Peso: " + pesoEntrada + "altura: " + alturaEntrada);
		
		double peso = Double.parseDouble(pesoEntrada);
		double altura = Double.parseDouble(alturaEntrada);
		
		instanciaDeAvaliacao.calcularIMC(peso, altura);
		
		scan.close();
	}

}
