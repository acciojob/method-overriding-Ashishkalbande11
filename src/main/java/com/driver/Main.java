package com.driver;

public class Main {
    public static class A{
        //Task 2 create meth method
        public String meth(){
            return "Invoking method from class A";
        }
    }
    //Task 3
    public static class B extends A {
        //    Task 4 method overriding
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String args[]){
//Task 5 creat obj og class B
        B obj = new B();
        System.out.println(obj.meth());
    }
}