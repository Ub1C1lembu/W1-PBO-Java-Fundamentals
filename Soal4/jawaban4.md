# Jawaban Soal 4

### 1. Output Nilai dari Variabel `b`
Output yang dihasilkan adalah **`10`**.

---

### 2. Perubahan dari Variabel `d` Menjadi Variabel `b`
Setelah dilakukan *casting* bertahap (`double` $\rightarrow$ `float` $\rightarrow$ `long` $\rightarrow$ `int` $\rightarrow$ `short` $\rightarrow$ `byte`):

1. **Kehilangan Bagian Pecahan/Desimal (*Truncation*)**:  
   Nilai `10.25` dipotong menjadi bilangan bulat `10` saat di-*cast* ke tipe integer (`long`). Nilai desimal `.25` hilang (bukan dibulatkan, melainkan dibuang).
2. **Perubahan Tipe Data dan Ukuran Memori**:  
   Tipe data berubah dari bilangan desimal berpresisi ganda (**`double` / 64-bit**) menjadi bilangan bulat berukuran 1 byte (**`byte` / 8-bit**).
