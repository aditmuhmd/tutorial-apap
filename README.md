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

## Tutorial 6
### Pertanyaan
**1. Jelaskan secara singkat perbedaan Otentikasi dan Otorisasi! Di bagian mana (dalam kode yang telah anda buat) konsep 
tersebut diimplementasi?** 
Otentikasi adalah proses untuk seorang pengguna mendapatkan hak akses kepasa suatu sistem yang sudah dibuat. Contoh kode
yang diimplementasikan pada bagian ini berada di class *WebSecurityConfig*:  
@Autowired  
public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception{auth.userDetailsService(userDetailsService).passwordEncode(encoder());}  
Seangkan Otorisasi adalah proses untuk menentukan apakah pengguna diijinkan atau ditolak untuk melakukan suatu aksi
ataupun akses tertentu di dalam sistem. Contoh kode yang diimplementasikan pada bagian ini berada di class *WebSecurityConfig*:  
.authorizeRequests()  
.antMatchers("/css/**").permitAll()  
.antMatchers("/js/**").permitAll()  
.antMatchers("/hotel/**").hasAuthority("RECEPTIONIST")  
.antMatchers("/user/addUser").hasAuthority("ADMIN")  
.antMatchers("/kamar/add/**").hasAuthority("RECEPTIONIST")  
Source: https://medium.com/@fahmiprasetiiio/authentication-dan-authorization-afa2029ff876  
**2. Apa itu BCryptPasswordEncoder? Jelaskan secara singkat cara kerjanya!**  
BCryptPasswordEncoder adalah salah satu encoder password dengan cara hashing khusus untuk penyimpanan password di dalam 
sistem yang lebih aman. Cara kerja BCryptPasswordEncoder adalah ketika sudah mendapatkan sebuah string password yang 
diisi oleh user, password akan dienkripsi dengan cara menggunakan hash Bcrypt yang sudah dirancang. Password yang sudah 
dienkripsi tidak bisa di decrypt kembali.  
**3. Jelaskan secara singkat apa itu UUID beserta penggunaannya!**  
UUID (Universally Unique Identifier) merupakan 128-bit angka yang digunakan untuk identify information di sistem komputer. 
Salah satu kegunaan UUID adalah untuk meningkatkan keamanan data. Hal ini dikarenakan UUID melakukan generate secara
random dari untuk ID yang dibuat di dalam sistem sehingga kemungkinan dari sebuah data yang memiliki ID yang sama akan
menjadi sangat kecil sehingga data tersimpan dengan ID lebih aman.  
**4. Apa kegunaan class UserDetailsServiceImpl.java? Mengapa harus ada class tersebut padahal kita sudah memiliki class 
UserRoleServiceImpl.java?**  
class UserDetailsServiceImpl.java berguna untuk mendapatkan informasi otentikasi dan otorisasi dari pengguna. Tujuannya agar 
Spring Boot Security dapat melakukan otorisasi terhadap pengguna yang melakukan login sesuai dengan rolenya yang sudah 
terdaftar di database dari fungsi yang dimiliki oleh interface UserDetailsService. Sehingga dapat disimpulkan bahwa class
UserDetailsServiceImpl sangat penting walaupun kita sudah memiliki UserRoleServiceImpl.

## Tutorial 7
### Pertanyaan
**1. Jelaskan apa yang Anda lakukan di latihan dalam satu paragraf per-soal. Berikan screenshot sebagai ilustrasi
dari apa yang Anda jelaskan.**  
###### Soal 1
Pada kali ini untuk menghilangkan checkbox, saya menggunakan *Ternary Display* yang bekerja seperti conditional untuk
bisa melihat apakah checkbox bisa dimunculkan dan tidak dimunculkan. Pada kali ini saya memberikan code dimana mengecek
apakah checked dari checkbox sudah true dan bila benar true, akan memunculkan checkbox di sebelah kanan atau my favorites.
Kode yang dibuat ini diubah pada bagian index.js di component item. Code yang dibuat adalah:
```
{checked === true ? (
    <input
    type="checkbox"
    className="ml-2"
    checked={checked}
    Change={handleChange} 
    />
) : (
    null
)}
```
Maka hasilnya akan seperti di bawah:  
<img width="643" alt="(1)" src="https://user-images.githubusercontent.com/60350747/101043247-aee9b480-35b0-11eb-930c-374d537f56ff.png"> 
###### Soal 2
Pada kali ini saya membuat sebuah button yang mampu menghapus seluruh isi list favorite dengan cara membuat sebuah 
fungsi di app.js yang mengubah state dari favItems menjadi kosong. Code yang saya buat adalah:
```
  deleteItemClick = () => {
    this.setState({favItems: []});
  }
```
Selanjutnya saya membuat button yang memanggil fungsi ini. Code yang dibuat adalah:
```
<button onClick={this.deleteItemClick}>Delete</button>
```
Untuk Tombol hanya akan muncul apabila sudah ada item di dalam list favorites, dapat dilihat source code nya pada bagian
nomor 5 dengan cara *Ternary Display*. Hasil dari kode yang sudah dibuat adalah:
- Sebelum dihapus
![image](https://user-images.githubusercontent.com/60350747/101043904-5ff04f00-35b1-11eb-8c06-b2bfa9e48a9d.png)
- Sesudah dihapus
![image](https://user-images.githubusercontent.com/60350747/101043971-73031f00-35b1-11eb-997c-6ccf3e4578fe.png)
###### Soal 3
Untuk membuat fungsi di bagian kiri yang hanya bisa melakukan add, saya hanya menghapus salah satu line dari kode 
handleItemClick yaitu *else newItems.splice(targetInd,1);*. Kode ini membuat item dari sebelah kanan akan dikembalikan
kembali ke semula ke sebelah kiri sehingga masih bisa melakukan delete kembali. Sehingga ketika kita menghapus line code
ini, bagian kiri hanya bisa melakukan Add.
###### Soal 4
Pada soal kali ini, saya hal yang pertama kali saya lakukan adalah membuat line code untuk toggle switch. Source code
yang saya ambil berasal dari https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_switch. Selanjutnya saya 
membuat fungsi *toggleFunction* yang membuat salah satu elemen dari div akan dibuat menjadi hilang atau _block_. Code
yang saya buat adalah:
App.js
```
  // Fungsi Toggle 
  toggleFunction = () => {
    var x = document.getElementById("favorite");
    if (x.style.display == "block") {
      x.style.display = "none";
    } else {
      x.style.display = "block";
    }
  }
        // Memanggil switch
        <div className="d-flex justify-content-center align-items-center">
          <label class="switch">
            <input type="checkbox" onClick={this.toggleFunction}/>
            <span class="slider round"></span>
          </label>
          <p className="col-1">Show Favorites</p>
        </div>
```
App.css
```
.switch {
  position: relative;
  display: inline-block;
  width: 60px;
  height: 34px;
}

.switch input { 
  opacity: 0;
  width: 0;
  height: 0;
}

.slider {
  position: absolute;
  cursor: pointer;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: #ccc;
  -webkit-transition: .4s;
  transition: .4s;
}

.slider:before {
  position: absolute;
  content: "";
  height: 26px;
  width: 26px;
  left: 4px;
  bottom: 4px;
  background-color: white;
  -webkit-transition: .4s;
  transition: .4s;
}

input:checked + .slider {
  background-color: #2196F3;
}

input:focus + .slider {
  box-shadow: 0 0 1px #2196F3;
}

input:checked + .slider:before {
  -webkit-transform: translateX(26px);
  -ms-transform: translateX(26px);
  transform: translateX(26px);
}

/* Rounded sliders */
.slider.round {
  border-radius: 34px;
}

.slider.round:before {
  border-radius: 50%;
}

#favorite {
  display: none;
}
```
Cara kerja dari kode ini adalah div dengan id *favorite* secara default akan memiliki display none atau tidak ada. 
Selanjutnya ketika tombol diklik, maka display akan menjadi block yang mengakibatkan tampilan muncul. Hal ini dilakukan
sebaliknya untuk menghilangkan tampilan favorit. Maka hasil dari pengerjaan ini adalah sebagai berikut:
- Sebelum diklik
![image](https://user-images.githubusercontent.com/60350747/101046349-8e6f2980-35b3-11eb-932b-ce78dfb969c2.png)
- Sesudah diklik
![image](https://user-images.githubusercontent.com/60350747/101046421-9cbd4580-35b3-11eb-9d66-87a5f6997885.png)
###### Soal 5
Untuk membuat fitur ketika daftar favorit kosong, saya kembali menggunakan *Ternary Display* dengan kondisional item dari
favorit items masih kosong. Ketika masih kosong, maka tampilkan tulisan bahwa tampilan belum ada. Namun ketika hasil ada,
maka tampilkan seluruh list item favorit disertai dengan button yang sudah dibuat. Code yang saya buat berada pada 
bagian App.js dengan syntax sebagai berikut:
```
              {favItems.length === 0 ? (
                <div className="text-center">
                  <h2>Belum ada item yang dipilih</h2>
                  <h5>Klik salah satu item di List Movies</h5>
                </div>
              ) : (
                <button onClick={this.deleteItemClick}>Delete</button>
              )}
```
Hasil dari kode ini akan terlihat seperti di bawah:
![image](https://user-images.githubusercontent.com/60350747/101046421-9cbd4580-35b3-11eb-9d66-87a5f6997885.png)
**2. Menurut pemahaman kamu selama pengerjaan tutorial ini, apa perbedaan antara state dan props?**  
Menurut saya, state adalah sebuah data private dari sebuah component yang hanya bisa tersedia untuk component tersebut
tanpa bisa diakses dari component lain. Sedangkankan props adalah singkatan dari *property* yang merupakan sebuah
parameter dari fungsi component. Bentuk props sangat mirip seperti attribute pada tag HTML. Sumber: https://medium.com/coderupa/react-prop-state-apa-bedanya-7ee61df8257f  

**3. Apa keuntungan menggunakan component (e.g. List, Item) di React? Berikan contohnya!**  
Keuntungan menggunakan component di React adalah kita bisa membuat suatu code yang bisa direuse berkali-kali sesuai dengan
kebutuhan dan kita tinggal panggil saja misalnya di bagian App.js. Contohnya adalah pada tutorial kali ini dimana ada
component List dan Item yang bisa dipanggil ulang untuk menampilkan seluruh film yang ada di file json sekaligus menampilkan
seluruh hasil favorit. Kode ini bisa kita panggil berkali-kali sesuai denga kebutuhan kita.  

**4. Menurut kamu, apa saja kelebihan menggunakan React dalam pengembangan web?**  
Kelebihan dalam menggunakan React adalah komponen yang dapat digunakan kembali seperti dari nomor 3, membuat aplikasi web
dinamis menjadi lebih mudah dikarenakan React dibuat menggunakan Javascript yang terkenal dengan animasi serta desain yang
baik dalam website, dan mampu memanfaatkan Javascript Library untuk diimplementasikan ke dalam website.  

**5. Menurut kamu, apa saja kekurangan menggunakan React dalam pengembangan web?**  
Kekurangan dari React dalam pengembangan web adalah hanya mendukung website yang baru-baru saja seperti Google Chrome
dan Mozila Firefox. Untuk browser lama, tidak akan bisa disupport oleh React. Selanjutnya juga dokumentasi dari ReactJS
kurang lengkap dan sistematis sehingga bagi seorang developer yang baru belajar (terutama saya yang tidak suka Javascript) 
cukup sulit untuk fasih menggunakan ReactJs.

## Tutorial 8
### Pertanyaan
**1. Ceritakan langkah - langkah yang kalian lakukan untuk solve LATIHAN no.1, dan mengapa kalian melakukan langkah - langkah tersebut?**  
Untuk solve latihan no.1, saya menambahkan this.setState pada handleAddHotel() dengan value "" (default) untuk namaHotel, alamat, dan nomorTelepon. Dengan begitu, default state pada form akan kembali setelah melakukan submit.

**2. Jelaskan fungsi dari async dan await!**  
async berfungsi untuk memberitahu bahwa fungsi yang dibuat bersifat asinkron atau non-blocking. Sedangkan await berfungsi untuk menangani proses asinkron yang sedang running hingga selesai sebelum code setelah await dijalankan. Implementasi async dan await pada tutorial ini adalah pada method loadData() di index.js HotelList.  

**3. Masukkan jawaban dari Screenshot yang diperintahkan di halaman 7 pada Component Lifecycle pada pertanyaan ini.**  
<img width="272" alt="1" src="https://user-images.githubusercontent.com/60350747/101927415-0cac7b00-3c07-11eb-8817-e439a5fa6f90.png">
<img width="960" alt="2" src="https://user-images.githubusercontent.com/60350747/101927450-13d38900-3c07-11eb-9236-0f22fb76c8dd.png">
<img width="347" alt="3" src="https://user-images.githubusercontent.com/60350747/101927456-159d4c80-3c07-11eb-987e-7bb60796848f.png">
<img width="376" alt="4" src="https://user-images.githubusercontent.com/60350747/101927458-16ce7980-3c07-11eb-8563-d640035c25a2.png">
<img width="960" alt="5" src="https://user-images.githubusercontent.com/60350747/101927461-18983d00-3c07-11eb-9518-0efa68d50a8e.png">

**4. Jelaskan fungsi dari componentDidMount, shouldComponentUpdate, componentDidUpdate, componentWillReceiveProps, componentWillUnmount.**  
*Notes : Penjelasan harus mencantumkan “kapan fungsi dipanggil” dan “use case apa saja yang biasanya menggunakan lifecycle method tersebut”.*  
 - componentDidMount merupakan lifecycle method yang dipanggil setelah component telah selesai render. Lifecycle method ini digunakan saat pengambilan/fetching data.

 - shouldComponentUpdate merupakan lifecycle method yang dipanggil sebelum props/state dari component dirender ulang karena mengalami perubahan. Component akan di render ulang jika return nya adalah true, jika false component tidak akan di render ulang.  
 Lifecycle method ini digunakan untuk menentukan apakah perubahan yang terjadi akan ditampilkan/tidak.  

 - componentDidUpdate merupakan lifecycle method yang dijalankan setelah component yang telah diupdate sudah selesai dirender.  
 Lifecycle method ini  biasanya digunakan saat melakukan interaksi dengan environment non-React. 

 - componentWillReceiveProps merupakan lifecycle method yang dijalankan sebelum component mengisi props yang baru dan mengalami pembaruan.  
 Lifecycle method ini digunakan untuk mengetahui apakah terdapat perubahan pada props atau tidak, tanpa melakukan render kembal.

 - componentWillUnmount merupakan lifecycle method yang dijalankan sebelum component di hapus dari DOM. Lifecycle method ini digunakan untuk melakukan cleanup seperti membatalkan network request dan menghilangkan event listener.

