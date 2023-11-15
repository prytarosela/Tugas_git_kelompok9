public class Pengguna { // Kelas Pengguna untuk merepresentasikan pengguna dengan username dan password
    // Variabel instance private untuk menyimpan username dan password
    private String username;
    private String password;

    // Konstruktor untuk inisialisasi objek Pengguna
    public Pengguna(String username, String password) {
        this.username = username;
        this.password = password;
    }

     // Metode getter untuk mendapatkan username
    public String getUsername() {
        return username;
    }

    // Metode getter untuk mendapatkan password
    public String getPassword() {
        return password;
    }
}
