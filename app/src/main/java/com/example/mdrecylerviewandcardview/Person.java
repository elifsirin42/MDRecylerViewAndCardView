package com.example.mdrecylerviewandcardview;

public class Person {

    private String name;
    private String job;

    public Person(){
        name=null;
        job=null;
    }
    public Person(String name,String job){
        this.name=name;
        this.job=job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
