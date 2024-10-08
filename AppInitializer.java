import java.util.Scanner;
public class AppInitializer{
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
}