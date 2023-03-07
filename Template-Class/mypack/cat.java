package mypack;
public class cat extends animal{
    private String soundType = "";
    public cat(){
    }
    public cat(String name, Integer Age, String soundType){
        super(name, Age);
        this.soundType = soundType;
    }
    public void makeSound(){
        System.out.println(this.soundType+"~~~~~~~");
    }
}