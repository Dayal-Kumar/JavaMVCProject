package controller;

import view.LoginView;
import view.SignUpView;
import view.View;

public class HomeController {


    public HomeController(View view){
        view.setListener(new homeListener());
        view.display();
    }
    
    static class homeListener implements Listener {
        @Override
        public boolean doAction(Object... args) {
            int userInput = (int) args[0];
            if(userInput == 1) {
                LoginView view = new LoginView();
                LoginController controller = new LoginController(view);
            } else if(userInput == 2) {
                SignUpView view = new SignUpView();
                SignUpController controller = new SignUpController(view);
            }
            return false;
        }
    }
}
