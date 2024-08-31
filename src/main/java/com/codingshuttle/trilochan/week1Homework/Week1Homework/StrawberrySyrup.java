package com.codingshuttle.trilochan.week1Homework.Week1Homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@ConditionalOnProperty(name ="cake.syrup", havingValue = "strawberry")
public class StrawberrySyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "This is strawberry syrup";
    }
}
