//Задача 4.3.2
//
// Дано целое число N и последовательность из N целых чисел.
// Найти максимальное число последовательности.
//
// Формат входных данных:
//  Первая строка содержащая целое число N. 1 <= N <= 10^5
//  Вторая строка содержит N целых чисел, разделенных пробелом. -10^9 <= Xi <= 10^9
//
// Формат выходных данных:
//  Единственное число - ответ на задачу.
//  5
//  -4 5 0 10 30



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        
        for (int i=0; i<n; i++) {
            int x = scanner.nextInt();
            if(max < x) {
                max= x;
            }
        }   
        System.out.print(max);
    }
} 