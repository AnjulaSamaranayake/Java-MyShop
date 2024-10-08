import java.util.Scanner;
public class AppInitializer{

    static String[][] user = new String[3][2];
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[] startQuestion = {
            "1) DO you want to Login ? ",
            "2) DO you want to Register ?",
            "3) DO you want to Exit ?"
        };

        for (String temp: startQuestion) {
            System.out.println(temp);
        }

        int userInput = input.nextInt();

        switch (userInput) {
            case 1:
            break;
            case 2:
            break;
            case 3:
            break;
            default:
            return;
        }
    }

    //Login Method

    public static boolean login(){
        return false;
    }

    //Register Method

    public static boolean register(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert your Email: ");
        String email = input.nextLine();
        System.out.println("Insert your Password: ");
        String password = input.nextLine();

        if(user[user.length-1][0] != null){
            System.out.println("Sorry... Database is full...!");
            return false;
        }

        for (int i = 0; i< user.length; i++){

            if(user[i][0]==null){
                user[i][0] = email;
                user[i][1] = password;
                System.out.println("Registration Successful!");
                return true;
            } else {
                if(user[i][0].equalsIgnoreCase(email)) {
                    System.out.println("Email already exists...!");
                    return false;
                }
            }
        }
        return false;
    }
}