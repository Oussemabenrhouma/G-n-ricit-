public class PointColoré <t,t1> extends point<t>{
 
		t1 couleur;

		public PointColoré(char nom, t abs, t ord,String couleur) {
			super(nom, abs, ord);
			this.couleur=(t1) couleur;
			
		}

		public t1 getCouleur() {
			return couleur;
		}

		public void setCouleur(t1 couleur) {
			this.couleur = couleur;
		}

		
		public String toString() {
			return "PointColoré [couleur=" + couleur + "]";
		}
		
	
}
