package com.codingshuttle.trilochan.week1Homework.Week1Homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    final private  Frosting frosting;
    final private Syrup syrup;

    public CakeBaker(Frosting frosting, Syrup syrup){
        this.frosting = frosting;
        this.syrup = syrup;
    }
    void bakeCake(){
       System.out.println(frosting.getFrostingType());
       System.out.println(syrup.getSyrupType());
    }
}
