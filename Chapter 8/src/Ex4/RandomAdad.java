package Ex4;
import java.util.Random;

public class RandomAdad {

	public static void main(String[] args) {
		Random rand = new Random(0);
		for (int i =0; i<50; i++) {
			int num = rand.nextInt(100);
			System.out.print(num+" ");
		}
		
		
	}

}
