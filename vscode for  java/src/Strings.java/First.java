public class First {
    public static void main(String[] args) {
        String a="chaitu";
        String b="chaitu";
        System.out.println(a==b); //creatinng singele object;
        String name1=new String("chaitu");
        String name2=new String("chaitu"); 
            System.out.println(name1==name2); //it gives false as explic creating  new object
            System.out.println(name1.equals(name2)); // it will give true bcz the values are same;
            System.out.println(name1.charAt(2));
    }
}