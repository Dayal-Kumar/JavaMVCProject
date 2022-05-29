import controller.HomeController;
import controller.LoginController;
import view.HomeView;
import view.View;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        View view = new HomeView();
        HomeController controller = new HomeController(view);
    }
}