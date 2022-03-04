public class cercle<t> {

	private int rayon;
	point<t> centre;
	
	
	public String toString() {
		return "cercle [rayon=" + rayon + ", centre=" + centre + "]";
	}


	public int getRayon() {
		return rayon;
	}


	public void setRayon(int rayon) {
		this.rayon = rayon;
	}


	public point getCentre() {
		return centre;
	}


	public void setCentre(point centre) {
		this.centre = centre;
	}


	public cercle(int rayon, point centre) {
		
		this.rayon = rayon;
		this.centre = centre;
	}
	
	 

	
	
	
	
	
	
	
	
}
