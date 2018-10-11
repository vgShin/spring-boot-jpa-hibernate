package com.programmer.gate.service;

import com.programmer.gate.model.Team;
import com.programmer.gate.model.Shoes;
import org.springframework.stereotype.Service;


@Service
public class SoccerServiceImpl extends SoccerServiceX {

    @Override
    public Team getTeam() {
        return teamRepository.findOne(2l);
    }
}
