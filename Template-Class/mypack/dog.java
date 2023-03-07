package mypack;
public class dog extends animal{
    private String soundType = "";
    public dog(){
    }
    public dog(String name, Integer Age, String soundType){
        super(name,Age);
        this.soundType = soundType;
    }
    public void makeSound(){
        System.out.println(this.soundType+"~~~~~~~");
    }

}