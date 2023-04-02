package com.example.tutorial.myConfig;


import com.example.tutorial.Util.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


@Configuration
public class Config{


    @Bean
    @Qualifier("primary1")
    @Lazy
    public Student getStudent()
    {
        System.out.println("I m in bharat");
        return new Student("bharat",1);
    }

    @Bean
    @Qualifier("primary")
    @Lazy
    public Student getStudent1()
    {
        System.out.println("I m in param");
        return new Student("param_motu",2);
    }

}