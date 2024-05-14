
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author indri
 */
public class AplikasiRestoran {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            Restaurant restaurant = new Restaurant(10);
            
            boolean running = true;
            
            while (running){
                System.out.println("=== Menu restoran ===");
                System.out.println("1. Tambah Menu");
                System.out.println("2. Tampilkan Menu");
                System.out.println("3. Ubah menu");
                System.out.println("4. Hapus Menu");
                System.out.println("5. Keluar");
                System.out.print("Pilih Opsi :");
                
                int choice = scanner.nextInt();
                scanner.nextLine();
                
                switch (choice){
                    case 1 -> {
                        System.out.print("Masukan Nama Menu: ");
                        String name = scanner.nextLine();
                        System.out.print("Masukan Harga Menu: ");
                        double price = scanner.nextDouble();
                        restaurant.addMenu(new DataMenu(name,price));
                        System.out.print("Menu Berhasil Ditambahkan: ");
                    }
                    case 2 -> {
                        System.out.print("Daftar Menu: ");
                        restaurant.showMenu();
                    }
                    case 3 -> {
                        System.out.print("Masukan Nomor menu yang ingin diubah: ");
                        int indexToUpdate = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukan nama baru: ");
                        String newName = scanner.nextLine();
                        System.out.print("Masukan Harga Baru: ");
                        double newPrice = scanner.nextDouble();
                        restaurant.updateMenu(indexToUpdate - 1, new DataMenu(newName, newPrice));
                        System.out.print("Menu berhasil diubah!");
                    }
                    case 4 -> {
                        System.out.print("Masukkan nomor menu yang ingin dihapus:");
                        int indexToDelete = scanner.nextInt();
                        restaurant.deleteMenu(indexToDelete - 1);
                        System.out.print("Menu berhasil dihapus!");
                    }
                    case 5 -> {
                        running = false;
                        System.out.println("Terima kasih!");
                    }
                    default -> System.out.println("Opsi tidak valid!");
                    
                    
                }
                
            }}
       
    }
}