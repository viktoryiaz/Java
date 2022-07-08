//Задача 2.2.1
//
// Посчитать значение выражения: (2а + 0.5b)³ + с
//
// Формат входных данных:
//  Три вещественных числа, разделённые пробелом. -1000 <= a,b,c <=1000. 
//
// Формат выходных данных:
//  Единственное вещественное число - ответ на задачу.
// 0.5 2 -1



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x = 2 * a + 0.5 * b;
        
           System.out.println(x*x*x+c);
    }
}   