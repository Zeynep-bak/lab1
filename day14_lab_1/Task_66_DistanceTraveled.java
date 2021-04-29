package day14_lab_1;

public class Task_66_DistanceTraveled {

	public static void main(String[] args) {
	/*The distance a vehicle travels can be calculated as follows:
	 * Distance=Speed*Time
	 * Write a method named distance that accepts a vehicle’s 
	 * speed and time as arguments,
	 *  and return the distance the vehicle has traveled.
	 */
          double distanceTraveled=distance(50,5);
         
          System.out.println(distanceTraveled);
         
          if(distanceTraveled >500) {
                System.out.println("you sent too much pas");
          }else {
        	    System.out.println("you sent ok gas"); 
          }
	}
	
	public static double distance(double speed, int time) {
	 
		double distanceTraveled= speed* time;
	 
		return distanceTraveled;
  }
}
