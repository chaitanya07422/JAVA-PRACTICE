package staticexample;
public class Main {
    public static void main(String[] args) {
        Human kunal=new Human(22,"kunal", 1000,false);
        Human rahul=new Human(21,"rahul", 10300,true);
        System.out.println(kunal.name);
        System.out.println(rahul.name);
        //System.out.println(rahul.population);
    }
}
