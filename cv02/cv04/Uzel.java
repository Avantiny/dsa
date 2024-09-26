package cv04;

import java.util.Vector;

public class Uzel {
	Vector<Uzel> sousedi = new Vector<Uzel>();
	
	public void addNode(Uzel soused) {
		this.sousedi.add(soused);
	}
	
	public void getNode(int index) {
		this.sousedi.get(index);
	}
	
	public void printNodes() {
		System.out.println(sousedi);
	}
}

//UML Uzel
//+-------------------------+
//|         Uzel            |
//+-------------------------+
//| - sousedi: Uzel[]       |
//+-------------------------+
//| + addNode(Uzel): void   |
//| + getNode(int): Uzel    |
//| + printNodes(): void    |
//+-------------------------+