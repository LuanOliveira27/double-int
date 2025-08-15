package processamentodedados;

public class Main {

	public static void main(String[] args) {
		
		int a, b;
		double resultado;
		
		a=5;
		b=2;
		
		resultado= (double) a/b;
		//SE NÃO COLOCAR DOUBLE A MAQUINA ENTENDERA QUE QUER UM NUMERO INTEIRO, ENTÃO É NECESSARIO COLOCAR UM (DOUBLE), ASSIM É POSSIVEL QEU A MAQUINA MANDE RESULTADO COM CASA DECIMAL. 
		
		System.out.println(resultado);
	
	
	}

}
