//Задача 3.2.3
//
// Дан год У.Определить количество дней в этом году.
// Внимание, високосный год считается следующим образом:
// - год, номер котрого кратен 400 - високосный;
// - остальные годы, номер котроых кратен 100 - невисокосные;
// - остальные годы, номер котроых кратен 4 - високосные.
//
// Формат входных данных:
//  На единственной строке задано целое число У. 1 <= Y <= 4000
//
// Формат выходных данных:
//  Единственное число - ответ на задачу.
//  2019



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int y = scanner.nextInt();
     
        if ((y%4==0 && y%100==0 && y%400==0) || (y%100==0 && y%400==0) || y%4==0) {
            System.out.print("366");
        } else {
            System.out.print("365");
        } 
    }
}  