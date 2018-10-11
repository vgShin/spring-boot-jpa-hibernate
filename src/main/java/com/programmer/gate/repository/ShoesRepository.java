package com.programmer.gate.repository;

import com.programmer.gate.model.Shoes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoesRepository extends CrudRepository<Shoes, Long> {

	Shoes findByPlayers(long playerId);
}
