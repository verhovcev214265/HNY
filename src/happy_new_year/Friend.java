package happy_new_year;
public class Friend {

    private static final String WISH = " I wish you a Merry Christmas and a Happy New Year =) ";
    private static final String SPACE = " ";
    private static final String INCORRECT_MESSAGE = "Incorrect Symbol";
    private static final String YELLOW_PRINT = "\u001B[33m";

    private String firstName;

    public String greeting(int input){
        try {
            if (input == 1){
                firstName = YELLOW_PRINT + "Valentin";
            }else if (input == 2){
                firstName = YELLOW_PRINT + "Elijah";
            }else if (input == 3){
                firstName = YELLOW_PRINT + "Nadin";
            }else {
                System.out.println(YELLOW_PRINT + "I don`t know who are you, but I wish you a Happy New Year too!");
            }
        }catch (Exception e){
            return INCORRECT_MESSAGE;
        }
        return String.join(SPACE, firstName, WISH);
    }

}
