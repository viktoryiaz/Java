//Задача 2.2.4
//
// Дано целое положительное четырёхзначное число Х. Найти сумму цифр.
//
// Формат входных данных:
//  Единственное целое число Х. 1000 <= Х <= 9999 
//
// Формат выходных данных:
//  Единственное число - ответ на задачу.
//  1234



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int x = scanner.nextInt();
        int a = x % 10;
        int b = x % 100 / 10;
        int c = x % 1000 / 100;
        int d = x % 10000 / 1000;
        
           System.out.print(a + b + c + d);
    }
}   