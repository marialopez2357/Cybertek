package Lab1;

public class Lab1_Question6 {
 
	public static void main(String[] args) {
		
		
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);
	}
	public static void cigarParty(int cigars,boolean weekend) {
		
		if(weekend) {
			if(cigars>=40) {
			System.out.println(true);
	      	}else {
	      		System.out.println(false);
	      	}
			    }else {
	    	if(cigars>=40 && cigars<=60) {
				System.out.println(true);
		  	}else {
		  		System.out.println(false);
		  	}
	    }
	}
}

//A chipmonk party is successful when the number of cigars is between 40 and 60. 
//Unless it is the weekend,
//in which case there is no upper bound on the number of cigars.