import java.util.Scanner;

/**
 * @author chandan
 * @Version 1.4
 * @Description : Tester class Which checks the Functuanality of Giant Planet and Terrestrial Planets
 * 
 */
public class Program {

public static void main(String[] args) {
		
		waitForAnyKey();
	
		GiantPlanet jupiter = new GiantPlanet("Jupiter", 87, 555, "Gas");
		System.out.println(jupiter.toString());
		
		
		System.out.println("-------------------------");
		TerrestrialPlanet venus = new TerrestrialPlanet("Venus", 33, 400, true);
		System.out.println(venus.toString());
		
		}

//This methods asks for the key from the user to Continue.
public static void waitForAnyKey() {
	String key;
	
    System.out.println("Please Enter Any Key To Continue");
    Scanner input=new Scanner(System.in);
    key = input.next();
    
	}
}//main ends here
