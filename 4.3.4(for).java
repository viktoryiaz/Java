//Задача 4.3.4
//
// Дано целое число N и последовательность из N целых чисел.
// Найти среднее арифметическое последовательности чисел.
//
// Формат входных данных:
//  Первая строка содержащая целое число N. 1 <= N <= 10^5
//  Вторая строка содержит N целых чисел, разделенных пробелом. -1 * 10^4 <= Xi <= 10^4
//
// Формат выходных данных:
//  Единственное число - ответ на задачу.
//  4
//  1 2 3 -10



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int n = scanner.nextInt();
        double sum = 0.0;
        
        for (int i=0; i<n; i++) {
            int x = scanner.nextInt();
            sum += x;
        }   
        System.out.print(sum/n);
    }
}  