package luyencode;

import java.util.Scanner;

public class dk10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        if (month <= 0 || month > 12 || (year <= 0)) {
            System.out.println("INVALID");
        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println(31);
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println(30);
            } else {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
            }
        }
        sc.close();
    }
}
