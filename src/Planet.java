/**
 * 
 */

/**
 * @author chandan
 * @Version 1.0
 * @Description : Creating Planet Class which describes the qualities of the planets
 */
public class Planet {

	//Private Variables -------------------------------
	
	private double _diameter;
	private double _mass;
	private int _moonCount;
	private String _name;
	private double _orbitalPeriod;
	private int _ringCount;
	private double _rotationPeriod;
	
	//Getter MEthods ---------------------------------

	
	public double getDiameter() {
		return _diameter;
	}
	
	
	public int getMoonCount() {
		return _moonCount;
	}

	
	public double getMass() {
		return _mass;
	}
	
	
	public String getName() {
		return _name;
	}
	
	
	public double getOrbitalPeriod() {
		return _orbitalPeriod;
	}

	
	public int getRingCount() {
		return _ringCount;
	}
	
	
	public double getRotationPeriod() {
		return _rotationPeriod;
	}
	
	//Setter MEthods----------------------------------

	
	public void setMoonCount(int _moonCount) {
		this._moonCount = _moonCount;
	}
	
	
	public void setOrbitalPeriod(double _orbitalPeriod) {
		this._orbitalPeriod = _orbitalPeriod;
	}

	
	public void setRingCount(int _ringCount) {
		this._ringCount = _ringCount;
	}

	
	public void setRotationPeriod(double _rotationPeriod) {
		this._rotationPeriod = _rotationPeriod;
	}

	// CONSTRUCTOR ------------------------------------------------
		/**
		 * This constructor set the name, diameter, mass to the instance variable that was created at the top
		 * @param name the name of the planet
		 * @param diameter the diameter of the planet
		 * @param mass the mass of the planet
		 */
		public Planet(String name, double diameter, double mass){
			this._name = name;
			this._diameter = diameter;
			this._mass = mass;
		}
		
		@Override
		public String toString(){
			
			return "Planet name: " + this._name + "\nDiameter: " + this._diameter + "\nMass: " + this._mass;
		}
}
