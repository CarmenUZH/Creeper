public class Creeper {
    public String name; 
    public int mood;
    public int age;
    
    //constructor
    public Creeper(String startName, int startAge) {
        name = startName;
        age = startAge;
    }
    
    public void hug(){
        mood += 25; 
        System.out.println(name + " hisses happily");
    }
}

    
