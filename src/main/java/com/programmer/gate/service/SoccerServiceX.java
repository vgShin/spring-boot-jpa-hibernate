package com.programmer.gate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.programmer.gate.model.Player;
import com.programmer.gate.model.Team;
import com.programmer.gate.model.Shoes;
import com.programmer.gate.repository.PlayerRepository;
import com.programmer.gate.repository.TeamRepository;
import com.programmer.gate.repository.ShoesRepository;


//@Service
public class SoccerServiceX implements SoccerService {

	private static final Long BARCELONA_ID = 1l;

	private static final Long SHOE1_ID = 3l;


	@Autowired
	private PlayerRepository playerRepository;
	@Autowired
	protected TeamRepository teamRepository;
    @Autowired
    protected ShoesRepository shoesRepository;

	public List<String> getAllTeamPlayers(long teamId) {
		List<String> result = new ArrayList<String>();
		List<Player> players = playerRepository.findByTeamId(teamId);
		for (Player player : players) {
			result.add(player.getName());
		}

		return result;
	}

//	public void addBarcelonaPlayer(String name, String position, int number) {
//		addTeamPlayer(name, position, number, getTeam());
//	}

	private void addTeamPlayer(String name, String position, int number, Team team, Shoes shoes) {
		Player newPlayer = new Player();
		newPlayer.setName(name);
		newPlayer.setPosition(position);
		newPlayer.setNum(number);
		newPlayer.setTeam(team);
		newPlayer.setShoes(shoes);
		playerRepository.save(newPlayer);
	}

	@Override
	public Team getTeam() {
		return teamRepository.findOne(BARCELONA_ID);
	}

	public Shoes getShoes() {return shoesRepository.findOne(SHOE1_ID);}

	@Override
	public void addBarcelonaPlayer(String name, String position, int number, Team team, Shoes shoes) {
		addTeamPlayer(name, position, number, team, shoes);
	}
}
