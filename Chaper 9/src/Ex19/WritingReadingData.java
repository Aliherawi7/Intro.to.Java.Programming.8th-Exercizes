package Ex19;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class WritingReadingData {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Exercise9_19.txt");
		int [] randNum = new int[100];
		Random rand = new Random();
		PrintWriter pw = new PrintWriter(file);
		for(int i=0; i<randNum.length; i++) {
			randNum[i] = rand.nextInt(1000);
			pw.print(randNum[i]);
			pw.print(' ');
		}
		System.out.println();
		// close and save the file
		pw.close();
		// scan the file to read the contents
		Scanner read = new Scanner(file);
		int[] readInt = new int[100];
		int count =0;
		// get the integers back.
		while(read.hasNext()) {
			readInt[count] = read.nextInt();
			count++;
		} 
		// sort the array
		for(int i =0; i<readInt.length; i++) {
			int selected = readInt[i];
			int index = i;
			for(int j =i; j<readInt.length; j++) {
				if(  readInt[j] < selected) {
					//4			//6
					selected = readInt[j];
					index = j;
				}
			}
			readInt[index] = readInt[i];
			readInt[i] = selected;
			
		}
		//displaying sorted data
		for(int i =0; i <readInt.length; i++) {
			
			if(i%10==0) {
				System.out.println();
			}else if(readInt[i]<100) {
				System.out.print(readInt[i]+"  ");
			}else System.out.print(readInt[i]+" ");
			
			
		}
		
		

	}

}
