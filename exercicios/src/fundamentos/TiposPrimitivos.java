package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Employee informations
		
		// Integer types
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Real types
		float salario = 11_445.55F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Boolean types
		boolean estaDeFerias = false; // true
		
		// Character type
		char status = 'A';
		
		// Company days
		System.out.println(anosDeEmpresa * 365);
		
		// Number of trips
		System.out.println(numeroDeVoos / 2);
		
		// Real per points
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}

}
