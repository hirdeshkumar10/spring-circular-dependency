package com.sunglowsys.bean;

import org.springframework.stereotype.Component;

@Component
public class B {
    private A a ;

    public B(A a){
        this.a = a ;
    }

    public void getB(){
        System.out.println("from b");
    }
}
