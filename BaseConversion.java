public class BaseConversion {

	public static void main(String[] args) {
		//declare test variables
		int decimalNumber1 = 111, decimalNumber2 = 456, decimalNumber3 = 34567;
		
		//print out the result
		System.out.println(convertBase10ToBase2(decimalNumber1));
		System.out.println(convertBase10ToBase2(decimalNumber2));
		System.out.println(convertBase10ToBase2(decimalNumber3));
	}
	
	public static String convertBase10ToBase2(int num){
		//declare a remainder and a result variable
		int remainder = 0;
		String result = "";
		
		//convert to binary number using modulus and division
		  while (num > 0) {		   
		   remainder = num % 2;
		   num = num / 2;
		   result = remainder + "" + result;		   
		  }
		  return result;
	}
}
