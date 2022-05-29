package view;

import controller.Listener;
import model.Player;

import java.util.List;
import java.util.Scanner;

public class SelectView implements View {

    private Listener listener;


    @Override
    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override
    public void display(Object... args) {
        List<Player> players = (List<Player>) args[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("List of Unassigned Players:");
        for(Player player : players){
            int id = player.getId();
            String name = player.getName();
            Float rating = player.getRating();
            System.out.println("Id:" + id + " Name:"+name+" Rating:"+rating);
        }
        System.out.println("""

                Operations:
                Enter 1 and then Id of the player you want to add to your team.
                Enter 2 and then Id of the player you want to remove from your team.
                Enter 3 and then name of your team to save your progress""");
        while(true) {
            switch (scanner.nextInt()) {
                case 1 -> {
                    int input1 = scanner.nextInt();
                    if (this.listener.doAction(1, input1)) {
                        System.out.println("Player added successfully.");
                    } else {
                        System.out.println("Player could not be added, team may be full or the player may be assigned already");
                    }
                }
                case 2 -> {
                    int input2 = scanner.nextInt();
                    if (this.listener.doAction(2, input2)) {
                        System.out.println("Player removed successfully.");
                    } else {
                        System.out.println("Player could not be removed, the player may not be in the team.");
                    }
                }
                case 3 -> {
                    String input3 = scanner.next();
                    if (this.listener.doAction(3, input3)) {
                        System.out.println("Team saved successfully.");
                    } else {
                        System.out.println("Team could not be saved.");
                    }
                    return;
                }
            }
        }
    }
}
