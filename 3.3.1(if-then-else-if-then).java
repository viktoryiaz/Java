//Задача 3.3.1
//
// Дано число Х. Необходимо вычислить функцию сигнум (знак числа):
//          {  1,  x>0
//  sgn x = {  0,  x=0
//          { -1,  x<0
//           
// Формат входных данных:
//  На единственной строке задано целое число Х. 
//  -10^9 <= Х <= 10^9.
//
// Формат выходных данных:
//  Единственное число ответ на задачу.
//  -20



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int x = scanner.nextInt();
        String result;
     
        if (x>0) {
            result = "1";
        } else if (x <0) {
            result = "-1";
        } else {
            result = "0";
        }    
        System.out.print(result);
    }
}  