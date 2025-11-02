import java.util.Scanner;

public class PracticeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Робота з масивами та умовами у Java ===");

        System.out.print("Введіть кількість елементів масиву: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] numbers = new int[n];

        System.out.println("Введіть " + n + " цілих чисел:");
        for (int i = 0; i < n; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(sc.nextLine());
        }

        int sum = 0, max = numbers[0], min = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }

        double avg = (double) sum / n;

        System.out.println("\n=== Результати обчислень ===");
        System.out.println("Сума елементів: " + sum);
        System.out.println("Середнє значення: " + avg);
        System.out.println("Максимум: " + max);
        System.out.println("Мінімум: " + min);

        System.out.println("\nПарні числа з масиву:");
        boolean found = false;
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                found = true;
            }
        }
        if (!found) System.out.print("немає парних чисел");
        System.out.println();

        System.out.println("\n=== Кінець програми ===");
    }
}
