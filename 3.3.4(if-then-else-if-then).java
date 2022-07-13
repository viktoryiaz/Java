//Задача 3.3.4
//
// ITWoman пригласила ITMan'a к себе на день рождения.ITMan купил подарок и продавцы запаковали
// его в коробку в форме параллелепипеда с длинами сторон А,В,С. 
// ITMan вспомнил, что дверь в квартиру ITWoman размером WxH.
// ITMan хочет знать, сможет ли он занести подарок в квартиру.
//           
// Формат входных данных:
//  На первой строке задано три целых числа А,В,С, разделенные пробелом. 
//  1 <= А,В,С <= 10^9.
//  На второйстроке задано два целых числа W и H, разделенные пробелом. 
//  1 <= W и H <= 10^9.
//
// Формат выходных данных:
//  Единственное слово: YES, если сможет. NO, если нет.
//  1 4 3
//  2 3



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        String result;
     
        if ((a <= h && b <= w) || (b <= h && a <= w)) {
            result = "YES";
        } else if ((c <= w && a <= h) || (a <= w && c <= h)) {
            result = "YES";
        } else if ((b <= h && c <= w) || (b <= w && c <= h)) {
            result = "YES";
        } else {
            result = "NO";
        }    
        System.out.print(result);
    }
}