
public class CercleAvecRestriction <t2 extends point> {
	
	private int rayon;
	t2 centre;
	
	
	public String toString() {
		return "CercleAvecRestriction [rayon=" + rayon + ", centre=" + centre
				+ "]";
	}


	public int getRayon() {
		return rayon;
	}


	public void setRayon(int rayon) {
		this.rayon = rayon;
	}


	public t2 getCentre() {
		return centre;
	}


	public void setCentre(t2 centre) {
		this.centre = centre;
	}


	public CercleAvecRestriction(int rayon, t2 centre) {
		this.rayon = rayon;
		this.centre = centre;
	}
	
}
