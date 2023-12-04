
public class Person {
    private int age=0;
    private String name="";

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public int getAge() {return this.age;}

    public String getName() {return this.name;}

    public String toString() {
        String str=String.format("(%s:%d)", this.getName(), this.getAge());
        return str;    
    }
}