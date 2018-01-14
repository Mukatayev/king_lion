public class LandAnimal extends Animal{

	private String arrivalType;

	public LandAnimal(String name, String specie, String song, String arrivalType){
		super(name, specie,song);
		this.arrivalType = arrivalType;
	}

	public String getArrivalType(){
		return arrivalType;
	}
	
}