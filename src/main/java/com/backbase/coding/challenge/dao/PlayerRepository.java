package com.backbase.coding.challenge.dao;

import org.springframework.data.repository.CrudRepository;

import com.backbase.coding.challenge.entities.Player;

public interface PlayerRepository extends CrudRepository<Player, Long> {

}
