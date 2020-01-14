package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //demoDifference();
    }
    public static void demo1(){
        //Set is an interface that only store distinct value
        Set<String> setA = new HashSet<>();
        //Set<String> setA = new HashSet<>(Arrays.asList("mango","banana","orange","banana"));
        setA.add("mango");
        setA.add("banana");
        setA.add("orange");
        setA.add("banana");
        //Show entire set
        System.out.printf("%s\n",setA);
    }

    public static void demo2(){
        List<String> fruits = new ArrayList<String>(Arrays.asList("mango","banana","orange","banana"));
        //Different type of set
        Set<String> setA = new HashSet<>(fruits);
        Set<String> setB = new LinkedHashSet<>(fruits);
        Set<String> setC = new TreeSet<>(fruits);

        System.out.printf("HashSet: %s\n",setA);//Random
        System.out.printf("LinkedHashSet: %s\n",setB);//Input order
        System.out.printf("TreeSet: %s\n",setC);//Sort by value min->max
    }

    public static void demoUnion(){
        Set<String > setA = new HashSet<>(Arrays.asList("A","B","C"));
        Set<String > setB = new HashSet<>(Arrays.asList("B","C","D","E","F"));
        System.out.printf("A: %s\n",setA);
        System.out.printf("B: %s\n",setB);

        Set<String> setC = new HashSet<>();
        setC.addAll(setA);
        setC.addAll(setB);

        setA.addAll(setB);
        System.out.printf("A union B: %s\n",setA);
        System.out.printf("SetC: %s\n",setC);
    }
    public static void demoIntersection(){
        Set<String > setA = new HashSet<>(Arrays.asList("A","B","C"));
        Set<String > setB = new HashSet<>(Arrays.asList("B","C","D","E","F"));
        System.out.printf("A: %s\n",setA);
        System.out.printf("B: %s\n",setB);

        Set<String> setC = new HashSet<>();
        setC.addAll(setA);
        setC.retainAll(setB);

        setA.retainAll(setB);
        System.out.printf("A intersect B: %s\n",setA);
        System.out.printf("setC: %s\n",setC);
    }
    public static void demoDifference(){
        Set<String > setA = new HashSet<>(Arrays.asList("A","B","C"));
        Set<String > setB = new HashSet<>(Arrays.asList("B","C","D","E","F"));
        System.out.printf("A: %s\n",setA);
        System.out.printf("B: %s\n",setB);

        Set<String> setC = new HashSet<>();
        setC.addAll(setA);
        setC.removeAll(setB);

        setA.removeAll(setB);
        System.out.printf("A difference B: %s\n",setA);
        System.out.printf("setC: %s\n",setC);
    }
}
