package week_3_4;

public class nameArray {

	public static void main(String[] args) {
		String[] names = {"Sam","Tommy", "Tim", "Sally", "Buck", "Bob"};
		int counter = 0;
		for ( int b = 0; b < names.length; b++) {			
			for(int c = 0; c < names[b].length(); c++) {
				counter++;
			}
		}
		
		System.out.println("Avarege length of names is " + (counter / names.length));
		char[] nameLetter = new char[counter];
		
		for (int d = 0; d < names.length; d++ ) {
			for(int e= 0; e < names[d].length(); e++) {
				nameLetter[d]  =  names[d].charAt(e);
				System.out.print(nameLetter[d] + " ");				
			}					
		}
		System.out.println();
		
		int[] nameLengths = new int[names.length]; 
		int sum = 0;
		
		for (int f = 0; f < names.length; f++) {
			nameLengths[f] = names[f].length();
			sum += nameLengths[f];
		}
		
		System.out.println("The sum of the nameLength is: " + sum);
			
		
	}
	
}
