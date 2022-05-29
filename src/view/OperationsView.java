package view;

import controller.Listener;
import controller.TeamSelectController;
import controller.TeamUpdateController;

import java.util.Scanner;

public class OperationsView implements View {

    private Listener listener;

    @Override
    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override
    public void display(Object... args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while(!exit) {
            System.out.print("Enter 1 to create a new team, 2 to update an existing team, 3 to view your saved team, 4 to exit: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                this.listener.doAction(1);
            } else if (choice == 2) {
                System.out.print("Enter your saved team name: ");
                this.listener.doAction(2, scanner.next());
            } else if (choice == 3) {
                System.out.print("Enter your saved team name: ");
                this.listener.doAction(3, scanner.next());
            } else if (choice == 4) {
                exit = true;
            }
        }
    }
}
