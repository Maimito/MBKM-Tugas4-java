public class Mahasiswa {
    public void daftarmhs(int type){
        if (type == 1){
            System.out.println("Daftar mahasiswa Teknik Informatika: ");
        } else if (type == 2){
            System.out.println("Daftar mahasiswa Ilmu Komunikasi: ");
        }
    }
}

class KelasInformatika extends Mahasiswa{
    public void daftarmhs(){
        int i = 100;
        int type = 1;
        String[] nama = new String[5];
        String[] nim = new String[5];

        nama[0] = "Andreas";
        nama[1] = "Santos";
        nama[2] = "Barbatos";
        nama[3] = "Sukro";
        nama[4] = "Andro";

        super.daftarmhs(type);
        for(i = 0; i <= 4; i++){
            nim[i] = "101" + i;
            System.out.println(nim[i] + " - " + nama[i]);
        }
    }
}

class KelasKomunikasi  extends Mahasiswa{
    public void daftarmhs(){
        int i = 100;
        int type = 2;
        String[] nama = new String[5];
        String[] nim = new String[5];

        nama[0] = "Maruzensky";
        nama[1] = "Tsaritsa";
        nama[2] = "Dion";
        nama[3] = "Speedwagon";
        nama[4] = "Ulysses";

        super.daftarmhs(type);
        for(i = 0; i <= 4; i++){
            nim[i] = "210" + i;
            System.out.println(nim[i] + " - " + nama[i]);
        }
    }
}
