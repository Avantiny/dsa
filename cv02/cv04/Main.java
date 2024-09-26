package cv04;

public class Main {
	public static void main(String[] args) {
		Uzel u1 = new Uzel();
		Uzel u2 = new Uzel();
		Uzel u3 = new Uzel();
		Uzel u4 = new Uzel();
		Uzel u5 = new Uzel();
		Uzel u6 = new Uzel();
		
		u1.addNode(u4);
		u1.addNode(u5);
		u1.addNode(u2);
		u1.addNode(u6);
		
		u5.addNode(u4);
		
		u2.addNode(u1);
		u2.addNode(u5);
		u2.addNode(u3);
		
		u1.printNodes();
		u2.printNodes();
		u3.printNodes();
		u4.printNodes();
		u5.printNodes();
		u6.printNodes();
	}
}
