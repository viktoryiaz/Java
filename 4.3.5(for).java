//Задача 4.3.5
//
// Вывести первых N элементов арифметической прогрессии по заданным
//  а1 - первый эемент прогрессии, d - разность прогрессии.
//
// Формат входных данных:
//  Единственная строка, содержащая три целых числа, разделенных пробелом N,a1,d. 
//  1 <= N <= 10^5, -10^9 <= a1, d < 10^9
//
// Формат выходных данных:
//  N целых чисел,каждое с новой строки. Гарантируется, что -10^9 <= ai <= 10^9
//  3 1 2



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int n = scanner.nextInt();
        int a1 = scanner.nextInt();
        int d = scanner.nextInt();
        
        for (int i=0; i<n; i++) {
            a1 += d;
        System.out.println(a1-d);
        }
    }
} 