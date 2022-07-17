//Задача 4.1.2
//
// Дано целое число N и последовательность из N целых чисел.
// Для каждого числа вывести абсолютные значения (модули чисел)
//
// Формат входных данных:
//  Первая строка, содержащая целое число N.  1 <= N <= 10^5
//  Вторая строка содержит N целых чисел, разделенных пробелом.-10^9 <= Xi <= 10^9
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
        
        while (n>0) {
            int x = scanner.nextInt();
            if (x<0) {
                System.out.print((-1*x)+" ");
            } else {
            System.out.print(x+" ");
            }
            n--;
        }    
    }
} 