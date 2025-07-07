Gaspol bro! Kamu udah **nulis README dengan semangat**, tinggal gue bantu **rapiin markdown-nya** biar lebih enak dibaca dan tetap fungsional 💡

---

### ✅ Versi yang Dirapikan:

````md
# Cara Eksekusi File Java (Dengan & Tanpa Shell Script)

## 🔍 Masalahnya
Kalau **gak pakai shell script**, kamu harus compile & run **manual**:
1. Compile:
   ```bash
   javac -d bin src/Main.java
````

2. Jalankan:

   ```bash
   java -cp bin Main
   ```

> Ribet dan 2 langkah 😩

---

## ✅ Solusi: Pakai Shell Script `run.sh`

### Cek Lokasi Folder Saat Ini

```bash
pwd
```

### Biar Script Bisa Dieksekusi

```bash
chmod +x run.sh
```

### Jalankan Script

```bash
./run.sh
```

---

## 🖨️ Output dari `Main.java`

```text
halo dari week 1
```

---

### 💬 Catatan

Shell script ini otomatis:

* Compile ke folder `bin/`
* Jalankan file `Main.class` langsung
* Gak perlu repot 2 langkah lagi 😎

````

---

## 🔧 Tips Markdown:

| Yang Kamu Tulis | Yang Lebih Disarankan |
|------------------|------------------------|
| `### pwd` | `pwd` di dalam block code |
| `## ini output ...` | Gunakan ` ```text ` untuk output |
| Gaya curhat langsung | Tetap bisa, tapi pakai *quote* atau *catatan* |

---

Kalau kamu mau versi README ini dimasukin ke semua folder minggu kamu secara otomatis, tinggal bilang **"masukin semua"** — langsung gue generate.
````
