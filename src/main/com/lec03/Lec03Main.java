package main.com.lec03;

import main.com.etc.Person;

public class Lec03Main {
    public static void main(String[] args) {
        Person person = new Person("류욱상", 100);
        String log = String.format(
                "사람의 이름은 %s이고 나이는 %s세 입니다.",
                person.getName(),
                person.getAge()
        );

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("사람의 이름은");
        stringBuilder.append(person.getName());
        stringBuilder.append("이고 나이는");
        stringBuilder.append(person.getAge());
        stringBuilder.append("세 입니다.");

        String str = "ABCDE";
        char ch = str.charAt(1);
    }

    public static void printAgeIfPerson(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }
}