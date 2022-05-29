package controller;

import dao.PlayerDao;
import dao.TeamDao;
import model.Team;
import view.View;

public class TeamUpdateController {
    private final Team team;

    private final TeamDao teamDao;

    private final PlayerDao playerDao;

    public TeamUpdateController(View view, String teamName) {
        this.teamDao = new TeamDao();
        this.team = teamDao.getTeam(teamName);
        this.playerDao = new PlayerDao();
        view.setListener(new teamUpdateListener());
        view.display(playerDao.getUnassignedPlayers(), this.team.getPlayers());
    }

    class teamUpdateListener implements Listener {

        @Override
        public boolean doAction(Object... args) {
            return switch ((int) args[0]) {
                case 1 -> team.addPlayer(playerDao.getPlayer((int) args[1]));
                case 2 -> team.removePlayer(playerDao.getPlayer((int) args[1]));
                case 3 -> teamDao.saveTeam(team);
                default -> false;
            };
        }
    }
}
