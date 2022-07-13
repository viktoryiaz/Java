//Задача 3.4.2
//
// Дана дата: день D, месяц М, год У. Проверить правильная ли введена дата (существует ли она в календаре).
// Правильным считать только года нашей эры.
// Внимание, високосный год считается следующим образом:
// - год, номер котрого кратен 400 - високосный;
// - остальные годы, номер котроых кратен 100 - невисокосные;
// - остальные годы, номер котроых кратен 4 - високосные.
//           
// Формат входных данных:
//  На единственной строке задано три числа D,М,У, разделенные пробелом.
//  -1000 <= D,М,У <= 1000.
//
// Формат выходных данных:
//  YES, если введена правильная дата, NO, если нет.
//  29 2 2019



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();
        String result;

        if (y>0 && m>0 && m<=12 && d>0) {
            switch(m) {
                case 1:
                case 3:
                case 5:    
                case 7:
                case 8:   
                case 10: 
                case 12: 
                    if(d<=31 && d>0) {
                        System.out.print("YES");
                    } else {
                        System.out.print("NO");
                    }
                    break;
                case 4:
                case 6:
                case 9:    
                case 11:
                    if(d<=30 && d>0) {
                        System.out.print("YES");
                    } else {
                        System.out.print("NO");
                    }
                    break;
                case 2:
                    if(d<=28 && d>0) {
                        System.out.print("YES");
                    }
                    else if((y%4==0 && y%100==0 && y%400==0) || (y%100==0 && y%400==0) || (y%4==0 && y%100==0)) {
                        System.out.print("YES");
                    } 
                    else {
                        System.out.print("NO");
                    }
                    break;
            }
        } else {
            System.out.print("NO");
        }    
    }
}  