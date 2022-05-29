package controller;

import dao.LoginDao;
import model.User;
import view.OperationsView;
import view.View;

public class LoginController {

    LoginController(View view){
        view.setListener(new loginListener());
        view.display();
    }


    static class loginListener implements Listener {

        @Override
        public boolean doAction(Object... args) {
            User user = new User((String) args[0], (String) args[1]);
            LoginDao logindao = new LoginDao();
            boolean isAuthenticated = logindao.authenticate(user);
            if(isAuthenticated){
                OperationsView view = new OperationsView();
                OperationsController controller = new OperationsController(view);
            }
            return isAuthenticated;
        }
    }
}
