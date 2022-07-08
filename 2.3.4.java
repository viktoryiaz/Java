//Задача 2.3.4
//
// Часы показывают время H0 часов M0 минут S0 секунд.
// Сколько времени будет на часах через H1 часов M1 минут S1 секунд.
//
// Формат входных данных:
//  Две строки.Первая содержит три числа H0 M0 S0.Вторая содержит три числа H1 M1 S1.
//  Где 0 <= H0, H1 <= 23, 0 <= M0, M1 <= 59, 0 <= S0, S1 <= 59.
//
// Формат выходных данных:
//  Единственное строка, содержащая ответ три числа H2 M2 S2, разделённые пробелом.
//  Где 0 <= H2 <= 23, 0 <= M2 <= 59, 0 <= S2 <= 59.
//  0 13 20
//  5 11 17



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int h0 = scanner.nextInt();
        int m0 = scanner.nextInt();
        int s0 = scanner.nextInt();
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();

        int h3 = ((h0+h1)+((m0+m1)+(s0+s1)/60)/60)%24;
        int m3 = ((s0+s1)/60+(m0+m1))%60;
        int s3 = (s0+s1)%60;
        
        System.out.print(h3 +" "+ m3 +" "+ s3);
    }
}   