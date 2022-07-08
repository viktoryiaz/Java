//Задача 2.5.2
//
// Заданы три целых числа А, В, С.
// Ответить на вопрос, можно ли построить треугольник с длинами сторон А, В, С. 
//
// Формат входных данных:
//  Три целых числа А, В, С, разделенные пробелом. -10^7 <= А, В, С <= 10^7
//
// Формат выходных данных:
//  Единственное слово true, если можно. false, если нельзя.
// 10 5 7



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
            
        System.out.print(a<b+c && b<a+c && c<a+b);
    }
}   