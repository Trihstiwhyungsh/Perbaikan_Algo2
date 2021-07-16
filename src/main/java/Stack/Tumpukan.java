
package Stack;

public class Tumpukan {
    public int ukuran;
    public Object [] tumpukan;  //method object bisa untuk tipe data huruf maupun bilangan 
    public int top;

public Tumpukan (int s){
    ukuran = s;
    tumpukan = new Object [ukuran];
    top = -1;
}
public void push(Object j){
    if(top==tumpukan.length-1){
        System.out.println("Stack penuh");
        return;
    }
    tumpukan[++ top] = j;
}
public Object pop(){
    if(top==-1){
        System.out.println("Stack kosong");
        return null;
    }
    return tumpukan[top--];
}
public Object peek(){
    if(top==-1){
        System.out.println("Stack kosong");
        return null;
        }
    return tumpukan[top];
}
public boolean isEmpty(){
    return (top==ukuran-1);
}
public boolean isFull(){
    return(top == ukuran-1);
}
public void count (){
    System.out.println(top+1);
}
public void baca(){
    int i=top;
    while (i>=0){
        System.out.print(tumpukan[i]);
        System.out.println(" ");//print akan mencetak tanpa adanya enter atau penambahan baris pada kalimat berikutnya. 
        //println akan mencetak dengan adanya enter atau penambahan baris pada kalimat berikutnya
        i--;
    }
    System.out.println(" ");
}
}

