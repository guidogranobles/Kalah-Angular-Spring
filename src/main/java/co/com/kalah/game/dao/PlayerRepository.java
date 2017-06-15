package co.com.kalah.game.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.kalah.game.entities.Player;

public interface PlayerRepository extends CrudRepository<Player, Long> {

}
