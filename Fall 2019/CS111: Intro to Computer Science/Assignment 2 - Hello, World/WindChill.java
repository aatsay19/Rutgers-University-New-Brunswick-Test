/*************************************************************************
 *  Compilation:  javac WindChill.java
 *  Execution:    java WindChill 35.0 10.0
 *
 *  @author: Aatif Sayed
 *  
 *  A program that takes two double command-line arguments, temperature 
 *  and velocity respectively, and prints the wind chill (a double)
 *  according to the following formula:
 *
 *  w = 35.74 + 0.6215 * T + (0.4275 * T - 35.75) v^0.16
 *
 *  % java WindChill 35.0 10.0
 *  27.445420765619037
 *
 *  The formula is not valid if T is larger than 50 in absolute value or if 
 *  v is larger than 120 or less than 3.
 *
 *  Assume the inputs are valid values
 *************************************************************************/

public class WindChill {

	public static void main(String[] args) {

		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);

		if (Math.abs(t) > 50 || v > 120 || v < 3) {
			System.out.println("Please enter a temperature (in Farenheit) that is between -50 and 50 and a velocity (in mph) that is between 3 and 120.");
			return;
		}

		double w;
		w = (35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16));

		System.out.println(w);

	}

}
