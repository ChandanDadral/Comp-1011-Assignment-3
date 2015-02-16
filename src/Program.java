
/**
 * @author chandan
 * @Version 1.4
 * @Description : Tester class Which checks the Functuanality of Giant Planet and Terrestrial Planets
 * 
 */
public class Program {

public static void main(String[] args) {
		
		GiantPlanet jupiter = new GiantPlanet("Jupiter", 87, 555, "Gas");
		System.out.println(jupiter.toString());
		
		
		System.out.println("-------------------------");
		TerrestrialPlanet venus = new TerrestrialPlanet("Venus", 33, 400, true);
		System.out.println(venus.toString());
		
		}
}
