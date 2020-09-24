# Tutorial APAP

## Authors
Muhammad Aditya - 1806147054 - APAP A

## Tutorial 1
### What I have learned today
#### Github
**1. Apa itu Issue Tracker? Apa saja masalah yang dapat diselesaikan dengan Issue Tracker?**  
Issue tracker adalah sebuah fitur dari git yang berfungsi membuat list dari permasalahan atau isu dari project yang
nantinya bisa dilihat dan dipantau oleh seluruh tim developer. Masalah yang bisa diselesaikan oleh Issue Tracker adalah
membuat fitur baru, bugs, error dari kodingan, debugging, dsb.

**2. Apa perbedaan dari git merge dan git merge --squash?**  
perbedaan utama dari merge biasa dan squash adalah history branch dan commit di master. Git merge biasa setiap history
commit yang dilakukan di branch akan mengubah commit juga di master sedangkan kalau squash kita memerlukan 1 commit 
lagi untuk mengelompokkan perubahan yang dilakukan dari branch ke master namun commit history di branch tetap tersimpan 
(tidak berubah dengan commit squash).

**3. Apa keunggulan menggunakan Version Control System seperti Git dalam pengembangan suatu
aplikasi?**  
Menurut saya keunggulan dari Version Control System (git) adalah kemudahan, dokumentasi, dan fungsionalitas tinggi. 
Git memiliki banyak user base yang saling bekerja sama untuk mengembangkan git ke depannya sehingga kita sebagai pengguna 
dapat dengan mudah memiliki update selama pengerjaan aplikasi. Selanjutnya dokmentasi dari git juga sangat lengkap sehingga
setiap pengerjaan yang dibutuhkan dapat kita cari di dokumentasi. Lalu fungsi dari git juga sangat mendukung untuk pengembangan
suatu aplikasi. Misalnya kita bisa membagi pekerjaan dalam beberapa fitur kepada developer lalu melalui branch, 
developer bisa bekerja secara mandiri dan nantinya akan dihubungkan fitur tersebut ke dalam aplikasi secara dinamis.
Pengerjaan yang dilakukan secara dinamis dapat memangkas waktu dari pengembangan sebuah aplikasi. Selanjutnya setiap 
ubahan/commit pengerjaan dari developer juga terdata dengan baik sehingga pekerjaan yang dilakukan apabila terjai kendala 
atau error dapat dilihat historynya dengan seksama.

#### Spring
**4. Apa itu library & dependency?**  
Library adalah kumpulan program atau fungsi yang sudah disimpan dalam suatu module/package yang nantinya dapat digunakan
kembali untuk program lain (reuse).  
Dependency secara harfiah adalah ketergantungan dari sebuah class dengan class lain. Jadi dependency sendiri di dalam
spring menjadi topik khusus agar sebuah aplikasi memiliki interdependency (mengurangi ketergantungan) minim antar class.

**5. Mengapa kita menggunakan Maven? Apakah ada alternatif dari Maven?**  
Maven adalah sebuah Java Build Tools yang berguna untuk memudahkan kita dalam manajemen dependensi proyek yang 
berhubungan dengan Object dan Model (POM). Maven sendiri nanti akan langsung mendownload file-file jar yang bisa langsung 
kita gunakan di dalam repository. Alternatif dari Maven juga ada seperti Gradle, Sonatype Nexus, CMake, Bazel, dsb. 

**6. Selain untuk pengembangan web, apa saja yang bisa dikembangkan dengan Spring framework?**  
Spring framework juga bisa dikembangkan untuk membuat sebuah aplikasi berbasis java seperti aplikasi untuk android.
Core support dari Spring Framework (dependency injection) mampu memudahkan developer untuk mengembangkan sebuah aplikasi. 
Selanjutnya Spring framework juga bisa digunakan untuk membuat aplikasi khusus untuk keamanan dan aplikasi yang terkait 
dengan big data.

**7. Apa perbedaan dari @RequestParam dan @PathVariable? Kapan sebaiknya menggunakan @RequestParam atau @PathVariable?**  
Perbedaan antara @RequestParam dan @PathVariable adalah cara pengambilan nilai dari sebuah data yang ingin diproses.
@RequestParam mengambil nilai dari sebuah parameter query (static values) dengan cara request kepada URL sedangkan 
@PathVariable mengambil dynamic values dari URI path langsung secara extract. @RequestParam sebaiknya digunakan untuk 
sebuah traditional website dimana data langsung passed kedalam query parameter sedangkan @PathVariable lebih cocok
digunakan untuk RESTful web service dimana URL mengandung value. @RequestParam sendiri bisa memiliki default values 
sedangkan@PathVariable tidak bisa memiliki nilai default.

### What I did not understand
- [ ] Kenapa saya harus belajar APAP?
- [ ] Kenapa saya harus memahami Spring Framework secara lengkap?
- [ ] Apa Kesulitan nanti yang akan datang dari pengerjaan tutorial minggu kepedannya dan proyek kelompok?
