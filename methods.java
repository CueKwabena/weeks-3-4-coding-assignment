package week_3_4;

public class methods {
	
	
	static void repeatWord(String word, int repeater) {		
		for (int i = 0; i < repeater; i++ ) {
			System.out.println(word);
		}	
	}
	
	static void fullName (String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}

	static void greaterThenHundred (int[] numberArray) {
		
		int sum = 0;

		for (int numbers: numberArray) {
			sum += numbers;
		}		
		boolean check = (sum > 100) ? true : false;
			System.out.println(check);		
		}
	
	static void doubleArray (int[] firstArray, int[] secondArray ) {
		int firstSum = 0;
		int secondSum = 0;
	for (int i = 0; i < firstArray.length; i++ ) {
		firstSum += firstArray[i];		
	}
	
	firstSum /= firstArray.length; 

	for (int j = 0; j < secondArray.length; j++) {
		secondSum += secondArray[j];
	}
	secondSum /= secondArray.length;
	boolean ava = (firstSum > secondSum) ? true: false; 
	System.out.println(ava);
	}
	
	static void willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		boolean question = (isHotOutside = true && moneyInPocket >= 10.5)? true: false;
	System.out.println(question);
	}
	
	static void evenOrOdd (int number) {		
		if (number % 2 == 0) {
			System.out.println(number + " is Even");
		}else {
			 System.out.println(number + " is Odd");
		}
	}
	
	public static void main(String[] args) {		
		
		int[] firstNum = {43,654,43,33};
		int[] secondNum = {33,845,67,2};
		
		//repeatWord("word",15);
		//fullName("John","Smith");
		doubleArray(firstNum, secondNum);
		//greaterThenHundred(firstNum);
		//willBuyDrink(true, 1.50);
		//repeatWord("Good",15);
		//evenOrOdd(421);
	}

}
