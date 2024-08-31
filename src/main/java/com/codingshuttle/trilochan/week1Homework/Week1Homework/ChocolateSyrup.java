package com.codingshuttle.trilochan.week1Homework.Week1Homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@ConditionalOnProperty(name ="cake.syrup", havingValue = "chocolate")
public class ChocolateSyrup implements  Syrup{
    public String getSyrupType(){
        return "This is chocolate syrup";
    }
}
