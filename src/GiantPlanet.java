
/**
 * @author chandan
 * @Version 1.4
 * @Description : Creating Giant Planet Class wich is a sub class of Planets
 */

public class GiantPlanet extends Planet implements IHasMoons, IHasRings {

	// PRIVATE VARIABLES --------------------------------------------
		private String _type;
		
		// PUBLIC PROPERTIES -------------------------------------------
		public String getType() {
			return _type;
		}
		
		// CONSTRUCTOR -------------------------------------------------
		public GiantPlanet(String name, double diameter, double mass, String type){
			
			super(name, diameter, mass);	
			
			this._type = type;
			
		}
		
		// OVERRIDDEN METHODS --------------------------------------------
		@Override
		public Boolean HasRings() {
			
			return (this.getRingCount() > 0) ? true : false;
			
		}

		@Override
		public Boolean HasMoons() {
			
			
			return (this.getMoonCount() > 0) ? true : false;
			
		}

	}
