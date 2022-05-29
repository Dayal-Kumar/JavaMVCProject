package controller;

import dao.SignUpDao;
import model.User;
import view.OperationsView;
import view.View;

public class SignUpController {

    SignUpController(View view) {
        view.setListener(new signUpListener());
        view.display();
    }


    static class signUpListener implements Listener {

        @Override
        public boolean doAction(Object... args) {
            User user = new User((String) args[0], (String) args[1]);
            SignUpDao signUpDao = new SignUpDao();
            boolean isAuthenticated = signUpDao.signupUser(user);
            if(isAuthenticated){
                OperationsView view = new OperationsView();
                OperationsController controller = new OperationsController(view);
            }
            return isAuthenticated;
        }
    }
}
