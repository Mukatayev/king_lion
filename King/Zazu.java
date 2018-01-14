import java.util.*;
import java.util.Random;


public class Zazu{
	 
	 HashMap<String, Boolean> songs;

	 public Zazu(){
	 	songs = new HashMap<String, Boolean>();

	 	songs.put("Fall Down", false);
	 	songs.put("California", false);
	 	songs.put("Day and Night", false);
	 	songs.put("Money Tress", false);
	 	songs.put("Minimal", false);
	 	songs.put("Monster", false);

	 }

	 public void pickSong(){
	 	

	 	Random r = new Random();
	 	int random = r.nextInt(songs.size());

	 	Object[] obj_song = songs.keySet().toArray();
	 	Object song = obj_song[random];
	 	songs.put((String)song, true);

	 	System.out.println("Playing : "+ (String)song);
	 }

	 public void listPlayedSong(){
	 		for (Map.Entry me : songs.entrySet()) {
	 			if(me.getValue().equals(true))
          				System.out.println(me.getKey());
        }
	 }



}