public class Peoples {
    private String name;
    private int age;
    private String skinColor;
    private String gender;


    public void live(){
        System.out.println("Hello i live on tre earth");
    }

    public void sayAge(){
        System.out.println("Hello i have 1years old");
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSkinColor(){
        return this.skinColor;
    }

    public void setSkinColor(String skinColor){
        this.skinColor = skinColor;
    }

    public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
