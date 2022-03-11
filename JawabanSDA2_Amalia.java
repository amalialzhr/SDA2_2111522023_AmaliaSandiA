import java.util.LinkedList;

public class jawaban {
    public static void main(String[] args) {

        //create linkedlist 
        LinkedList <String> saya = new LinkedList<>();
        saya.add("A");
        saya.add("M");
        saya.add("A");
        saya.add("L");
        saya.add("i");
        saya.add("A");
        saya.add(" ");
        saya.add("S");
        saya.add("A");
        saya.add("N");
        saya.add("D");
        saya.add("I");
        saya.add(" ");
        saya.add("A");
        saya.add("L");
        saya.add("Z");
        saya.add("A");
        saya.add("H");
        saya.add("R");
        saya.add("A");
        saya.add("H");

        System.out.println("nama lengkap saya adalah: " + saya);
        System.out.println("dengan ukuran : " + saya.size());

        //add linkedlist 
        saya.addFirst(" ");
        saya.addFirst("A");
        saya.addFirst("R");
        saya.addFirst("O");
        saya.addFirst("D");
        saya.addLast(" ");
        saya.addLast("E");
        saya.addLast("M");
        saya.addLast("O");
        saya.addLast("N");

        System.out.println(" ");
        System.out.println("1. add");
        System.out.println("nama berubah menjadi "+ saya);
        System.out.println("setelah ditambahkan beberapa huruf, ukurannya : " + saya.size());

        //sisipkan linkedlist
        saya.set(5, "E");
        saya.set(6, "K");
        saya.set(7, "S");
        saya.set(8, "P");
        saya.set(9, "L");
        saya.set(10, "O");
        saya.set(11, "R");
        saya.set(12, "E");
        saya.set(13, "R");
        saya.set(14, " ");

        System.out.println(" ");
        System.out.println("2. set");
        System.out.println("nama berubah menjadi " + saya );
        System.out.println("setelah disisipkan beberapa huruf, ukurannya : " + saya.size());
        
        //hapus linkedlist
        saya.removeLast();
        saya.remove(14);
        saya.remove(14);
        saya.remove(14);
        saya.remove(14);
        saya.remove(14);
        saya.remove(14);
        saya.remove(14);
        saya.remove(14);
        saya.remove(14);
        saya.remove(14);
        saya.remove(14);
        saya.remove(14);
        saya.remove(14);
        saya.remove(14);
        saya.remove(14);
        saya.remove(14);
  
        System.out.println(" ");
        System.out.println("3. remove");
        System.out.println("nama berubah menjadi " + saya );
        System.out.println("setelah dihapuskan beberapa huruf, ukurannya : " + saya.size());

        saya.push(" ");
        saya.push("N");
        saya.push("O");
        saya.push("O");
        saya.push("T");
        saya.push("R");
        saya.push("A");
        saya.push("C");

        System.out.println(" ");
        System.out.println("4.1 push");
        System.out.println("berubah menjadi " + saya );
        System.out.println("dengan ukuran : " + saya.size());

        saya.pop();
        saya.pop();
        saya.pop();
        saya.pop();
        saya.pop();
        saya.pop();
        saya.pop();
        saya.pop();

        System.out.println(" ");
        System.out.println("4.2 pop");
        System.out.println("berubah menjadi " + saya );
        System.out.println("dengan ukuran : " + saya.size());
        System.out.println(" ");
        System.out.println("Kartun " + saya + " adalah kartun kesukaan saya.");

    }
        
}
