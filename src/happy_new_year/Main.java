package happy_new_year;
import java.util.Scanner;

public class Main {
    private static final String BLUE_PRINT = "\u001B[34m";

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit){
            System.out.println(BLUE_PRINT + "If you Valentin enter 1, if you Elijah enter 2, if you Nadin enter 3. \n" +
                                            "If you want to go out enter 0.");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            if (input != 0){
                String output = new Friend().greeting(input);
                System.out.println(output);
            }else{
                System.out.println("Bye - bye");
                exit = true;
            }
        }
    }

}
