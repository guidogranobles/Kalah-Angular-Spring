package co.com.kalah.game.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import co.com.kalah.game.entities.GameBoard;

public interface GameBoardRepository extends CrudRepository<GameBoard, Integer> {

	List<GameBoard> findByIdBoard(String idBoard);
	
	 @Query("SELECT g FROM GameBoard g where g.idBoard= :idHashBoard and g.idplayer= :idPlayer")
	 public List<GameBoard> find(@Param("idHashBoard") String idHashBoard, @Param("idPlayer") Integer idPlayer);
}

