package com.epam.java18.lambda.link_on_contructor.fabric_constructor;

 class MyClass<T> {
     private T val;

     public MyClass(T val) {
         this.val = val;
     }

     public T getVal() {
         return val;
     }

     public void setVal(T val) {
         this.val = val;
     }
 }
