package ru.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.test.days.*;
import ru.test.entities.Cat;
import ru.test.interfaces.WeekDay;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
public class MyConfig {

    @Bean("cat")
    public Cat getCat() {
        return new Cat();
    }

    @Bean
    public WeekDay getDay(){
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek){
            case MONDAY:
                return new Monday();
            case TUESDAY:
                return new Tuesday();
            case WEDNESDAY:
                return new Wednesday();
            case THURSDAY:
                return new Thursday();
            case FRIDAY:
                return new Friday();
            case SATURDAY:
                return new Saturday();
                default: return new Sunday();

        }
    }
}
