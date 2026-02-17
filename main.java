// Note : Compile: javac main.java, Runing java Main 

class Perusahaan {
    public int id_perusahaan; 
    public int id_user; 
    public String nama;
    public String alamat;
    public String deskripsi;

    public void mengisidata(int id_perusahaan, int id_user, String nama, String alamat, String deskripsi) {
        this.id_perusahaan = id_perusahaan;
        this.id_user = id_user;
        this.nama = nama;
        this.alamat = alamat;
        this.deskripsi = deskripsi;
    }

    public void tampilInfo() {
        System.out.println("DATA PERUSAHAAN");
        System.out.println("ID Perusahaan : " + id_perusahaan);
        System.out.println("ID User       : " + id_user);
        System.out.println("Nama          : " + nama);
        System.out.println("Alamat        : " + alamat);
        System.out.println("Deskripsi     : " + deskripsi);
    }
}

public class Main {
    public static void main(String[] args) {

        Perusahaan p = new Perusahaan();
        p.mengisidata(1, 101, "PT Maju Jaya", "Ponorogo", "Perusahaan teknologi");
        p.tampilInfo();
    }
}


