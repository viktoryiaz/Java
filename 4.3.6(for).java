//Задача 4.3.6
//
// Дано число Х. Вывести сумму всех цифр числа.
//
// Формат входных данных:
//  Единственная строка содержащая целое число Х. -10^9 <= Х <= 10^9
//
// Формат выходных данных:
//  Единственное число - ответ на задачу.
//  123



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int x = scanner.nextInt();
        int sum = 0;
        
        for (int i=0; x!=0; i++) {
            sum += (x % 10);
            x /= 10;
        }
        if (sum<0) {
            sum *= -1;
        }
        System.out.print(sum);
    }
} 