package com.nt.streamPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

record Player(String name,int age) {
	
}
public class StreamDemo9 {

	public static void main(String[] args) {
List<Player> players = createMyPlayerList();
		
		//Journey from Player object to name of the player
		Set<String> playersName = players.stream().map(p -> p.name()).collect(Collectors.toSet());
		playersName.forEach(System.out::println);
		
	}		
	
	public static List<Player> createMyPlayerList()
	{
		List<Player> listOfPlayers = new ArrayList<>();
		listOfPlayers.add(new Player("Virat",32));
		listOfPlayers.add(new Player("Rohit",33));
		listOfPlayers.add(new Player("Shami",34));
		listOfPlayers.add(new Player("Siraj",28));
		listOfPlayers.add(new Player("Sarfaraj",26));
		listOfPlayers.add(new Player("Virat",32));
		
		return listOfPlayers;
	}
	

}
