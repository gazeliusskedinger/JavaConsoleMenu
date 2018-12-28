import java.io.File;
import java.util.Scanner;

public abstract class X {


    /**
     * Extra over all is just a class to make the everyday coding stuff easier to write.
     * Simples said just a bunch of help methods po make writing code more effective and readable;
     */

    /**
     * Console println
     * @param text
     */

    public static void println(String text){
        System.out.println(text);
    }

    /**
     *
     * @param filePath
     * @return
     */

    protected static String readFile(String filePath){
        String text = "";
        File file = new File(filePath);
        try {
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                text = text+in.nextLine()+"\n";
            }
            in.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return text;
    }
}
