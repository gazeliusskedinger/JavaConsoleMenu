import javafx.scene.web.HTMLEditorSkin;

import java.util.Scanner;

public class ComandLineMenu extends X {

    private static Scanner sc;
    private String menuGuide = readFile("Menu_guide");

    public ComandLineMenu(){
        menu();
    }

    /**
     * Menu
     */

    private void menu(){
        String menuGuide = readFile("Menu_guide");
        println(readFile("intro_title.dat"));
        choise();
        sc.close();
    }

    private void choise() {

        sc = new Scanner(System.in);
        String input = "";

        println(menuGuide);
        input = sc.nextLine();

        if (input.equals("0")) {
            println("Exiting!");
        }
        else if (input.equals("1")) {
            println("Do Someting.");
            choise();
        }
        else if (input.equals("2")) {
            println("Do Someting Else.");
            choise();
        }
        else if(input.equals("3")){
            println("Do A Third Thing.");
            choise();
        }
        else{
            println("Wrong Input\nTry Again!");
            choise();
        }
    }
}


