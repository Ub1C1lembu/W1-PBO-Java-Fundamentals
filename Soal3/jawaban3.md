# Jawaban Soal 3

### 1. Nilai `nx` setelah digunakan `Math.round(x)`
Nilai `nx` adalah **`93`**.  
Fungsi `Math.round(92.98)` membulatkan bilangan desimal ke bilangan bulat terdekat (karena angka desimal $\ge 0.5$, maka dibulatkan ke atas menjadi 93).

---

### 2. Alasan dibutuhkan *type casting* `(int)`
Karena metode **`Math.round(double)` mengembalikan tipe data `long`** (64-bit).  

Untuk memasukkan nilai bertipe `long` ke dalam variabel bertipe `int` (32-bit), Java mewajibkan *explicit casting* `(int)` (*narrowing conversion*) agar tidak terjadi error kompilasi (*possible lossy conversion from long to int*).
