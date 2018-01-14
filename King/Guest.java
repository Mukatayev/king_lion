import java.util.ArrayList;

public class Guest{
	
	private static ArrayList<Animal> guests;

	public Guest(){
		guests = new ArrayList<Animal>();

	}

	public ArrayList<Animal> getList(){
		return this.guests;
	}

	public static void addGuest(Animal p){
		guests.add(p);
	}

	public static void removeGuest(Animal p){
		for(Animal a: guests){
			if(a.equals(p)){
				guests.remove(a);
			}
		}
			
			
	}


}