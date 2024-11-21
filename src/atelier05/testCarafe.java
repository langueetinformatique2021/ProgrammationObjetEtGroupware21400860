package atelier05;

public class testCarafe {
	public static void main(String[] args) {
		carafe c1 = new carafe(4);
		carafe c2 = new carafe(7);
		
		System.out.println("capcité de la carafe 1 : " + c1.Capacité());
		System.out.println("capcité de la carafe 2 : " + c2.Capacité());
		
		System.out.println("contenu de la carafe 1 : " + c1.Contenu());
		System.out.println("contenu de la carafe 2 : " + c2.Contenu());
		
		c2.Remplir();
		System.out.println("contenu de la carafe 1 : " + c1.Contenu());
		c1.Transvaser(c2);
		System.out.println("contenu de la carafe 1 : " + c1.Contenu());
		System.out.println("contenu de la carafe 2 : " + c2.Contenu());
	}
}