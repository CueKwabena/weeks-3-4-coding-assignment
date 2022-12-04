package week_3_4;

public class ageArray {
	public static void main(String[] args) {
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int averageAge = 0;
		
		System.out.println("The first number in the index is " + ages[0]);
		System.out.println("The last number in the index is " + ages[ages.length - 1]);
		System.out.println("The first element subtracted from the last element is " + (ages[ages.length-1] - ages[0]));
		
			for (int age: ages) {
			averageAge += age;
			}	
			
		System.out.println("The average of the indexes " + averageAge/ages.length);
	}
}
