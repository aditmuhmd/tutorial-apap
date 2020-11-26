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

## Tutorial 2
**1. Cobalah untuk menambahkan sebuah Hotel dengan mengakses link berikut:  
http://localhost:8080/hotel/add?idHotel=1&namaHotel=Papa%20APAP&alamat=Quanta%20Fasilkom&noTelepon=081xxx  
Apa yang terjadi? Jelaskan mengapa hal tersebut dapat terjadi**  
Terjadi error "*Error resolving template [add-hotel]*". Hal ini terjadi dikarenakan controller yang ingin mencari 
template/html tetapi belum ada htmlnya atau memanggil template yang tidak ada. Oleh karena itu, untuk memperbaiki 
error ini, kita harus membuat sebuah template "*add-hotel.html*" di dalam templates yang bisa dipanggil oleh controller.

**2. Menurut kamu anotasi @Autowired pada class Controller tersebut merupakan implementasi dari konsep apa? 
Dan jelaskan secara singkat cara kerja @Autowired tersebut dalam konteks service dan controller yang telah kamu buat**  
Implementasi dari anotasi @Autowired merupakan implementasi konsep Dependency Injection dikarenakan @Autowired sendiri
secara otomatis menginject dependensi dari sebuah class. Cara kerja yang dilakukan dalam konteks service dan controller
yang saya buat adalah di dalam controller yang saya buat, @Autowired secara otomatis meningject service yang diimplementasi
oleh "hotelService". Service yang dibuat pada kali ini adalah "HotelInMemoryService". Jadi interface hotelService yang 
diambil menggunakan @Autowired dapat menggunakan method class "HotelInMemoryService" di dalam controller.


**3. Cobalah untuk menambahkan sebuah Hotel dengan mengakses link berikut:
http://localhost:8080/hotel/add?idHotel=1&namaHotel=Papa%20APAP&alamat=Quanta%20Fasilkom
Apa yang terjadi? Jelaskan mengapa hal tersebut dapat terjadi.**  
Hal ini terjadi error *Required String parameter 'noTelepon' is not present*. Hal ini terjadi karena ketika melakukan
request mapping, ada salah satu nilai yaitu "noTelepon" yang tidak ada di dalam URL sehingga terjadi error diatas. Hal
ini bisa diselesaikan dengan cara memberi URL yang lebih tepat dengan ada parameter noTelepon.

**4. Jika Papa APAP ingin melihat Hotel dengan nama Papa APAP, link apa yang harus
diakses?**  
link yang harus diakses: http://localhost:8080/hotel/view/id-hotel/1 atau http://localhost:8080/hotel/view?idHotel=1

**5. Tambahkan 1 contoh Hotel lainnya sesukamu. Lalu cobalah untuk mengakses
http://localhost:8080/hotel/viewall , apa yang akan ditampilkan? Sertakan juga bukti screenshotmu.**  
Pada kali ini saya juga membuat hotel Mama AMAM sehingga ketika mengakses link diatas, maka akan muncul halaman seperti
dibawah:  
[
![screenshot](https://user-images.githubusercontent.com/60350747/94825043-e52f7a00-042f-11eb-9460-74639580002e.jpg)
](url)

## Tutorial 3
### What I have learned today  
Pada tutorial minggu ketiga, saya mempelajari cara menggunakan **database server** dengan model CRUD dalam spring 
project ke dalam project traveloke yang telah saya buat di tutorial minggu lalu. Pada tutorial ini saya menggunakan 
library **JPA** yang melakukan pendekatan object relational mapping seperti gambar relasi yang sudah digambarkan. 
Menurut saya tutorial minggu ini cukup menarik karena setiap data yang saya lakukan fungsinya dapat selalu disimpan 
di dalam database yang sudah saya buat dan langsung bisa di cek di http://localhost/phpmyadmin.

### Pertanyaan  
1. **Pada class KamarDb, terdapat method findByHotelId, apakah kegunaan dari method tersebut?**  
Method findByHotelId berguna untuk mencari data kamar dari Kamar Model berdasarkan Id hotel dan disimpan dalam bentuk 
List<Kamar Model>

2. **Pada class HotelController, jelaskan perbedaan method addHotelFormPage dan addHotelSubmit?**  
Method addHotelFormPage berfungsi sebagai pengambil data (dalam kasus ini id Hotel) dan menampilkan tampilan html yang 
berisi form untuk menambah Hotel kedalam database dengan bantuan fungsi GetMapping. Sedangkan method addHotelSubmit 
dijalankan untuk mengambil masukan dari html form yang telah diisi dengan bantuan fungsi PostMapping. Post biasanya 
dilakukan apabila ingin melakukan perubahan isi dari data di dalam database.  

3. **Jelaskan kegunaan dari JPA Repository!**  
JPA Repository adalah sebuah library yang mempertahankan java objects ke database menggunakan ORM (Object Relational 
Mapping). JPA berguna untuk menghubungkan relational database lokal dengan java, membuat repository custom di lokal, dan 
memanipulasi data tanpa menggunakan query walaupun kadang tetap ada penggunaan query.  

4. **Sebutkan dan jelaskan di bagian kode mana sebuah relasi antara HotelModel dan KamarModel dibuat?**  
HotelModel:  
@OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY, cascade = CascadeType.ALL) // 1 hotel bisa memiliki banyak kamar  
KamarModel:  
@ManyToOne(fetch = FetchType.EAGER, optional = false) // banyak kamar bisa dimiliki oleh 1 hotel  
@JoinColumn(name = "hotelId", referencedColumnName = "id", nullable = false) // menyambungkan hotelId pada kamar dengan id pada Hotel  
@OnDelete(action = OnDeleteAction.CASCADE) // Menghapus keseluruhan bila terjadi kasus delete

5. **Jelaskan kegunaan FetchType.LAZY, CascadeType.ALL, dan FetchType.EAGER!**
- FetchType.LAZY: melakukan load untuk collection object child yang diinginkan saat object parent di-fetch via getter 
method. FetchType.LAZY juga merupakan default fetching untuk OnetoMany dan ManytoMany. 
- CascadeType.ALL: menyediakan property cascade untuk seluruh object yang memiliki relasi. Apabila object dihapus maka 
entity juga akan terhapus.
- FetchType.EAGER: melakukan load untuk semua object child sesaat setelah object parent di-fetch.

## Tutorial 4
### Pertanyaan
**1.Jelaskan perbedaan th:include dan th:replace**  
include merupakan fungsi memasukkan konten fragment ke dalam tag host. Sedangkan replace merupakan fungsi menggantikan 
tag host yang dituju dengan tag host yang mendefinisikan sebuah fragmen. Nantinya tag host yang dituju akan digantikan
oleh tag host yang sudah terdefinisi.  
**2. Jelaskan apa fungsi dari th:object!**  
th:object berfungsi untuk men-spesifikasi suatu nilai object yang terikat dengan data dari formulir atau elemen HTML.  
**3. Jelaskan perbedaan dari * dan $ pada saat pengguan th:object! Kapan harus dipakai?**  
(*) = akan mengevaluasi atribut atau varible saja dari th:object sedangkan ($) = akan mengevaluasi **keseluruhan** atribut 
atau variabel pada th:object.  
**4.Bagaimana kamu menyelesaikan latihan nomor 3?**  
Pada fragment.html, saya menggunakan *div class="navbar-text ml-auto" th:text="${brand}"*. *ml-auto* 
digunakan agar terdapat text pada bagian kanan navbar yang sudah disesuaikan untuk setiap HTML. Kemudian, pada halaman 
HTML yang ingin saya berikan text, saya menambahkan navbar (brand='NamaHTML/NamaHalaman') pada setiap pemanggilan *nav*
di dalam body. Hal ini saya lakukan agar brand bisa diganti di seluruh html sesuai dengan keinginan saya.  

## Tutorial 5
### Pertanyaan
**1. Apa itu Postman? Apa kegunaannya?**  
Postman adalah tool dalam melakukan proses *development* API yang berfungsi dengan cara menjadi REST Client. 
Kegunaan postman adalah untuk Collection, Environment, Response, Mock Server, Script Test, Automated Test (Runner). 
Sumber: https://medium.com/@novancimol12/postman-4f181d625fe1#:~:text=Postman%20merupakan%20tool%20untuk%20melakukan,Collection  
**2. Apa kegunaan dari annotation @JsonIgnoreProperties dan @JsonProperty?**  
@JsonIgnoreProperties digunakan untuk mengabaikan atribut apapun yang tidak tercantum pada class di dalam 
serialization & deserialization JSON. Hal ini dapat memudahkan kita untuk panggilan REST dan menghasilkan objek domain.
Sedangkan @JsonProperty digunakan untuk anotasi nonstandard getter/setter untuk mengindikasi bahwa adanya sebuah properti
dalam JSON. Dengan JsonProperty, properti JSON pada field java yang sudah dianotasi akan dilakukan mapping oleh Jackson 
ObjectMapper.  
**3. Apa kegunaan attribut WebClient?**  
Kegunaan attribut WebClient adalah untuk mewakili titik masuk dalam permintaan web seperti menerima respon serta 
mengirimkan URI dan membuat mekanisme request dari sisi client. sumber: https://www.baeldung.com/spring-5-webclient  
**4. Apa itu ResponseEntity dan BindingResult? Apa kegunaannya?**  
ResponseEntity merupakan salah satu class yang terdapat di Java untuk mempresentasikan keseluruhan HTTP response termasuk 
headers, body, dan status. Sedangkan BindingResult merupakan sebuah interface yang memberi izin untuk validator yang biasanya 
digunakan validasi adanya kesalahan ataupun *binding specific analysis and model building*. Contoh kesalahan tersebut 
adalah adanya field yang diperlukan dan adanya ketidakcocokan jenis atau kesalahan dalam melakukan pemanggilan method. Sumber:  
https://www.baeldung.com/spring-response-entity dan https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/validation/BindingResult.html
