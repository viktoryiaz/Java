//Задача 2.4.1
//
// Вводится 2 целых числа А и В. Программа должна ответить на 6 вопросов:
// 1. А больше В?
// 2. А больше или равно В?
// 3. А равно В?
// 4. А не равно В?
// 5. А меньше В?
// 6. А меньше или равно В?
// Вывести true при утвердительном ответе, false при отрицательном.
//
// Формат входных данных:
//  Два целых числа А и В через пробел. -10^9 <= A, B <= 10^9
//
// Формат выходных данных:
//  Шесть строк содержащих true или false.
// 2 1 



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int a = scanner.nextInt();
        int b = scanner.nextInt();
            
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a <= b);
    }
}   