package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// fahrenheit to celsius
		double F = 86;
		final double C = (F-32)*5/9;
		
		System.out.println("A temperatura de " + F + "°F é de " + C + "°C!");	
	}

}
