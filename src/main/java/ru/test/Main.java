package ru.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.test.entities.Cat;
import ru.test.interfaces.WeekDay;

public class Main {
    public static void main(String[] args) {
        System.out.println("123123");

        ApplicationContext context = new AnnotationConfigApplicationContext("ru.test.config");
        Cat cat = (Cat) context.getBean("cat");
        System.out.println(cat.getName());

        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("it's  " + weekDay.getWeekDayName() + " today!!! ");
    }
}
