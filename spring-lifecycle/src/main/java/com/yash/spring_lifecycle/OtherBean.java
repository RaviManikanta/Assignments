 	package com.yash.spring_lifecycle;

 	public class OtherBean {
 	    private String message;

 	    public OtherBean(String message) {
 	        this.message = message;
 	    }

 	    @Override
 	    public String toString() {
 	        return "OtherBean{" +"message='" + message + '\'' +'}';
 	    }
 	}