
public class point <t> {
	private char nom;
	private t abs;
	private t ord;
	
	public char getNom() {
		return nom;
	}

	public void setNom(char nom) {
		this.nom = nom;
	}

	public t getAbs() {
		return abs;
	}

	public void setAbs(t abs) {
		this.abs = abs;
	}

	public t getOrd() {
		return ord;
	}

	public void setOrd(t ord) {
		this.ord = ord;
	}

	public point(char nom, t abs, t ord) {
		this.nom = nom;
		this.abs = abs;
		this.ord = ord;
	}

	public String toString() {
		return "point [nom=" + nom + ", abs=" + abs + ", ord=" + ord + "]";
	}
}
