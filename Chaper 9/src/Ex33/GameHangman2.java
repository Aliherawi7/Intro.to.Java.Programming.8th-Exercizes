package Ex33;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class GameHangman2 {
	
	static int[] wordFound ;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner pathScan = new Scanner(System.in);
		System.out.println("Enter the file path: ");
		String pathName = pathScan.nextLine();
		File file = new File(pathName);
		Scanner scanFile = new Scanner(file);
		String wordScan ="";
		while(scanFile.hasNext()) {
			wordScan += scanFile.next()+" ";
		}
		scanFile.close();
		String[] wordBank = wordScan.split(" ");
		Random rand = new Random();
		char avoidDouble = 0 ; // avoid the repeat letter
		int mistake =0; // count number of mistake
		//this while is to check if user wants to continue
		boolean b = true;
		while(b) {
			b= false;
			int numRand = rand.nextInt(wordBank.length); // choose randomly an index of a word from the String array
			int wordLength = wordBank[numRand].length(); // store the word's letters number
			char[] star =new char[wordLength];
			for(int j =0; j<star.length; j++) {
				star[j]= '*';
			}
		
			for(int i =0; i<wordLength; i++) {
				Scanner input = new Scanner(System.in);
				System.out.println("(Guess) Enter a letter in word "+new String(star)+">");
				String inputText = input.nextLine();
				char inputChar = inputText.charAt(0);
				
				if( avoidDouble == inputChar){
					System.out.println(inputChar+" is already in the word");
					i--;
				}else if((letterCheck(inputChar, wordBank[numRand]))) {
					for(int a=0; a<wordLength; a++) {
						if(a==wordFound[a]) {
							star[wordFound[a]] =inputChar;
						}
						avoidDouble = inputChar;
					}
					
				}else if(!(letterCheck(inputChar, wordBank[numRand]))){
					System.out.println(inputChar+" is not in the word");
					mistake++;
					i--;
				}
				// check if the word is completed!
				if(new String(star).equals( wordBank[numRand])) {
					break;
				}
				
			}
			System.out.println("The word is "+new String(star)+". You missed "+mistake+ (mistake>1 ? " times":" time"));
			Scanner ask = new Scanner(System.in);
			System.out.println("Do you want to guess for another word? Enter y or n> ");
			String inputText = ask.nextLine();
			char inputContinue = inputText.charAt(0);
			if(inputContinue == 'y') {
				b = true;
			}
		}
		
	}
	// check the input letter with letter in the word
	public static boolean letterCheck(char ch, String word) {
		wordFound = new int[word.length()];
		// initialized the wordFound array to avoid matching all the index of array with wordBank 
		for(int i=0; i<wordFound.length; i++) {
			wordFound[i] = 1000;
		}
		int sum =0;
		for(int i =0; i <word.length(); i++) {
			if(word.charAt(i)==ch) {
				wordFound[i] = i;
				sum +=i;
			}
		}
		
		if(sum>0) {
			
			return true;
			
		}else return false;
		
	}
	
}
