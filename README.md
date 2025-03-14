# README - Balanced Bracket

## Cara Kerja Program
Program ini mengecek apakah tanda kurung dalam sebuah string **seimbang** atau tidak. Artinya, setiap tanda kurung buka harus punya pasangannya dengan tanda kurung tutup yang benar dan dalam urutan yang tepat.

### **Aturan yang Dicek**
1. Hanya karakter berikut yang diperbolehkan: `()`, `{}`, `[]`.
2. Setiap kurung buka harus memiliki kurung tutup yang sesuai.
3. Urutan harus benar, misalnya `[(])` tidak valid.

## **Bagaimana Program Menentukan Keseimbangan?**
Program ini menggunakan **Stack (tumpukan)**:
- Setiap **kurung buka** ditambahkan ke stack.
- Setiap **kurung tutup** harus cocok dengan yang terakhir di stack.
- Jika semua kurung seimbang, maka **YES**, jika tidak **NO**.

## **Kompleksitas Waktu (Kecepatan Program)**
- Program hanya **melewati string sekali**, jadi kecepatannya **O(n)**.
- Artinya, semakin panjang string, semakin banyak operasi, tapi tetap **efisien**.

## **Contoh Penggunaan**
### **Input:**
```
{ [ ( ) ] }
```
### **Output:**
```
YES
```

Program ini bisa digunakan untuk mengecek apakah tanda kurung dalam kode atau teks sudah benar.


