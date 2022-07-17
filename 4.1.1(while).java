//Задача 4.1.1
//
// Дано число N. Вывести числа с N - 1(включительно) по 0(включительно), каждое с новой строки.
//
// Формат входных данных:
//  Единственная строка, содержащая целое число N  1 <= N <= 10^5
//
// Формат выходных данных:
//  N целых чисел, каждое с новой строки.
//  5



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int n = scanner.nextInt();
        int x = 0;
        int b = n-1;
        while (b>=x) {
            System.out.println(b);
            b--;
        }    
    }
}   