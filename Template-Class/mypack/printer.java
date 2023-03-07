package mypack;
// import java.io.*;
// import java.util.*;
/*
   1) Template class that can take in any types of variables and print it - <T>
   2) Make the printer template to be bounded by a class - <T extends animal>
   3) Have a template bounded by a combination of interfaces and classes - <T extends animal & Serializable> 
   4) Muliple template - <T, V>
 */

// 1)
// public class printer<T>{
//     T thingtoPrint;

//     public printer(T thingtoPrint){
//         this.thingtoPrint = thingtoPrint;
//     }

//     public void print(){
//         System.out.println(thingtoPrint);
//     }
// }

// 2)
public class printer<T extends animal>{
    T thingtoPrint;

    public printer(T thingtoPrint){
        this.thingtoPrint = thingtoPrint;
    }

    public void print(){
        // 2) We know our printer template is bounded by animal, we can call animal class method "detail".
        thingtoPrint.detail();
        System.out.println(thingtoPrint);
    }
}

// 3)
// public class printer<T extends animal, Serializable>{
//     T thingtoPrint;

//     public printer(T thingtoPrint){
//         this.thingtoPrint = thingtoPrint;
//     }

//     public void print(){
//         // 2) We know our printer template is bounded by animal, we can call animal class method "detail".
//         thingtoPrint.detail();
//         System.out.println(thingtoPrint);
//     }
// }

// 4)
// public class printer<T, V>{
//     T thingtoPrint;
//     V othertoPrint;

//     public printer(T thingtoPrint, V othertoPrint){
//         this.thingtoPrint = thingtoPrint;
//         this.othertoPrint = othertoPrint;
//     }

//     public void print(){
//         System.out.println(thingtoPrint);
//         System.out.println(othertoPrint);
//     }
// }