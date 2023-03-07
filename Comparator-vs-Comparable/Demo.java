import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

// 1) This Comparator interface allows us to define our own sorting logic with a specific type.
class comparator implements Comparator<student>{
    @Override
    public int compare(student o1, student o2) {
        // if o1 decimal at ones decimal place is greater than o2 decimal at ones decimal place, swap them : ascending order.
        if(o1.age%10 > o2.age%10){
            return 1; // 1 means swap
        }else{
            return -1; // -1 means do not swap
        }
    }
}

// 2) You can define the comparable interface for this student class so that it sorts according to its own compareTo() logic whenever the Collections.sort(student) is invoked.
class student implements Comparable<student>{
    int age;
    String name;

    public student(){
        this.age = 0;
        this.name = "";
    }
    public student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name +"]";
    }

    // Its own sorting logic that works pretty much the same was as the compare() in the Comparator interface.
    @Override
    public int compareTo(student that) {
        // If the current student age > other students age, swap.
        if(this.age > that.age){
            return 1;
        }else{
            return -1;
        }
    }
}

public class Demo{
    public static void main(String[] args){
        /*
            1) What if we want to sort the elements according to the decimal at ones decimal place ? Use a comparator interface.
        */
        // List<Integer> sums = new ArrayList<>();
        // sums.add(51);
        // sums.add(17);
        // sums.add(75);
        // sums.add(22);
        // sums.add(-10);

        /*
            2) What if I want to sort a list of students ?
        */
        List<student> studs = new ArrayList<>();
        studs.add(new student(21,"Dave"));
        studs.add(new student(19,"Skye"));
        studs.add(new student(18,"Emily"));
        studs.add(new student(15,"Jessi"));

        // comparator sort = new comparator();
        Collections.sort(studs);
        for(student s : studs){
            System.out.println(s);
        }
    }
}
