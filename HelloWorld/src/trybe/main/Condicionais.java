package trybe.main;
import java.util.Random;

public class Condicionais {
	public static void main(String[] args) { 
		int resultado = resultadoTeste();
		if(resultado > 7) {
			imprimeMensagem("Parabéns! você está na próxima mensagem");
		} else {
			imprimeMensagem("Poxa não foi dessa vez, continue tentando até a próxima");
		}
   }
	// essa função retorna uma nota aleatória de 0 a 10
	static int resultadoTeste() {
		Random random = new Random();
		int numero = random.nextInt(10);
		return numero;
	}
	static void imprimeMensagem(String mensagem) {
		System.out.println(mensagem);
	}
}
