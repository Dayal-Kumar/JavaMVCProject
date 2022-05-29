package view;

import controller.Listener;

import java.util.Scanner;

public class SignUpView implements View {

    private String username;
    private String password;

    private Listener listener;

    @Override
    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override
    public void display(Object... args) {
        System.out.println("SignUp View");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the username:");
        this.username = scanner.nextLine();
        System.out.print("Enter the password:");
        this.password = scanner.nextLine();
        this.listener.doAction(this.username, this.password);
    }

}
