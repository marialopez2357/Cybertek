package Lab1;

public class Lab1_question1 {
	/*Question-1

    Write a method that accepts a string and a non-negative number, 
    and prints a larger string that is number copies of the original String

    stringTimes("Hi", 2); = > HiHi
    stringTimes("Hi", 3); = > HiHiHi
    stringTimes("Hi", 1); = > Hi
	 * 
	 */

	public static void main(String[] args) {
		
		
	stringTimes("Hi",2);
		
	}
	
	public static void stringTimes(String string,int number) {
		
		
		String str="";
		
		for(int i=0;i<number;i++) {
			
		
			str= str+string; //""+hi=hi+hi= hihi + hi= hihihi
			
		}
		System.out.print(str);
		
	}

}
