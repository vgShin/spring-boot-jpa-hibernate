package com.programmer.gate;

import java.util.List;

import com.programmer.gate.model.Shoes;
import com.programmer.gate.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.programmer.gate.service.SoccerService;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	SoccerService soccerService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {

		Team team = soccerService.getTeam();
		Shoes shoes = soccerService.getShoes();

		for(int i=0; i<3; i++){
			soccerService.addBarcelonaPlayer("Xavi Hernandez" + i, "Midfielder" + i, 6 + i, team, shoes);
		}

		soccerService.addBarcelonaPlayer("Xavi Hernandez", "Midfielder", 6, team, shoes);
		
		List<String> players = soccerService.getAllTeamPlayers(team.getId());
		for(String player : players)
		{
			System.out.println(String.format("Introducing %s player %s", team.getName(), player));
		}

		System.out.println("Amount of Players team 1: " + players.size());
	}
}