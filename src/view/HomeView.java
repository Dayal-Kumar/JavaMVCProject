package view;

import controller.HomeController;
import controller.Listener;

import java.util.Scanner;

public class HomeView implements View {

    private int userInput;
    private Listener listener;



    @Override
    public void display(Object... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press 1 to login, press 2 to signup:");
        this.userInput = scanner.nextInt();
        pass();
    }

    public void pass(){
        this.listener.doAction(this.userInput);
    }

    @Override
    public void setListener(Listener listener) {
        this.listener = listener;
    }
}
