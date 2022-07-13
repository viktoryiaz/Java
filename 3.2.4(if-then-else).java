//Задача 3.2.4
//
// Дан год У.Определить век. Отрицательный год - это год до нашей Эры.
// Если век до нашей Эры, то дополнительно вывести ВС. Если нашей, то AD.
//
// Формат входных данных:
//  На единственной строке задано целое число У. -4000 <= Y <= 4000, Y != 0.
//
// Формат выходных данных:
//  Положительное число и слово ВС или AD без пробелов.
//  -2000



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int y = scanner.nextInt();
     
        if (y>0) {
            if (y % 100 == 0) {
            System.out.print(y/10/10+"AD");
            } else {
            System.out.print(y/10/10+1+"AD");
            } 
        }    
        if (y<0) {
            if (y % 100 == 0) {
            System.out.print(-y/10/10+"BC");
            } else {
            System.out.print(-y/10/10+1+"BC");
            } 
        }    
    }
}  