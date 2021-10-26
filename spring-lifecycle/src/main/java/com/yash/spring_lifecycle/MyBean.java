package com.yash.spring_lifecycle;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBean {
    private OtherBean otherBean;

    public MyBean() {
        System.out.println("MyBean constructor");
    }

    @PostConstruct
    public void myPostConstruct() {
        System.out.println(" @PostConstruct method");
    }

    @Autowired
    public void setOtherBean(OtherBean otherBean) {
        System.out.println("setOtherBean(): " + otherBean);
        this.otherBean = otherBean;
    }

    public void doSomething() {
        System.out.println("doSomething()");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("@PreDestroy method");
    }
}