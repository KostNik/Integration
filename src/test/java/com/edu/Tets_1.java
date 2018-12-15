package com.edu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tets_1 {

    List<String> strings = new ArrayList<>(Arrays.asList("B"));

    @Test
    public void testIt() {
        strings.add("A");
        System.out.println(strings);
    }

    @Test
    public void testItе() {
        strings.add("С");
        System.out.println(strings);
    }





}
