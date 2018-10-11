package com.programmer.gate.service;

import com.programmer.gate.model.Team;
import com.programmer.gate.model.Shoes;

import java.util.List;

public interface SoccerService {
	public List<String> getAllTeamPlayers(long teamId);
	public Team getTeam();
	public Shoes getShoes();
	public void addBarcelonaPlayer(String name, String position,int number, Team team, Shoes shoes);
}
