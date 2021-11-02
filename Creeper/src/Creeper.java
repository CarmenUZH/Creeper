import java.lang.Math; //for randomization, is this necessary? Who knows? I sure don't 

public class Creeper {
    public String name; 
    public int mood;
    public int age;
    
    //constructor
    public Creeper(String startName, int startAge) {
        name = startName;
        age = startAge;
        mood = 20; //completely made up
    }
    
    public void hug(){
        mood += Math.random()* (50 - 12 + 1) + 12; 
        System.out.println(name + " hisses happily");
    }
}

    
