package com.codingshuttle.trilochan.week1Homework.Week1Homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@ConditionalOnProperty(name ="cake.frosting", havingValue = "chocolate")
public class ChocolateFrosting implements  Frosting{
    public String getFrostingType(){
        return "This is chocolate frosting";
    }
}
