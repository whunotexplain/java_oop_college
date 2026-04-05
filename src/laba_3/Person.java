package laba_3;

public class Person {
    private  String name;
    private int age;
    private double height;
    private double weight;
    private String eyeColor;
    private String gender;


    public Person(String name, int age, double height, double weight, String eyeColor, String gender){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.gender = gender;
    }

    public Person(){
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getGender() {
        return gender;
    }

    public static void print(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Person per = new Person("James Bond", 42, 183.0, 82.0, "Blue", "male");
        print("Name = " + per.getName());
        print("Age = " + per.getAge());
        print("Height = " + per.getHeight());
        print("Weight = " + per.getWeight());
        print("Eyes Color = " + per.getEyeColor());
        print("Gender = " + per.getGender());
    }
}
