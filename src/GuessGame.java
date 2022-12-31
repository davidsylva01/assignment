import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int guess = 0;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("guess a lucky number from 1 to 10");
          if (scanner.hasNextInt() == true) guess = scanner.nextInt();

          if (guess<=5 && guess >0)
              System.out.println("too low");
              if (guess >= 7 && guess <= 10)
                  System.out.println("too low");
              if (guess > 10 || guess <1)
                  System.out.println("invalid number");

        }while (guess!=6);
        System.out.println("you are right");
    }
}
