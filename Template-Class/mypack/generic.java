package mypack;
import java.io.*;
import java.util.*;

public class generic{
    public static void main(String[] args){
        // 1) Template that takes in any types - <T>
        // create an instance of the printer<T> class of type "Integer" and prints out the value 23.
        // printer<Integer> printer = new printer<>(23);
        // printer.print();

        // now, with String.
        // printer<String> printer2 = new printer<>("I am the greatest");
        // printer2.print();

        /*
            now, an array of cats
            Note : We normally specify the type of template to be of a specific type of object instead of a generic object to be type-saved.
        */
        // ArrayList<cat> cats = new ArrayList<>();
        // cats.add(new cat("Damon",2,"meowsssss"));
        // cats.add(new cat("Lily",10,"arwghssss"));

        // 2) Template that is bounded by animal class - <T extends animal>
        // printer<cat> printer = new printer<>(new cat("Damon", 2, "Meowssssss"));
        // printer.print();

        // printer<dog> printer2 = new printer<>(new dog("Katniss", 10, "Growlssssss"));
        // printer2.print();

        // 3)
        // shout("Hey, you fucking bastards");
        // shout(57);
        // shout(new cat());

        // 4)
        // shout("Hey, you fucking bastards", 87);
        // shout(57, "Douches");
        // shout(new cat(), new dog());

        // 5) template that has 2 types - <T, V>
        // printer<Integer,String> printer = new printer<>(74,"Cunt");
        // printer.print();

        // 6)
        List<Integer> inList = new List<>();
        inList.add(3);
        printList();

        // 6)7)
        List<cat> inList = new List<>();
        inList.add(new cat());
        printList();

    }

    // 3) Method of type template
    // public static <T> void shout(T thingtoShout){
    //     System.out.println(thingtoShout + "!!!!!");
    // }

    // // 4) Method of multiple type template
    // public static <T, V> void shout(T thingtoShout, V otherthingstoShout){
    //     System.out.println(thingtoShout + "!!!!!");
    //     System.out.println(otherthingstoShout + "!!!!!");
    // }

    /*
        6) Let's say we want to pass in a list that contains any objects into this function -
            - Though, List is a subclass of Object, it still will not work because List<Integer> is not a subclass of Object.
            - We have to use WildCard <?> : Don't know what exactly that generic type will be.
    */
    // private static void printList(List<?> myList){
    //     System.out.println();
    // }

    // 7) we can also bound the WildCard with other classes - <? extends animal>
    // private static void printList(List<? extends animal> myList){
    //     System.out.println();
    // }
}