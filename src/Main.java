import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range=100;
        int number = (int) (Math.random()*range);
        System.out.println("Добро пожаловать в игру \"Угадай число\"!");
        System.out.println("Ваша задача угадать число от 0 до "+ range+ "\n");

        while (true) {
            int userGuess = scanner.nextInt();
            if (userGuess == number) {
                System.out.println("Вы угадали число!");
                break;
            } else if (Math.abs(userGuess - number) <= 5) {
                System.out.println("Очень горячо");
            } else if (Math.abs(userGuess - number) <= 10) {
                System.out.println("Горячо");
            } else if (Math.abs(userGuess - number) <= 20) {
                System.out.println("Холодно");
            } else {
                System.out.println("Очень холодно");
            }
        }
    }
}