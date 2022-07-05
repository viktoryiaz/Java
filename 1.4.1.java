//Задача 1.4.1
//
// Напишите программу, которая считывает из консоли:
//   1. Строку 
//   2. Слово
//   3. Слово
//   4. Целое число
//   5. Логическое значение
//  И выводит их на экран, каждое на новой строке
//
// Формат входных данных:
//  2 строки. Первая содержит несколько слов, разделённых пробелом. Вторя - два слова, целое число, 
//  вещественное число и логическое значение разделённые пробелом.
//  Let's try to input data
//  Hello world
//  1 3.14 TRUE
//
// Формат выходных данных:
//  Шесть строк, содержащих ответ на задачу.




import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
        
        String a = scanner.nextLine();
        String b = scanner.next();
        String c = scanner.next();
        int d = scanner.nextInt();
        double f = scanner.nextDouble();
        boolean g = scanner.nextBoolean();
     
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(f);
      System.out.println(g);
        
    }
}