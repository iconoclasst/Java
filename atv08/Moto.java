
public class Moto {

    private Person person=null;
    private int power=0;
    private int time=0;

    public Moto(int power) {
        this.power=power;
    }

    public boolean insertPerson(Person person) {
        if(this.getPerson() != null) {
            System.out.println("busy motorcycle");
            return false;
        }
        else {
            this.person = person;
            return true;
        }
    }

    public void remove() {
        if(this.getPerson() == null)
            System.out.println("No one in the motorcycle");
        else 
        this.person=null;
    }

    public void buyTime(int time) {
        this.time+=time;
    }

    public void drive(int time) {
        if(this.getPerson().getAge() < 10) {
            System.out.println("low age");
        }
        else if(this.time == 0) {
            System.out.println("Has no time");
        }
        else if(this.getPerson() == null) {
            System.out.println("Empty motorcycle");
        }
        else if(this.time < time) {
            System.out.printf("time has finished after %d minutes", this.getTime());
            time-=this.time;
            this.time=0;
        }
        else {
            this.time-=time;
        }
    }

    public void honk() {
        System.out.print("P");
        for(int i=0; i<this.getPower();i++) {
            System.out.print("e");
        }
        System.out.println("m");
    }

    public String toString() {
        String str="";
        if(this.getPerson()==null) {
        str=String.format("time:%d, power:%d, person:%s",this.getTime(), this.getPower(), "No one");
        }
        else {
        str=String.format("time:%d, power:%d, person:%s",this.getTime(), this.getPower(), this.getPerson().toString());
        }
        return str;
    }
    //gets and sets
    public Person getPerson() {return this.person;}

    public int getPower() {return this.power;}

    public int getTime() {return this.time;}
}