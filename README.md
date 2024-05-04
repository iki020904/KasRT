## Parsing JSON Android Studio

### Anggota Kelompok <br>

| Nama                      | NIM       | Kelas     | Mata Kuliah          |
| ------------------------- | --------- | --------- | -------------------- |
| Muhammad Rifqi Aziz       | 312210111 | TI.22.A.1 | Pemrograman Mobile 2 |
| Mohammad Azmi Abdussyukur | 312210109 | TI.22.A.1 | Pemrograman Mobile 2 |
|                           |           | TI.22.A.1 | Pemrograman Mobile 2 |


Aplikasi laporan keuangan kas RT

Aplikasi kas RT menggunakan parsing JSON dari API spreadsheet dengan tujuan untuk mempermudah pengelolaan keuangan di tingkat RT. Dengan menggunakan API spreadsheet, aplikasi dapat mengakses data secara real-time langsung dari spreadsheet yang ada, sehingga memastikan bahwa informasi yang diperoleh selalu terkini. Selain itu, dengan memanfaatkan parsing JSON, aplikasi dapat secara otomatis memproses data yang diambil dari spreadsheet tersebut, seperti melakukan penghitungan saldo, pembuatan laporan, atau visualisasi data tanpa perlu campur tangan manual. Pendekatan ini juga memungkinkan integrasi dengan aplikasi lain yang membutuhkan data keuangan RT, seperti aplikasi pembukuan atau analisis keuangan. Dengan menyimpan data dalam spreadsheet dan mengaksesnya melalui API, pemeliharaan data menjadi lebih mudah karena tim pengelola dapat memperbarui atau mengubah data langsung di spreadsheet, dan perubahan tersebut akan secara otomatis tercermin dalam aplikasi yang menggunakan API spreadsheet tersebut. Solusi ini juga memberikan skalabilitas, memungkinkan aplikasi untuk berkembang seiring dengan kebutuhan tanpa memerlukan perubahan yang signifikan dalam infrastruktur atau arsitektur aplikasi itu sendiri. Dengan demikian, aplikasi kas RT yang menggunakan parsing JSON dari API spreadsheet dapat memberikan manfaat yang signifikan dalam pengelolaan keuangan RT dengan lebih efisien dan efektif.

Tampilan: 
- Foto warga
- Nama pertama
- Nama Belakang
- Email
- Alamat rumah
- Jumlah iuran bulanan warga
- Total iuran individu warga
- Total iuran warga pada akhir rekap iuran Bulanan
- Pengeluaran iuran dari hasil iuran warga
- Pemanfaatan dari iuran warga untuk apa saja

Langkah-langkah Praktikum:

- Registrasi dan Dapatkan API Key: Daftar dan peroleh API key dari ApiSpreadsheets.
- Identifikasi Spreadsheet: Tentukan ID spreadsheet yang berisi data keuangan KAS RT yang akan diakses oleh aplikasi Anda.
- Buat Proyek Android: Buat proyek baru dalam lingkungan pengembangan Android Studio.
- Desain Antarmuka Pengguna: Rencanakan dan buat desain antarmuka pengguna (UI) yang sesuai dengan rincian yang diberikan.
- Koneksi ke API: Buat logika koneksi ke API menggunakan Retrofit atau pustaka HTTP klien lainnya dalam aplikasi Android Anda.
- Parsing Data JSON: Implementasikan logika parsing JSON untuk mengambil data dari respons API.
- Tampilkan Data: Tampilkan data yang diperoleh dari API ke dalam antarmuka pengguna aplikasi Android sesuai dengan rincian yang diminta.
- Uji Aplikasi: Lakukan pengujian menyeluruh terhadap aplikasi Anda untuk memastikan bahwa semua fitur berjalan dengan baik dan data ditampilkan dengan benar.

Build Gradle
```
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("com.github.bumptech.glide:glide:4.11.0")
    implementation("com.loopj.android:android-async-http:1.4.9")
    implementation("com.google.code.gson:gson:2.8.9")
    implementation("com.squareup.retrofit2:retrofit:2.6.4")
    implementation("com.squareup.retrofit2:converter-gson:2.6.4")
    implementation("com.squareup.okhttp3:logging-interceptor:3.8.0")
    debugImplementation("com.github.chuckerteam.chucker:library:3.3.0")
```

Dokumentasi :
1. YouTube : 
2. Pdf : 

# Terima kasih
