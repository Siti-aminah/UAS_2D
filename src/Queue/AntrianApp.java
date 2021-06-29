package Queue;

public class AntrianApp {
    public static void main(String[] args){
           Antrian antrian = new Antrian(10);
           
           antrian.enqueue(50);
           antrian.display();
           System.out.println();
           
           antrian.enqueue(60);
           antrian.display();
           System.out.println();
           
           System.out.println("nilai yang paling depan = "+ antrian.peek());
           System.out.println("Siti Aminah Dauda");
           System.out.println("20090102");
           System.out.println(" ");
           
           antrian.enqueue(70);
           antrian.display();
           System.out.println();
           
           System.out.println("yang diambil dari antrian = "+ antrian.dequeue());
           antrian.display();
           System.out.println();
           
           
           System.out.println("nilai yang paling depan =  "+ antrian.peek());
    
    }
}