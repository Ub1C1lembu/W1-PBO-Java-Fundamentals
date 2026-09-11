# Jawaban Soal 5 (Java Strings)

### Kode Program (`Strings.java`)

```java
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String A = sc.next();
            String B = sc.next();

            // 1. Jumlah panjang string A dan B
            System.out.println(A.length() + B.length());

            // 2. Tentukan apakah A lebih besar secara leksikografis dibanding B
            if (A.compareTo(B) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            // 3. Kapitalisasi huruf pertama string A dan B
            String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
            String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
            System.out.println(capA + " " + capB);
        }
    }
}
```

---

### Penjelasan:
1. **`A.length() + B.length()`**: Menggunakan method `.length()` untuk menghitung total karakter dari kedua string.
2. **`A.compareTo(B) > 0`**: Method `.compareTo()` membandingkan dua string berdasarkan urutan abjad/leksikografis. Jika `A` berada setelah `B` di kamus, hasilnya bernilai positif ($> 0$), sehingga mencetak `"Yes"`, sebaliknya `"No"`.
3. **`A.substring(0, 1).toUpperCase() + A.substring(1)`**: Mengambil huruf pertama dengan `.substring(0, 1)` untuk diubah menjadi huruf besar (`.toUpperCase()`), lalu digabungkan kembali dengan sisa karakter string (`.substring(1)`).
4. **`try-with-resources`**: Memastikan resource `Scanner` otomatis ditutup setelah blok selesai dijalankan untuk mencegah *resource leak*.
