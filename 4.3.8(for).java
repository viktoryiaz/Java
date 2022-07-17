//Задача 4.3.8
//
// Числа Фибоначчи задаются следующим образом:
// F0 = 0, F1 = 1, Fn = Fn-1 + Fn-2, n>=2, n(-Z
// Вам дано N, необходимо вычислить Fn
//
// Формат входных данных:
//  Единственная строка содержащая целое число N. 0 <= Х <= 46
//
// Формат выходных данных:
//  Единственное число - ответ на задачу.
//  5



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int n = scanner.nextInt();
        int n1 = 1;
        int n2 = 1;
        int a = 0;
        
        if (n==0) {
            System.out.print(0);
        }
        if (n==1) {
            System.out.print(1);
        } else if (n>1) {
            for (int i=0; i<(n-2); i++) {
                a = n2 + n1;
                n1 = n2;
                n2 = a;
            }
            System.out.print(a);
        }   
    }
} 