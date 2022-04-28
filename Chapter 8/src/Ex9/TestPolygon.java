package Ex9;

public class TestPolygon {

	public static void main(String[] args) {
		RegularPolygon pL1= new RegularPolygon();
		RegularPolygon pL2= new RegularPolygon(6,4);
		RegularPolygon pL3= new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println(pL1.getPerimeter());
		System.out.println(pL2.getPerimeter());
		System.out.println(pL3.getPerimeter());
		

	}

}
