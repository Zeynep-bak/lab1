package day14_lab_1;

public class Question_1 {

	public static void main(String[] args) {
		stringTimes("Hi",2);   //HiHi
		stringTimes("Hi",3);   //HiHiHi
		stringTimes("Hi",1);    //Hi

	}
    public static void stringTimes(String word,int repeat) {
    	 word="Hi";
    	 for(int i=1;i<=repeat;i++) {
    		System.out.print(word); 
    	 }
   System.out.println();
    }

	}


