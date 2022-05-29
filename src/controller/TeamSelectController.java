package controller;

import dao.PlayerDao;
import dao.TeamDao;
import model.Team;
import view.View;

public class TeamSelectController {
    private final Team team;

    private final TeamDao teamDao;

    private final PlayerDao playerDao;

    public TeamSelectController(View view) {
        playerDao = new PlayerDao();
        teamDao = new TeamDao();
        this.team = new Team();
        view.setListener(new teamSelectListener());
        view.display(playerDao.getUnassignedPlayers());
    }

    class teamSelectListener implements Listener {

        @Override
        public boolean doAction(Object... args) {
            switch((int)args[0]){
                case 1:
                    return team.addPlayer(playerDao.getPlayer((int)args[1]));
                case 2:
                    return team.removePlayer(playerDao.getPlayer((int)args[1]));
                case 3:
                    team.setName((String) args[1]);
                    return teamDao.saveTeam(team);
            }
            return false;
        }
    }
}
