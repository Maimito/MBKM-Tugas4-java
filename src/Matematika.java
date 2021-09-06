public class Matematika{
    int tambah, kurang, kali;
    double bagi, x;

    public double getData(){
        return x;
    }

    public void setData(int angka1, int angka2, int type){
        tambah = angka1 + angka2;
        kurang = angka1 - angka2;
        kali = angka1 * angka2;
        bagi = angka1 / angka2;

        if(type == 1){
            this.x = tambah;
        } else if(type == 2){
            this.x = kurang;
        } else if(type == 3){
            this.x = kali;
        } else if(type == 4){
            this.x = bagi;
        }
    }
}
