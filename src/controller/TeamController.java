package controller;

import dao.TeamDao;
import model.Team;
import view.View;

public class TeamController {
    private View view;

    private Team team;

    private TeamDao teamDao;

    public TeamController(View view, String teamName) {
        this.teamDao = new TeamDao();
        this.view = view;
        this.team = teamDao.getTeam(teamName);
        this.view.setListener(new teamListener());
        view.display(teamName, this.team.getPlayers());
    }

    class teamListener implements Listener {

        @Override
        public boolean doAction(Object... args) {
            if((int)args[0] == 1) return true;
            else return false;
        }
    }
}
