package mypack;
public class animal{
    // attributes
    private String name;
    private Integer age;

    // constructors
    public animal(){
        this.name = "";
        this.age = 0;
    }
    public animal(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    // methods
    public void detail(){
        System.out.println("Name : "+this.name+", Age : "+this.age);
    }
}