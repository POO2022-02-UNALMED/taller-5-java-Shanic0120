package zooAnimales;

public class Main {
	public static void main(String[] args) {
		Animal a1 = new Anfibio();
		Animal a2 = new Ave();
		Animal a3 = new Mamifero();
		Animal a4 = new Pez();
		Animal a5 = new Reptil();
		boolean ok = false;
		if (a1.movimiento().equals("saltar") && a2.movimiento().equals("volar") && a3.movimiento().equals("desplazarse")
				&& a4.movimiento().equals("nadar") && a5.movimiento().equals("reptar")) {
			ok = true;
		}
		System.out.println(a5.movimiento());
		System.out.println(ok);
	}
}
