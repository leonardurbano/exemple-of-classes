package logica;

public class exercicio09 {

	public static void main(String[] args) {
		String original = "Leonardo Urbano de Sousa";
		String so1 = original.toLowerCase();
		String so2 = original.toUpperCase();
		String so3 = original.substring(0,original.indexOf(" "));
		int so4 = so3.length();
		String so5 = original.substring(so4).trim();
		String[] vect = original.split(" ");
		
		
		System.out.println("so1: "+so1);
		System.out.println("so2: "+so2);
		System.out.println("so3: "+so3);
		System.out.println("so4: "+so4);
		System.out.println("so5: "+so5);
		System.out.println("so6: "+so5.toLowerCase()+", "+so3.toUpperCase());
		System.out.println("so7: "+vect.length);
		System.out.println("so8: ["+vect[0]+", "+vect[1]+", "+vect[2]+", "+vect[3]+"]");
		
	}
}
