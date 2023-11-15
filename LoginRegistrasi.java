import java.util.*;

class LoginRegistrasi {
    private ArrayList<Pengguna> daftarPengguna = new ArrayList<>(); // ArrayList untuk menyimpan objek Pengguna

    // Metode untuk menambahkan pengguna baru ke dalam daftar
    public void tambahPengguna(String username, String password) {
        Pengguna penggunaBaru = new Pengguna(username, password);
        daftarPengguna.add(penggunaBaru);
    }

    // Metode untuk melakukan login dan memeriksa keberhasilan login
    public boolean login(String username, String password) {
        for (Pengguna pengguna : daftarPengguna) {
            if (pengguna.getUsername().equals(username) && pengguna.getPassword().equals(password)) {
                return true; // Login berhasil
            }
        }
        return false; // Login gagal
    }
    
    // Metode untuk mendapatkan objek Pengguna berdasarkan username
    public Pengguna getPengguna(String username) {
        for (Pengguna pengguna : daftarPengguna) {
            if (pengguna.getUsername().equals(username)) {
                return pengguna;
            }
        }
        return null;
    }
}
