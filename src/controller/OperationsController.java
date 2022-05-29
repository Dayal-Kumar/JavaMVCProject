package controller;

import view.SelectView;
import view.TeamView;
import view.UpdateView;
import view.View;

public class OperationsController {

    public OperationsController(View view) {
        view.setListener(new operationsListener());
        view.display();
    }

    static class operationsListener implements Listener {

        @Override
        public boolean doAction(Object... args) {
            switch ((int)args[0]){
                case 1:
                    SelectView selectView = new SelectView();
                    TeamSelectController teamSelectcontroller = new TeamSelectController(selectView);
                    break;
                case 2:
                    UpdateView updateview = new UpdateView();
                    String teamName = (String) args[1];
                    TeamUpdateController teamUpdatecontroller = new TeamUpdateController(updateview, teamName);
                    break;
                case 3:
                    TeamView teamView = new TeamView();
                    String name = (String) args[1];
                    TeamController teamController = new TeamController(teamView, name);
                    break;
                case 4:
                    return false;
            }
            return false;
        }
    }
}
