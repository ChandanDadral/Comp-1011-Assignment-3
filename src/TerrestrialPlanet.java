
/**
 * @author chandan
 * @Version 1.4
 * @Description : Creating Terrestrial Planet Class wich is a sub class of Planets
 * and has interfaces Habitable and HasMoons
 */


public class TerrestrialPlanet extends Planet implements IHasMoons, IHabitable {

	// Private Variables      -------------------------------------
	private boolean _oxygen;
	
	// Constructor      ------------------------------------------
	public TerrestrialPlanet(String name, double diameter, double mass, boolean oxygen){
		super(name, diameter, mass);
		
		this._oxygen = oxygen;
		
	}
	
	// OOverridden Methods     ------------------------------------------
	@Override
	public Boolean Habitable() {
		
		return (this._oxygen == true) ? true : false;
		
	}

	@Override
	public Boolean HasMoons() {
		
		return (this.getMoonCount() > 0) ? true : false;
		
	}

}