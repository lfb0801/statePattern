package nl.lbs.app;

import nl.lbs.logic.*;
import nl.lbs.pl.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // start de context voor het forum met de guest opties
        Forum forum = new Forum();

        // start het menu uit presentation layer
        Menu menu = new Menu();
        Scanner menuInput = new Scanner(System.in);
        // loop om het menu te verversen na input en input op te vangen tot EndMenu waar is
        while (!menu.isEndMenu()){
            menu.display();
            menu.interact(forum, menuInput);
        }


    }
}
