package Lab1;

public class Lab1_Question4 {

	public static void main(String[] args) {
		
		deerPlay(70, false);
		deerPlay(95, false);
		deerPlay(95, true);
	}
	public static void deerPlay(int temp,boolean isSummer) {
		
		if(temp>60 && 90>temp) {
			System.out.println(true);
		}else if(isSummer==true && 60<temp && temp<100) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
}
