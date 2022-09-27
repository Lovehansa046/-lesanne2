import java.util.Scanner;

public class ulesanne2 {
    public static void main(String[] args) {
        System.out.println("Введите трех значное число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Сумма цифр числа " + number + " равна: " + ((number%10)+((number/10)%10)+((number/100)%10)));
    }
}
