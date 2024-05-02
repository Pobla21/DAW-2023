package practicaExcepciones;

public class Yacht extends Sporty {
	//Atributes
	private int cabins;
	//Builder
	public Yacht() {
		super();
	}

	public Yacht(int plate, int length, int year) {
		super(plate, length, year);
	}
	//Methods
	/**
	 * Calculates the rental of the yacht
	 * @return int
	 */
	@Override
	public int getValRent() {
		return super.getValRent()+cabins;
	}
	//Get y Set
	public int getCabins() {
		return cabins;
	}

	public void setCabins(int cabins) {
		this.cabins = cabins;
		if(cabins<1) {
			throw new IllegalArgumentException("No se aceptan negativos ni 0");
		}
	}
}
