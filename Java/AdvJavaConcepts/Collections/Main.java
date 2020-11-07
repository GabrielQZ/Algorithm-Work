package com.company;

public class Main {

    public static void main(String[] args) {

//        var myStringList = new GenericList<String>(3);
//
//        myStringList.add("hello");
//        myStringList.add("world");
//
//        Iterator<String> iterator = myStringList.iterator();

        //what a for each loop is actually doing
//        while (iterator.hasNext()) {
//            String current = iterator.next();
//            System.out.print(current+" ");
//        }
//        System.out.println();
        //this code is often replaced by a foreach loop that the compiler will end up replacing with the code above
//        for ( String word : myStringList) {
//            System.out.print( word +" ");
//        }

        Collections_IntroExamples.show();

        List_IntroExamples.show();

        Comparable_IntroExamples.show();

        Queue_IntroExamples.show();

        Set_IntroExamples.show();

        HashMap_IntroExamples.show();

    }
}
