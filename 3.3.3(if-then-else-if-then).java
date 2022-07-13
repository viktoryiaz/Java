//Задача 3.3.3
//
// Дан светофор. Он горит 3 цветами (r-red, y-yellow, g-green).
// Цвета меняются по очереди R->Y->G->Y->R->Y->G->Y->....
// В программу вводится 4 целых числа r,y,g -сколько горит каждый цвет в секундах 
// и s - количество секунд, прошедших с 0 секунды.
// В 0 секунду загорается красный цвет.
// Например если задано r = y = g =1, s = 5, то:
//  -в 0 секунду горит red
//  -в 1 - yellow
//  -в 2 - green
//  -в 3 - yellow
//  -в 4 - red
//  -в 5 - yellow
// Программа должна вывести цвет (red, yellow, green), который будет гореть в момент s.
//           
// Формат входных данных:
//  На единственной строке задано четыре целых числа r,y,g,s, разделенные пробелом. 
//  1 <= r,y,g <= 10^9, r + y + g <= 10^9, 0 <= s <= 10^9.
//
// Формат выходных данных:
//  Единственное слово red, yellow или green.
//  2 2 2 5



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int r = scanner.nextInt();
        int y = scanner.nextInt();
        int g = scanner.nextInt();
        int s = scanner.nextInt();
        int sum = s % (r+y+g+y);
     
        if (sum < r) {
            System.out.print("red");
        } else if (sum < r+y) {
            System.out.print("yellow");
        } else if (sum < r+y+g) {
            System.out.print("green");
        } else {
            System.out.print("yellow");
        }    
    }
}  