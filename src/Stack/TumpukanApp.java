package Stack;

public class TumpukanApp {
    public static void main (String [] args) {
       Tumpukan tumpukan=new Tumpukan(10);
       tumpukan.push(10);
       tumpukan.baca();
       System.out.println(" ");
       tumpukan.push(30);
       tumpukan.baca();
       System.out.println(" ");
       long nilai1 = tumpukan.peek();
       System.out.println("nilai top = "+nilai1);
       
       System.out.println("Siti Aminah Dauda");
       System.out.println("20090102");
       System.out.println(" ");
       tumpukan.pop();
       tumpukan.baca();
       System.out.println(" ");
       tumpukan.push(40);
       tumpukan.baca();
       System.out.println(" ");
       tumpukan.push(50);
       tumpukan.baca();
       System.out.println(" ");

   }
}