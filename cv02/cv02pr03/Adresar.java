package cv02pr03;

public class Adresar {
	public Adresar levy;
	public Adresar pravy;
	public int index;

	public Adresar(int index) {
		this.index = index;
	}

	public Adresar(Adresar levy, Adresar pravy, int index) {
		this.levy = levy;
		this.pravy = pravy;
		this.index = index;
	}

	public Adresar getLevy() {
		return levy;
	}

	public void setLevy(Adresar levy) {
		this.levy = levy;
	}

	public Adresar getPravy() {
		return pravy;
	}

	public void setPravy(Adresar pravy) {
		this.pravy = pravy;
	}

	// Rekurzivni vykresleni stromu pomoci zavorkove notace
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(index);
		if (levy != null || pravy != null) {
			builder.append(" (");
			if (levy != null) {
				builder.append(levy.toString());
			} else {
				builder.append("-");
			}
			builder.append(", ");
			if (pravy != null) {
				builder.append(pravy.toString());
			} else {
				builder.append("-");
			}
			builder.append(")");
		}
		return builder.toString();
	}
}

//UML Adresar
//+-------------------------+
//|         Adresar         |
//+-------------------------+
//| - levy: Adresar         |
//| - pravy: Adresar        |
//| - index: int            |
//+-------------------------+
//| + getLevy(): Adresar    |
//| + setLevy(Adresar): void|
//| + getPravy(): Adresar   |
//| + setPravy(Adresar):void|
//+-------------------------+
