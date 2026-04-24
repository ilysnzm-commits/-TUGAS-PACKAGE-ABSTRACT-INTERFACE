import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Pilih Laptop:");
            System.out.println("1. Lenovo");
            System.out.println("2. Toshiba");
            System.out.println("3. MacBook");
            System.out.print("Masukkan pilihan: ");

            int pilih = input.hasNextInt() ? input.nextInt() : 1;
            input.nextLine();

            Laptop laptop;

            switch (pilih) {
                case 1 -> laptop = new Lenovo();
                case 2 -> laptop = new Toshiba();
                case 3 -> laptop = new MacBook();
                default -> {
                    System.out.println("Pilihan tidak valid, pakai Lenovo");
                    laptop = new Lenovo();
                }
            }

            String perintah;

            do {
                System.out.println("\n=== MENU ===");
                System.out.println("ON | OFF | UP | DOWN | EXIT");
                System.out.print("Input: ");

                perintah = input.nextLine().toUpperCase();

                switch (perintah) {
                    case "ON" -> laptop.powerOn();
                    case "OFF" -> laptop.powerOff();
                    case "UP" -> laptop.volumeUp();
                    case "DOWN" -> laptop.volumeDown();
                    case "EXIT" -> System.out.println("Program selesai...");
                    default -> System.out.println("Perintah tidak dikenal!");
                }

            } while (!perintah.equals("EXIT"));
        }
    }
}