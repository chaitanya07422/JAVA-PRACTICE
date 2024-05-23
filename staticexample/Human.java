package staticexample;
public class Human {
    int age;
    String name;
    int salary;
    boolean marrried;
    static  long population;
    public Human(int  age,String name,int salary,boolean marrried){ 
    this.age=age;
    this.name=name;
    this.salary=salary;
    this.marrried=marrried;
    Human.population+=1; //for static use clss name  thiis also used but clss name is conventional
    //static will not create objects
    }
}
                  