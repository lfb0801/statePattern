package nl.lbs.pl;

import nl.lbs.logic.Forum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private boolean EndMenu;

    public Menu() {
        EndMenu = false;
    }

    public boolean isEndMenu() {
        return EndMenu;
    }

    public void display() {
        // Weergave forum
        System.out.println("==================================== Dieren Forum ====================================");
        System.out.println("Topic 01 - Hamster vermist! --------------------- gepost door LB ");
        System.out.println("Topic 02 - Hamster in de aanbieding! ------------ gepost door MM ");
        System.out.println("==================================== Uw opties ====================================");
        System.out.println(" 1 Verhoog uw gebruikersniveau");
        System.out.println(" 2 Verlaag uw gebruikersniveau");
        System.out.println(" 3 Voeg een comment toe");
        System.out.println(" 4 Begin een nieuwe Topic");
        System.out.println(" 5 Verlaat het Dieren Forum");
        System.out.println("==================================== Kies alstublieft een optie ====================================");
    }

    public void interact(Forum forum, Scanner menuInput) {
        String resultString;
        int menuChoice = captureInt(menuInput);
        switch (menuChoice) {
            case 1:
                resultString = forum.getForumOptionsState().upgradeUserType(forum);
                System.out.println(resultString);
                break;
            case 2:
                resultString = forum.getForumOptionsState().downgradeUserType(forum);
                System.out.println(resultString);
                break;
            case 3:
                resultString = forum.getForumOptionsState().addComment();
                System.out.println(resultString);
                break;
            case 4:
                resultString = forum.getForumOptionsState().addTopic();
                System.out.println(resultString);
                break;
            case 5:
                EndMenu = true;
                break;
            default:
                System.out.println("De interact methode is op een punt waar het niet hoort te zijn.");
        }

    }

    private int captureInt(Scanner inputVanMenu) {
        int menuIntvoer = -1;
        int laagsteOptie = 1;
        int hoogsteOptie = 5;
        while ((menuIntvoer < laagsteOptie || menuIntvoer > hoogsteOptie) && inputVanMenu.hasNext()) {
            try {
                // catch input
                menuIntvoer = inputVanMenu.nextInt();

                if (menuIntvoer < laagsteOptie || menuIntvoer > hoogsteOptie) {
                    // geef aan dat de invoer te laag was
                    System.out.println("Uw invoer was buiten de range, probeer alstublieft opnieuw.");
                } else {
                    // Bevestig de keus
                    System.out.println("U koos: " + menuIntvoer);
                }
            } catch (InputMismatchException | NumberFormatException exception) {
                // ongeldige invoer bericht
                System.out.println("Helaas, uw invoer was niet geldig, probeer alstublieft opnieuw.");
                // voeg de error toe
                System.out.println(exception.getMessage());
                // voor overtollig toetsen af
                inputVanMenu.nextLine();
                // biedt aan nog een te proberen
                System.out.println("Voer alstublieft uw nummer in en druk op enter. ");
            }
        }
        return menuIntvoer;
    }
}
