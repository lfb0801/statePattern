package nl.lbs.app;

import nl.lbs.logic.*;
import nl.lbs.logic.config.GuestOptions;
import nl.lbs.pl.Menu;

import java.util.Scanner;

public class Main {

    private static Forum forum = new Forum(new GuestOptions());
    private static Menu menu = new Menu();
    private static Scanner menuInput = new Scanner(System.in);

    public static void main(String[] args) {

        while (!menu.isEndMenu()){
            menu.display();
            menu.interact(forum, menuInput);
        }
    }
}
