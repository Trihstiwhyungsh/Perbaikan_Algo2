
package Stack;

import java.util.Scanner;

public class TumpukanApp {
   public static void main (String [] args){
    Tumpukan tumpukan=new Tumpukan(6);
    System.out.println("|membuat daftar menu|");
    System.out.println();
    tumpukan.push("1.seblak");
    tumpukan.baca();
    tumpukan.push("2.bakso");
    tumpukan.baca();
    System.out.println("daftar menu teratas = "+tumpukan.peek());
    System.out.println();
    tumpukan.push("3.mie ayam");
    tumpukan.baca();
    tumpukan.push("4.cireng");
    tumpukan.baca();
    System.out.println();
    System.out.println("daftar menu yang akan dihapus = "+tumpukan.pop());
    tumpukan.baca();
    System.out.println();
    System.out.println();
    System.out.println("Nama saya adalah Tri Hesti wahyuningsih");
}    
}

