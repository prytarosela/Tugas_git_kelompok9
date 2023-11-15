// Kelas abstrak Lapangan sebagai basis untuk jenis lapangan lainnya
abstract class Lapangan {
    // Variabel instance private untuk menyimpan nama, jenis, dan jam
    private String nama;
    private String jenis;
    private String jam;

    // Konstruktor untuk inisialisasi objek Lapangan
    public Lapangan(String nama, String jenis, String jam) {
        this.nama = nama;
        this.jenis = jenis;
        this.jam = jam;
    }

    // Metode equals untuk membandingkan dua objek Lapangan berdasarkan nama, jenis, dan jam
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Lapangan lapangan = (Lapangan) obj;

        return nama.equals(lapangan.nama) && jenis.equals(lapangan.jenis) && jam.equals(lapangan.jam);
    }

    // Metode getter untuk mendapatkan nama lapangan
    public String getNama() {
        return nama;
    }

    // Metode getter untuk mendapatkan jenis lapangan
    public String getJenis() {
        return jenis;
    }

    // Metode getter untuk mendapatkan jam lapangan
    public String getJam() {
        return jam;
    }

    // Metode abstrak untuk menghitung harga, akan diimplementasikan oleh kelas turunan
    public abstract int hitungHarga();
}

// Kelas turunan pertama (subclass) LapanganFutsal
class LapanganFutsal extends Lapangan {
    // Konstruktor untuk inisialisasi objek LapanganFutsal
    public LapanganFutsal(String nama, String jam) {
        super(nama, "futsal", jam);
    }

    // Implementasi metode abstrak hitungHarga untuk LapanganFutsal
    @Override
    public int hitungHarga() {
        // Logika harga khusus untuk lapangan futsal
        if (getJenis().equals("futsal")) {
            if (getJam().compareTo("08:00") >= 0 && getJam().compareTo("18:00") < 0) {
                return 130000;
            } else if (getJam().compareTo("20:00") >= 0 && getJam().compareTo("24:00") <= 0) {
                return 180000;
            }
        }
        return 0; // Default jika jenis lapangan tidak sesuai
    }
}
