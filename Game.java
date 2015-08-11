import java.io.Console;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Console myConsole = System.console();


        System.out.println("Input a number");
        String userNumber = myConsole.readLine();
        Integer number = Integer.parseInt(userNumber);
            Random myGenerator = new Random();
            System.out.println(myGenerator.nextInt(number));

        System.out.println("Are you a good programmer??? Let's see what the program thinks about it :-)");
        System.out.println(myGenerator.nextBoolean());



    }
}
