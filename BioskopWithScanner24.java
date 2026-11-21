import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String penonton[][] = new String[4][2];
        int menu;
        do {
            System.out.println("============= MENU =============");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");

            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    String nama, next;
                    int baris, kolom;

                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        while (true) {
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if (baris < 1 || kolom < 1 || baris > penonton.length || kolom > penonton[0].length) {
                                System.out.println("Baris/Kolom kursi tidak tersedia");
                            } else if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi sudah terisi");
                            } else {
                                penonton[baris - 1][kolom - 1] = nama;
                                break;
                            }
                        }
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("================= DAFTAR PENONTON =================");

                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaPenonton = (penonton[i][j] != null) ? penonton[i][j] : "***";
                            System.out.printf("Penonton baris %d Kolom %d: %s\n", (i + 1), (j + 1), namaPenonton); 
                        }
                    }
                    break;
                case 3:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("MENU TIDAK TERSEDIA");
                    break;
            }
        } while (menu != 3);

        sc.close();
    }
}
