package com.codingshuttle.trilochan.week1Homework.Week1Homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@ConditionalOnProperty(name ="cake.frosting", havingValue = "strawberry")
public class StrawberryFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "This is strawberry frosting";
    }
}
