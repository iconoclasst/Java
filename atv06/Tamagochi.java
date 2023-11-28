import java.util.Scanner;

public class Tamagochi {

    private boolean alive=true;
    private int clean=0;
    private int cleanMax=0;
    private int energy=0;
    private int energyMax=0;
    private int hungry=0;
    private int hungryMax=0;
    private int age=0;
    private int diamonds=0;

    private boolean testAlive() {
        if(this.alive == false){
            System.out.println("pet is die");
            return false;
        }
        else {
            return true;
        }
    }

    public Tamagochi(int cleanMax, int energyMax, int hungryMax) {
        this.cleanMax=cleanMax;
        this.energyMax=energyMax;
        this.hungryMax=hungryMax;
        this.clean=cleanMax;
        this.energy=energyMax;
        this.hungry=hungryMax;
        this.diamonds=0;
        this.age=0;
        this.alive=true;
    }

    public String show() {
        String result = String.format("Energy: %d/%d -- Satiety: %d/%d -- Cleaning: %d/%d -- Diamonds: %d -- Age: %d", this.getEnergy(), this.getEnergyMax(), this.getHungry(), this.getHungryMax(), this.getClean(), this.getCleanMax(), this.diamonds, this.age);
        return result;
    }

    public void eat() {
        if (testAlive() == false)
            return;
        else {
        this.setEnergy(this.getEnergy() - 1);
        this.setHungry(this.getHungry() + 4);
        this.setClean(this.getClean() - 2);
        this.diamonds += 0;
        this.age += 1;
        }
    }

    public void play() {
        if (testAlive() == false)
            return;
        else {
        this.setEnergy(this.getEnergy() - 2);
        this.setHungry(this.getHungry() - 1);
        this.setClean(this.getClean() - 3);
        diamonds += 1;
        age += 1;
        }
    }

    public void shower() {
        if (testAlive() == false)
            return;
        else {
        this.setEnergy(this.getEnergy() - 3);
        this.setHungry(this.getHungry() - 1);
        this.setClean(this.cleanMax);
        this.diamonds += 0;
        this.age += 2;
        }
    }

    public void sleep() {
        if(testAlive() == false)
            return;
        else if (testAlive() && (getEnergy() <= getEnergyMax() - 5)) {
            age += (energyMax - getEnergy());
            setEnergy(getEnergyMax());
            setHungry(getHungry() - 1);
        }
        else {
            System.out.println("Pet is not sleepy.");
        }
    }

    //gets and sets
    public int getClean() {return this.clean;}

    public int getCleanMax() {return this.cleanMax;}

    public int getEnergy() {return this.energy;}

    public int getEnergyMax() {return this.energyMax;}
    
    public int getHungry() {return this.hungry;}

    public int getHungryMax() {return this.hungryMax;}

    public void setClean(int value) {
        if(value <= 0) {
            this.clean=0;
            System.out.println("Pet died of dirt");
            this.alive=false;
        }
        else if(value > this.cleanMax) {
            this.clean=this.cleanMax;
        }
        else {
            this.clean=value;
        }
    }

    public void setEnergy(int value) {
        if(value <= 0) {
            this.energy=0;
            System.out.println("Pet died of weakness");
            this.alive=false;
        }
        else if(value > this.energyMax) {
            this.energy=this.energyMax;
        }
        else {
            this.energy=value;
        }
    }

    public void setHungry(int value) {
        if(value <= 0) {
            this.hungry=0;
            System.out.println("Pet starving");
            this.alive=false;
        }
        else if(value > this.hungryMax) {
            this.hungry=hungryMax;
        }
        else {
            this.hungry=value;
        };
    }

    public static void commandLine() {
        Scanner scan = new Scanner(System.in);
        Tamagochi pet=null;
        while(true) {
            System.out.println("Insert a command: ");
            String cmd = scan.nextLine();

            if(cmd.equals("end")) {
                scan.close();
                break;
            }
            else if(cmd.equals("show")) {
                String str=pet.show();
                System.out.println(str);
            }
            else if(cmd.equals("init")) {
                int cm = scan.nextInt();
                int em = scan.nextInt();
                int hm = scan.nextInt();
                scan.nextLine();
                pet = new Tamagochi(cm, em, hm);
            }
            else if(cmd.equals("play")) {
                pet.play();
            }
            else if(cmd.equals("shower")) {
                pet.shower();
            }
            else if(cmd.equals("sleep")) {
                pet.sleep();
            }
            else if(cmd.equals("eat")) {
                pet.eat();
            }
            else {
                System.out.println("Invalid command");
            }
        }
    }
    public static void main(String[] args) {
        commandLine();
    }
}