import java.util.Scanner;

public class Survey24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int survey[][] = new int[10][6];
        int totPertanyaan[] = new int[6];
        double rata2Responden, rata2Pertanyaan, rata2Tot;
        int totSmw = 0;
        for (int i = 0; i < survey.length; i++) {
            int totNilai = 0;
            System.out.println("======================================");
            System.out.println("Responden ke-" + (i+1));
            for (int j = 0; j < survey[i].length; j++) {
                System.out.printf("Pertanyaan ke-%d (beri nilai 1-5): ", (j + 1));
                survey[i][j] = sc.nextInt();

                totNilai += survey[i][j];
                totPertanyaan[j] += survey[i][j];
                totSmw += survey[i][j];
            }
            rata2Responden = (double) totNilai / survey[i].length;
            System.out.printf("Nilai rata rata responden ke-%d: %.2f\n" , (i + 1), rata2Responden);
        }
        System.out.println("======= Rata-Rata Nilai Tiap Pertanyaan =====");
        for (int j = 0; j < totPertanyaan.length; j++) {
            rata2Pertanyaan = (double) totPertanyaan[j]/survey.length;
            System.out.printf("Rata-rata pertanyaan ke-%d: %.2f\n", (j+1), rata2Pertanyaan);
        }
        System.out.println("======================================");
        rata2Tot = (double) totSmw / 60;
        System.out.println("Rata-Rata Keseluruhan: " + rata2Tot);
        sc.close();
    }
}