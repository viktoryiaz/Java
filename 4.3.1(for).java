//Задача 4.3.1
//
// Дано целое число N и последовательность из N целых чисел.
// Для каждого числа вывести его квадрат.
//
// Формат входных данных:
//  Первая строка содержащая целое число N. 1 <= N <= 10^5
//  Вторая строка содержит N целых чисел, разделенных пробелом. -1 * 10^4 <= Xi <= 10^4
//
// Формат выходных данных:
//  N целых чисел, разделенных пробелом.
//  5
//  -4 5 0 10 30



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int n = scanner.nextInt();
        
        for (int i=0; n>i; i++) {
            int x = scanner.nextInt();
            System.out.print(x*x+" ");
        }   
    }
} 