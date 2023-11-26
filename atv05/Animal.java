import java.util.Scanner;

public class Animal {

    public String especie="";
    public String noise="";
    public int age=0;

    public Animal(String especie, String noise) {
        this.especie=especie;
        this.noise=noise;
    }

    public String makeNoise() {
        String result="";
        if(this.age >= 4) {
            result=String.format("The animal %s die", this.especie);
        }
        else if(this.age == 0) {
            result=String.format("The animal %s doesn't make noise yet, it's still a baby...", this.especie);
        }
        else {
        result=this.noise;
        }

        return result;
    }

    public void grow() {
        if(this.age >= 4) {
            System.out.printf("%s die\n", this.especie);
        }
        else {
            this.age += 1;
        }
    }

    public void show() {
        System.out.printf("Animal: %s -- Age: %d -- Noise: %s\n", this.especie, this.age, this.noise);
    }
    
    public static void commandLine() {
        Scanner scan = new Scanner(System.in);
        Animal animal=null;
        
        System.out.println("Type \"help\" to show the commands...\n");
        while(true) {
            System.out.println("Insert a command: ");
            String cmd = scan.nextLine();

            switch(cmd) {
                case "end":
                    scan.close();
                    return;
                case "help":
                    System.out.println("Commands:\n-init\n-end\n-show\n-grow\n-noise");
                    break;
                case "init":
                    String value1 = scan.nextLine();
                    String value2 = scan.nextLine();
                    animal = new Animal(value1, value2);
                    break;
                case "show":
                    animal.show();
                    break;
                case "grow":
                    animal.grow();
                    break;
                case "noise":
                    String re=animal.makeNoise();
                    System.out.println(re);
                    break;
                default:
                    System.out.println("invalid command...");
                    break;

            }
        }
    }
    
    public static void main(String[] args) {
        commandLine();
        
    }
}
