package co.com.kalah.game.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.kalah.game.business.GamePlay;
import co.com.kalah.game.dto.GamePlayStatus;
import co.com.kalah.game.dto.GamePlayUpdate;
import co.com.kalah.game.entities.Player;

@RestController
@RequestMapping("/kalahgame/rest/kalah")
public class KalahGameController {

	@Autowired
	GamePlay gamePlay;

	public KalahGameController() {

	}

	
	@RequestMapping("/loadGame/{hashIdBoard}")
	public GamePlayStatus loadGame(@RequestParam("hashIdBoard") String hashIdBoard) throws Exception {
		return gamePlay.loadPlayersBoard(hashIdBoard);
	}

	@RequestMapping("/startGame")
	public GamePlayStatus startGame(@RequestBody ArrayList<Player> players) throws Exception {

		if (players.size() != 2) {
			return null;
		}

		return gamePlay.startGame(players);

	}


	@RequestMapping("/updateGame")
	public GamePlayStatus updateGame(@RequestBody GamePlayUpdate gamePlayUpdate) throws Exception {

		return gamePlay.updatePlayerBoard(gamePlayUpdate);

	}
	

}
