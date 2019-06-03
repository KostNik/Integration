package com.edu;

public class B extends A {


    public String k;

    public B(String k) {
        super.k = k.codePointAt(1);
    }
}
