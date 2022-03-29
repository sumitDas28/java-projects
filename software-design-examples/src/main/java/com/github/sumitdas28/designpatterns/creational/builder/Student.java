package com.github.sumitdas28.designpatterns.creational.builder;

public class Student {

    private String name;
    private String university;
    private  int age;

    public Student(Student.Builder builder) {
        this.name=builder.name;
        this.university=builder.university;
        this.age=builder.age;
    }

    public static class Builder {
        private final String name;  //mandatory
        private final String university; //optional
        private  int age;          //optional

        public Builder(String name, String university) {
            this.name = name;
            this.university = university;
        }

        public Student.Builder setAge(int age){
            this.age=age;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", age=" + age +
                '}';
    }
}
