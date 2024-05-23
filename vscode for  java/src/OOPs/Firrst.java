package OOPs;
public class Firrst {
     public static void main(String[] args) {
        //student[] students =new student[5];
        student kunal =new student(12,43.9f,"kadavakoolu"); 
        student rahul = new student();
        /*kunal.marks=20.00f;
        kunal.name="kunalkuswak";
        kunal.rollno=19;*/
        kunal.greeting();
        System.out.println(kunal.rollno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        System.out.println(rahul.rollno);
        System.out.println(rahul.name);
        /*System.out.println(rahul.marks);*/
     }
}
 class student {
     int rollno;
     String name;
     Float marks;
     void greeting (){
          System.out.println("hello! My name is"+ name);
     }
     student(){
          this.name="chaitanya";
          this.rollno=20;
          this.marks=40.09f;
     }
     student(int rollno,float marks,String name){
          this.rollno=rollno;
          this.marks=marks;
          this.name=name;
     }
}
 