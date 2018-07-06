package firstproject;

public class Main {
    public static void main(String []args){
        System.out.println("Olar");
        Person p = new Person();
        p.setFirstName("Felipe");
        p.setAge(22);
        System.out.printf("My name is %s and I have %s years",p.getFirstName(),Integer.toString(p.getAge()));
    }
}