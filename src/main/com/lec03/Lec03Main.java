package main.com.lec03;

import main.com.etc.java.JavaPerson;

public class Lec03Main {
    public static void main(String[] args) {
        JavaPerson javaPerson = new JavaPerson("류욱상", 100);
        String log = String.format(
                "사람의 이름은 %s이고 나이는 %s세 입니다.",
                javaPerson.getName(),
                javaPerson.getAge()
        );

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("사람의 이름은");
        stringBuilder.append(javaPerson.getName());
        stringBuilder.append("이고 나이는");
        stringBuilder.append(javaPerson.getAge());
        stringBuilder.append("세 입니다.");

        String str = "ABCDE";
        char ch = str.charAt(1);
    }

    public static void printAgeIfPerson(Object obj) {
        if (obj instanceof JavaPerson) {
            JavaPerson javaPerson = (JavaPerson) obj;
            System.out.println(javaPerson.getAge());
        }
    }
}
