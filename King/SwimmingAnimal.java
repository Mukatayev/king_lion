public class SwimmingAnimal extends Animal{
	private String arrivalType;

	public SwimmingAnimal(String name, String specie, String song, String arrivalType){
		super(name, specie,song);
		this.arrivalType = arrivalType;
	}

	
	public String getArrivalType(){
		return arrivalType;
	}
	
}