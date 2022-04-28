package Ex35;
import java.util.Scanner;

public class FindingGenes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Genome (UPPECASE):");
		String scInput = sc.nextLine();
		String[] startArray = scInput.split("ATG");
		
		String[] genes = new String[startArray.length];
		//initialized to avoid null value
		for(int j =0; j<genes.length; j++) {
			genes[j] =""; 
		}
		
		
		for(int i=0; i<startArray.length; i++) {
			String [] hold;
			if(startArray[i].contains("TAG")) {
				 hold = startArray[i].split("TAG");
				 if(hold[0].length()%3==0) {
					 genes[i] = hold[0];
				 }
			}else if(startArray[i].contains("TAA")) {
				 hold = startArray[i].split("TAA");
				 if(hold[0].length()%3==0) {
					 genes[i] = hold[0];
				 }
			}else if(startArray[i].contains("TGA")) {
				 hold = startArray[i].split("TGA");
				 if(hold[0].length()%3==0) {
					 genes[i] = hold[0];
				 }
				 
			}
		}
		boolean noGene =true;
		// print the genes if available
		for(int i =0; i<genes.length; i++) {
			if(genes[i].length()>0) {
				System.out.println(genes[i]);
				noGene = false;
			} 
		}
		// print the NO gene if not available
			if(noGene) {	
				System.out.println("No gene");
			}
		

	}
	

}
