import java.util.Scanner;

// Class Mahasiswa (Encapsulation)
class Mahasiswa {
    private String nama;
    private String nim;

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}

// Class Dosen
class Dosen {
    private String namaDosen;
    private String nidn;

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public String getNidn() {
        return nidn;
    }
}

// Class MataKuliah
class MataKuliah {
    private String namaMatkul;
    private int sks;

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public int getSks() {
        return sks;
    }
}

// Main Class
public class Tugas_PBO_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Mahasiswa mhs = new Mahasiswa();
        Dosen dosen = new Dosen();
        MataKuliah mk = new MataKuliah();

        // Input Mahasiswa
        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Nama Mahasiswa : ");
        mhs.setNama(input.nextLine());
        System.out.print("NIM            : ");
        mhs.setNim(input.nextLine());

        // Input Dosen
        System.out.println("\n=== INPUT DATA DOSEN ===");
        System.out.print("Nama Dosen : ");
        dosen.setNamaDosen(input.nextLine());
        System.out.print("NIDN       : ");
        dosen.setNidn(input.nextLine());

        // Input Mata Kuliah
        System.out.println("\n=== INPUT MATA KULIAH ===");
        System.out.print("Nama Matkul : ");
        mk.setNamaMatkul(input.nextLine());
        System.out.print("SKS         : ");
        mk.setSks(input.nextInt());

        // Output
        System.out.println("\n=== DATA AKADEMIK ===");
        System.out.println("Mahasiswa : " + mhs.getNama());
        System.out.println("NIM       : " + mhs.getNim());
        System.out.println("Dosen     : " + dosen.getNamaDosen());
        System.out.println("NIDN      : " + dosen.getNidn());
        System.out.println("Matkul    : " + mk.getNamaMatkul());
        System.out.println("SKS       : " + mk.getSks());

        input.close();
    }
}