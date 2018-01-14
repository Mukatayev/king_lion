import java.util.ArrayList;


public class Mufasa{
		

	public Mufasa(){
		
	}


	public void addGuest(Animal p, Guest g){
		g.addGuest(p);
		System.out.println("Succesfully Added");
		this.printGuests(g);
	}

	public void removeGuest(Animal p, Guest g){
		g.removeGuest(p);
		System.out.println("Succesfully Removed");
		this.printGuests(g);
	}


	public ArrayList<Animal> getGuests(Guest g){
		return g.getList();
	}

	// public void setGuests(ArrayList<Animal> guests){
	// 	this.guests = guests;
	// }

	
	public void printGuests(Guest g){
		for(Animal p: getGuests(g)){
			System.out.println(p+"\n"+ "-----------");
		}
	}





}