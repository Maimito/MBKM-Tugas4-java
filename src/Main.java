import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int angka1, angka2;
        double hasil;
        String hwjs = "?";
        Scanner sc = new Scanner(System.in);
        KelasInformatika IF = new KelasInformatika();
        KelasKomunikasi IK = new KelasKomunikasi();
        Matematika mtk = new Matematika();
        System.out.println("1. Daftar Mahasiswa\n" +
                "2. Kalkulator");
        System.out.print("Pilihan : "); int pilihan = sc.nextInt();
        while (pilihan <= 0 || pilihan >= 3){
            System.out.println("Pilihan tidak tersedia. Harap coba lagi");
            System.out.print("Pilihan : "); pilihan = sc.nextInt();
        }
        switch (pilihan){
            case 1:
                System.out.print("Lihat daftar mahasiswa:\n" +
                        "1. Teknik Informatika\n" +
                        "2. Ilmu Komunikasi\n" +
                        "Pilihan : ");
                pilihan = sc.nextInt();
                if(pilihan == 1){
                    IF.daftarmhs();
                } else if (pilihan == 2){
                    IK.daftarmhs();
                }
                break;
            case 2:
                System.out.print("Masukkan angka pertama: ");
                angka1 = sc.nextInt();
                System.out.print("Masukkan angka kedua: ");
                angka2 = sc.nextInt();
                System.out.print("Operasi Matematika:\n" +
                        "1. Penjumlahan\n" +
                        "2. Pengurangan\n" +
                        "3. Perkalian\n" +
                        "4. Pembagian\n" +
                        "Operasi Matematika mana yang anda butuhkan? Pilih satu: ");
                int type = sc.nextInt();

                mtk.setData(angka1, angka2, type);
                hasil = mtk.getData();
                if(type == 1){
                    hwjs = "+";
                } else if(type == 2){
                    hwjs = "-";
                } else if(type == 3){
                    hwjs = "*";
                } else if(type == 4){
                    hwjs = "/";
                }
                    System.out.println(angka1 + " " + hwjs + " " + angka2 + " = " + hasil);
                break;
        }
    }
}


