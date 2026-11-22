import java.util.Scanner;

public class SIAKAD24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu, jmlhMhs = 4, jmlhMatkul = 3;
        do {
            System.out.println("============= MENU =============");
            System.out.println("1. Mengubah jumlah mahasiswa dan mata kuliah");
            System.out.println("2. Input nilai mahasiswa");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            switch (menu) {

                case 1:
                    while (true) {
                        System.out.print("Masukkan jumlah mahasiswa: ");
                        jmlhMhs = sc.nextInt();
                        System.out.print("Masukkan jumlah mata kuliah: ");
                        jmlhMatkul = sc.nextInt();
                        if (jmlhMatkul < 1 || jmlhMhs < 1) {
                            System.out.println("=== Masukkan jumlah mahasiswa atau mata kuliah kembali");
                        } else {
                            break;
                        }
                    }
                    break;
                case 2:
                    int nilai[][] = new int[jmlhMhs][jmlhMatkul];

                    for (int i = 0; i < nilai.length; i++) {
                        System.out.println("Input nilai mahasiswa ke-" + (i + 1));
                        double totalPerSiswa = 0;
                        for (int j = 0; j < nilai[i].length; j++) {
                            System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                            nilai[i][j] = sc.nextInt();
                            totalPerSiswa += nilai[i][j];
                        }

                        System.out.println("Nilai rata-rata: " + totalPerSiswa / jmlhMatkul);
                    }
                    System.out.println("\n===============================================");
                    System.out.println("Rata-rata Nilai setiap Mata kuliah: ");

                    for (int j = 0; j < jmlhMatkul; j++) {
                        double totalPerMatkul = 0;

                        for (int i = 0; i < jmlhMhs; i++) {
                            totalPerMatkul += nilai[i][j];
                        }

                        System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / jmlhMhs);
                    }

                    break;
                case 3:

                    break;
                default:
                    break;
            }
        } while (menu != 3);

        sc.close();
    }
}
// Bagaimana jika terdapat perubahan jumlah mahasiswa dan jumlah mata kuliah?
// Modifikasi kode program SIAKAD untuk mengakomodasi jumlah mahasiswa dan
// jumlah mata kuliah yang dinamis.
