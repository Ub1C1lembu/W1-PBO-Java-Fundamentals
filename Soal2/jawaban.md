# Jawaban Soal 2

### 1. Output dari Class `Constants` dan `Constants2`
Kedua class menghasilkan output yang **sama**:
```text
Paper size in centimeters: 21.59 by 27.94
```

---

### 2. Perbedaan `final double` dan `public static final double`

- **`final double` (pada `Constants`)**:
  - Merupakan **variabel/konstanta lokal**.
  - Hanya bisa diakses di dalam method tempat ia dibuat (method `main`).

- **`public static final double` (pada `Constants2`)**:
  - Merupakan **konstanta tingkat class (global)**.
  - Bisa diakses oleh method lain di dalam class yang sama, maupun oleh class lain dari luar (`Constants2.CM_PER_INCH`) tanpa perlu membuat objek baru.
