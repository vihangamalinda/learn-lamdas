package com.packages.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TypeOfStream {

    public static void main(String[] args) {

        Integer [] scores = new Integer[]{1,3,4,56,7,3,24,5,55};
        Stream<Integer> scoreStream = Arrays.stream(scores);
        List<Integer> teamPassed = scoreStream.filter(num -> num >=20).collect(Collectors.toList());
        System.out.println(teamPassed);

        List<String> stringList = new ArrayList<>();
        stringList.add("Coffee");
        stringList.add("Bread");
        stringList.add("Dinner");

        stringList.add("Meat");
        stringList.add("Meal");
        stringList.add("Apple");
        stringList.add("Orange");
        stringList.add("Fish");
        stringList.add("Rice");
        System.out.println(stringList);

        List<String> stringListFiltered =stringList.stream()
                .map(item -> item.toUpperCase())
                .filter(item-> item.startsWith("M"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(stringListFiltered);

        Stream<String> letterStream = Stream.of("aaaaaaa","cccccc","bbbbb","cccccccc");
        List<String> letterList = letterStream.map(item->item.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println(letterList);


    }

}
