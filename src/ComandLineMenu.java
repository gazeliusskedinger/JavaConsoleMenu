import java.io.File;
import java.util.Scanner;

public class ComandLineMenu {


    public static void main(String[] args) {
        menu();
    }

    /**
     * Menu
     */

    private static void menu(){
        String input;
        String menuGuide = readMessage("Menu_guide");
        Scanner sc = new Scanner(System.in);
        System.out.println(readMessage("intro_title.dat"));
        do {
            System.out.print(menuGuide);
            input = sc.nextLine();
            switch (input){
                case "0":
                    System.out.println("Exiting!");
                    break;
                case "1":
                    System.out.println("Do Someting.");
                    break;
                case "2":
                    System.out.println("Do Someting Else.");
                    break;
                case "3":
                    System.out.println("Do A Third Thing.");
                    break;
                default:
                    System.out.println("Wrong Input\nTry Again!");
            }

        }while(!input.equals("0") );
        sc.close();
    }

    /**
     * The title reader
     */
    private static String readMessage(String filepath){
        String menu = "";
        File file = new File(filepath);
        try {
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                menu = menu+in.nextLine()+"\n";
            }
            in.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return menu;
    }
}


