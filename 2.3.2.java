//Задача 2.3.2
//
// Дано линейное уравнение с одним неизвестным a*x=b. Напишите программу, которая решает данное уравнение
//
// Формат входных данных:
//  Единственная строка содержит два вещественных числа a и b.
//  -100000 <= A, B <= -100000, B ≠ 0.
//
// Формат выходных данных:
//  Единственное строка, содержащая ответ на задачу в формате x = expression = answer, где expression - выражение, которое получает х (с соблюдением code style), answer - значение найденного х.
//  5.0 10.0



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double x = b / a;
        
        System.out.println("x = "+b+" / "+a+" = "+x);
    }
}   