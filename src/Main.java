import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 1 до 6");
        int number = scan.nextInt();
        int random = 1 + ( int ) (Math.random() * 6);
        System.out.println("Ваше число " + number + ". Выстрел в " + random);
        if (number == random) {
            System.out.println("You lost");
        } else {
            System.out.println("You win");
        }

        // 2222222222

        int count = 0;
        random = 0;
        while (number != random) {
            System.out.println("Введите число от 1 до 6");
            number = scan.nextInt();
            random = 1 + ( int ) (Math.random() * 6);
            System.out.println("Ваше число " + number + ". Выстрел в " + random);
            if (number != random) {
                System.out.println("You win");
                count++;
            }
        }
        System.out.println("Ты проиграл. Количество заработанных очков: " + count);

        // 333333333333

        int [] arr = new int[3];
        while (number != arr[0] && number != arr[1] && number != arr[2]) {
            System.out.println("Введите число от 1 до 6");
            number = scan.nextInt();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 1 + ( int ) (Math.random() * 6);
            }
            System.out.println("Проигрышные числа " + Arrays.toString(arr));
        }
        System.out.println("You lost this game");

        // 44444444

        count = 0;
        System.out.println("Введите уровень сложности от 1 до 3");
        int level = scan.nextInt();
        System.out.println("Введите число от 1 до 6");
        number = scan.nextInt();
        switch (level) {
            default:
                System.out.println("Что-то не то");
                break;
            case 3:
                count++;
                random = 1 + ( int ) (Math.random() * 6);
                System.out.println("Выстрел на " + random);
                if (random == number) {
                    System.out.println("Вы проиграли. Количество заработанных очков " + count);
                    break;
                }
            case 2:
                count++;
                random = 1 + ( int ) (Math.random() * 6);
                System.out.println("Выстрел на " + random);
                if (random == number) {
                    System.out.println("Вы проиграли. Количество заработанных очков " + count);
                    break;
                }
            case 1:
                count++;
                random = 1 + ( int ) (Math.random() * 6);
                System.out.println("Выстрел на " + random);
                if (random == number) {
                    System.out.println("Вы проиграли. Количество заработанных очков " + count);
                    break;
                }
        }
        if(random != number) {
            System.out.println("Вы выиграли на этот раз. Количество заработанных очков " + count);
        }
    }
}