import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Faktoriyeli alinacak sayi:" );
        int sayi=scanner.nextInt();

        Hesaplama fakt=new Hesaplama();
        System.out.println(sayi +"! : "+fakt.Faktoriyel(sayi));

    }
}