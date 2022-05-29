package view;

import controller.Listener;
import model.Player;

import java.util.List;
import java.util.Scanner;

public class TeamView implements View {

    private Listener listener;

    @Override
    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override
    public void display(Object... args) {
        Scanner scanner = new Scanner(System.in);
        String teamName = (String) args[0];
        List<Player> players = (List<Player>) args[1];
        System.out.println("List of players in your team "+teamName);
        for (Player player : players) {
            int id = player.getId();
            String name = player.getName();
            Float rating = player.getRating();
            System.out.println("Id:" + id + " Name:"+name+" Rating:"+rating);
        }
        System.out.print("Enter 1 to go back:");
        if(scanner.nextInt() == 1) this.listener.doAction(1);
    }
}
