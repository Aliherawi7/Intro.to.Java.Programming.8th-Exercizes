package Ex1;

public class tes {
	public static void main(String[] args) {
		Integer a = new Integer("23");
		Integer b = new Integer(23);
		Integer c = Integer.valueOf("23");
		//Integer d =  Integer.parseInt("23", 8);
	//	Double y = new Double();
		Double e = Double.valueOf("23.45");
		int f = (Integer.valueOf("23")).intValue();
		double g = (Double.valueOf("23.4")).doubleValue();
		int h = (Double.valueOf("23.4")).intValue();
		String i = (Double.valueOf("23.4")).toString();
		
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			//System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println(g);
			System.out.println(h);
			System.out.println(i);
		
	}
}
