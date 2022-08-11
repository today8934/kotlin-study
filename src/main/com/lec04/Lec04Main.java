package main.com.lec04;

import main.com.etc.JavaMoney;

public class Lec04Main {

    public static void main(String[] args) {
        JavaMoney javaMoney = new JavaMoney(2000L);
        JavaMoney javaMoney1 = new JavaMoney(1000L);

        if (javaMoney.compareTo(javaMoney1) > 0) {
            System.out.println("Money가 Money1보다 금액이 큽니다.");
        }

        JavaMoney javaMoney2 = new JavaMoney(1000L);
        JavaMoney javaMoney3 = javaMoney2;
        JavaMoney javaMoney4 = new JavaMoney(1000L);

        System.out.println(javaMoney2 == javaMoney3);
        System.out.println(javaMoney2 == javaMoney4);
        System.out.println(javaMoney2.equals(javaMoney4));

        JavaMoney javaMoney5 = new JavaMoney(1000L);
        JavaMoney javaMoney6 = new JavaMoney(2000L);

        System.out.println(javaMoney5.plus(javaMoney6));
    }
}
