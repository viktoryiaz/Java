//Задача 2.4.2
//
// Вводится целое число х. Проверить, является ли число нечётным.
// Вывести true, если число нечётное, false - если чётное. 
//
// Формат входных данных:
//  Целое число х. -10^9 <= A, B <= 10^9
//
// Формат выходных данных:
//  Единственное слово true или false.
//  1



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int x = scanner.nextInt();
        int a = x % 2;
            
        System.out.print(a != 0);
    }
}   