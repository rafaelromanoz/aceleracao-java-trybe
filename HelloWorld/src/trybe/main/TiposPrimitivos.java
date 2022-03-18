package trybe.main;

public class TiposPrimitivos { 
	   
    public static void main(String[] args) { 
    	StringBuilder stringBuilder = new StringBuilder();
    	double[] arrayDoubles = new double[9];
    	arrayDoubles[0] = 2.7;
    	String[] arrayDeString= {"na trybe", "Partiu", "Java", "aprender "};
    	int[][] matriz = new int[2][3];
    	matriz[0][0] = 10;
    	matriz[1][0] = 20;
    	short num = 300; 
        short formatadaComUnderscore = 20_000; // variável  
        System.out.println(num); 
        System.out.println(formatadaComUnderscore); // 20000 
        int numeroInteiro = 10; 
        int a = 10, b = 20, soma; // inicialização de variáveis inline 
        soma = a + b; // atribuição da soma da variável a + b para a variável soma 
        System.out.println(numeroInteiro); // 10 
        System.out.println(soma); // 30 
        double varDouble = 2.356; // double inicializado naturalmente 
        double doubleRecebendoFloat = 1.409F; // double aceitando número float 
        double doubleRecebendoLong = 12930L; // double aceitando número long 
        System.out.println(doubleRecebendoFloat); // 1.409000039100647 
        System.out.println(doubleRecebendoLong);
        System.out.println(varDouble);
        
        char letraC = 'c';
        char letraA = 'A';
        String frase = "oi tudo bom vamo q vamo";
        System.out.println(letraC == letraA);
        
        boolean ehSextaFeira = false;
        boolean naoESextaFeira = true;
        
        System.out.println(ehSextaFeira);
        System.out.println(naoESextaFeira);
        System.out.println(frase);
        System.out.println(arrayDoubles[0]);
        System.out.println(matriz[0][1]);
    } 
}