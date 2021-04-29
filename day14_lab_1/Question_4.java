package day14_lab_1;

public class Question_4 {

	public static void main(String[] args) {
	// The deers in VA spend most of the day playing.In particular, they play if the temperature is
	//between 60 and 90.Unless it is summer , then the upper limit is 100 instead of 90.
	//Write a method that accepts temperature and boolean is summer, prints true if the deers play
	//and false otherwise
        deerPlay(70,false);//true
        deerPlay(95,true);//true
	    deerPlay(95,false);//false
	
	}
    
	public static void deerPlay(int num,boolean summer) {
    	if(summer) {
    		System.out.println(num<100 && num>60);
    		
    		}else {
    	      System.out.println(num<90 && num>60);
    	
    	
    	}
    	}
}

