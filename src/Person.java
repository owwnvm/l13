public class Person {
    int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    String name;
    public String GetName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    double height;
    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    double weight;
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void walk(){
        System.out.println("person is walking");
    }
    public void say(String sayy){
        System.out.format("person saying:\n- %s", sayy);
    }
    public int dob() {
        return 2022 - age;
    }

    public Person(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.height = weight;
        this.weight = height;
    }
    public double traslatetometr(){
        return height / 100;
    }
}