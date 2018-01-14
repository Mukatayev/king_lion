import java.util.Scanner;
import java.util.*;


public class Systems{


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);


		String userCommand;

		Guest g = new Guest();
		Mufasa m = new Mufasa();
		Zazu z = new Zazu();
		Rafiki r = new Rafiki();
       m.addGuest(new FlyingAnimal("Kyran", "eagle", "Bottle", "air"), g);



		do{


			System.out.println("*************"+"\n" + "Menu: "+"\n" +
			"Enter '1': Register guest" +"\n" + "Enter '2': Remove a guest" +"\n" + "Enter '3': Pick a song" + "\n" +
			"Enter '4': List played songs" +"\n" +"Enter '5': Check if an animal is on the Guest list" + "\n"+
			"Enter '6': List animal needs by animal name" + "\n"+
			"Enter '7': List animal needs by specie name" + "\n"
			+"\n" + "exit"+"\n" + "*************");

			userCommand = scanner.next();
			switch(userCommand){
				case "1":
					System.out.println("Name:");
					String name = scanner.next();
					System.out.println("Specie:");
					String specie = scanner.next();
					System.out.println("Song:");
					String song = scanner.next();
					if(specie.equals("lion") || 
						specie.equals("zebra") ||
						specie.equals("girafe") ||
						specie.equals("monkey") ||
						specie.equals("elephant") ||
						specie.equals("wolf") ||
						specie.equals("pig") ){
							Animal a = new LandAnimal(name, specie, song, "land");
						m.addGuest(a, g);
					}else if(specie.equals("fish") ||
						specie.equals("shark") ||
						specie.equals("meduza") ||
						specie.equals("octopus") ){

						Animal a = new SwimmingAnimal(name, specie, song, "water");
						m.addGuest(a, g);
					}else if(specie.equals("bird") ||
						specie.equals("eagle") ||
						specie.equals("bat") ||
						specie.equals("parrot") ){

						Animal a = new FlyingAnimal(name, specie, song, "air");
						m.addGuest(a, g);
					}else{
						System.out.println("Undefined Specie name, Try again");
					}
					

				break;
				case "2":
					System.out.println("Name:");
					name = scanner.next();
					System.out.println("Specie:");
					specie = scanner.next();
					System.out.println("Song:");
					song = scanner.next();
					Animal b = new Animal(name, specie, song);
					m.removeGuest(b, g);
				break;
				case "3":
					z.pickSong();
				break;
				case "4":
					z.listPlayedSong();
				break;
				case "5":
					System.out.println("Name:");
					name = scanner.next();
					r.isAllow(name,g);
				break;
				case "6":
					System.out.println("Name:");
					name = scanner.next();
					r.checkByName(g, name);
				break;
				case "7":
					System.out.println("Specie:");
					name = scanner.next();
					r.checkBySpecie(g,name);
				break;

				

			




			}

		}while(!userCommand.equals("exit"));



	}


}
