
package Queque;

public class antrianApp {
    public static void main(String[]args){
        antrian Antrian = new antrian(6);
        System.out.println("|membuat daftar menu|");
        System.out.println();
        Antrian.enqueue("Seblak"); 
        Antrian.display(); 
        System.out.println();
        Antrian.enqueue("Bakso"); 
        Antrian.display();
        System.out.println("daftar menu terdepan yang akan dihapus adalah "+Antrian.dequeue());
        System.out.println();
        Antrian.display();
        System.out.println();
        Antrian.enqueue("Sate"); 
        Antrian.display();
        System.out.println(Antrian.peek()+ " adalah daftar menu terdepan");
        System.out.println();
        Antrian.enqueue("Cireng"); 
        Antrian.display();
        System.out.println();
        System.out.println("Nama saya adalah Tri Hesti Wahyuningsih");
    }
}

