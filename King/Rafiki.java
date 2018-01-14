public class Rafiki{
	
	public void isAllow(String name, Guest g){
		String addname = "";
		for (Animal a: g.getList() ){
			if(a.getName().equals(name)){
				addname += name;
			}
		}

		if(addname.equals(name)){
			System.out.println(addname + " is allowed on the Guest list");
		}
		else{
			System.out.println(name + " is NOT allowed on the Guest list");
		}

	}

	public void checkByName(Guest g, String name){
		for (Animal a: g.getList()){
			if(a.getName().equals(name)){

				if(a instanceof LandAnimal){
					System.out.println("needs number of paws");
				}else if(a instanceof SwimmingAnimal){
					System.out.println("water tank");
				} else if(a instanceof FlyingAnimal){
					System.out.println("The extension of its wings");
				}else{
					System.out.println("Undefined");
				}
			}
		}
	}

	public void checkBySpecie(Guest g, String specie){
		// for (Animal a: g.getList()){
		// 	if(a.getSpecie().equals(specie)){
		// 		String arrivalType = a.getArrivalType();
		// 		if(arrivalType.equals("land")){
		// 			System.out.println("needs number of paws");
		// 		}else if(arrivalType.equals("water")){
		// 			System.out.println("water tank");
		// 		} else if(arrivalType.equals("air")){
		// 			System.out.println("The extension of its wings");
		// 		}else{
		// 			System.out.println("Undefined");
		// 		}
		// 	}
		// }

		if(specie.equals("lion") || 
						specie.equals("zebra") ||
						specie.equals("girafe") ||
						specie.equals("monkey") ||
						specie.equals("elephant") ||
						specie.equals("wolf") ||
						specie.equals("pig") ){
							

							System.out.println("needs number of paws");
					}else if(specie.equals("fish") ||
						specie.equals("shark") ||
						specie.equals("meduza") ||
						specie.equals("octopus") ){

						System.out.println("water tank");
					}else if(specie.equals("bird") ||
						specie.equals("eagle") ||
						specie.equals("bat") ||
						specie.equals("parrot") ){

						System.out.println("The extension of its wings");
					}else{
						System.out.println("Undefined");
					}
	}







}