

public class Animal{
	
	private String name;
	private String specie;
	private String song;
	

	public Animal(String name, String specie, String song){
		this.name = name;
		this.specie = specie;
		this.song = song;
	}


	public String getName(){
		return this.name;
	}

	public String getSpecie(){
		return this.specie;
	}

	public String getSong(){
		return this.song;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setSpecie(String specie){
		this.specie = specie;
	}

	public void setSong(String song){
		this.song = song;
	}

	public String toString(){
		return "Name: "+this.name+" "+"Specie: "+ this.specie+" "+"Song: "+this.song;
	} 

	public boolean equals(Animal a){
		return this.name.equals(a.getName()) && this.specie.equals(a.getSpecie()) && this.song.equals(a.getSong());
	}

}