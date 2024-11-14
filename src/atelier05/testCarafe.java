package atelier05;

public class testCarafe {
	public static void main(String[] args) {
		carafe c1 = new carafe(5);
		carafe c2 = new carafe(7);
		
		System.out.println("capcité de a carafe : " + c1.Capacité());
		System.out.println("capcité de a carafe : " + c2.Capacité());
		
		System.out.println("contenu de a carafe : " + c1.Contenu());
		System.out.println("contenu de a carafe : " + c2.Contenu());
	}
}
