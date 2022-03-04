
public class test {

	public static void main(String[] args) {
		point <Integer> P1=new point<>('A',4,3);
		point <Double> P2=new point<>('B',5.2,2.0);
		
		P1.toString();
		System.out.println(P1);
		
		P2.toString();
		System.out.println(P2);
		
		
		point <Integer> P=new PointColoréNG('C',5,3,"Rouge");
		
		P.toString();
		
		point <Integer> P3=new PointColoré<>('D',5,3,"vert");
		
		P3.toString();
		
		point <Integer> P4=new PointColoré<>('E',5,3,"Bleu");
		
		P4.toString();
		
		cercle  c1=new cercle(50,P1);
		
		c1.toString();
		
		cercle car1=new cercle(100,P2);
		
		car1.toString();
		
		cercle car2=new cercle(30,P2);
		
		car1.toString();
	}
	

}
