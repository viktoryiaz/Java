//Задача 3.4.1
//
// Напишите калькулятор, который принимает 2 вещественных числа А,В и один из
// операторов ОР (+, -, * или /) и выводит результат на экран
//           
// Формат входных данных:
//  На единственной строке задано три литерала А, ОР, В, разделенные пробелом.
//  А и В вещественные числа, 1 <= А,В <= 10^6. ОР - слово +, -, * или /.
//
// Формат выходных данных:
//  Единственное число - результат операции.
//  5 * 2



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        double a = scanner.nextDouble();
        String x = scanner.next();
        double b = scanner.nextDouble();

       switch (x) {
            case "*":
               System.out.print(a*b);
            break;   
            case "/":
               System.out.print(a/b);
            break;     
              case "+":
               System.out.print(a+b);
            break;   
            default:
               System.out.print(a-b);
              break; 
       }
    }
}  