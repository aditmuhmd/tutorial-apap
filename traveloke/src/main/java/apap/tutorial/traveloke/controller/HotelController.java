package apap.tutorial.traveloke.controller;

import apap.tutorial.traveloke.model.HotelModel;
import apap.tutorial.traveloke.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HotelController {
    @Autowired
    private HotelService hotelService;

    // Routing URL yang diinginkan
    @RequestMapping("/hotel/add")
    public String addHotel(
            // Request Parameter yang ingin dibawa
            @RequestParam(value = "idHotel", required = true) String idHotel,
            @RequestParam(value = "namaHotel", required = true) String namaHotel,
            @RequestParam(value = "alamat", required = true) String alamat,
            @RequestParam(value = "noTelepon", required = true) String noTelepon,
            Model model
    ){
        // Membuat objek HotelModel
        HotelModel hotel = new HotelModel(idHotel, namaHotel, alamat, noTelepon);

        // Memanggil service addHotel
        hotelService.addHotel(hotel);

        // Add variable id Hotel ke 'idHotel' untuk dirender di thymeleaf
        model.addAttribute("idHotel", idHotel);

        // Return view template yang digunakan
        return "add-hotel";
    }

    @RequestMapping("/hotel/viewall")
    public String listHotel(Model model){
        // Mendapatkan semua HotelModel
        List<HotelModel> listHotel = hotelService.getHotelList();

        // Add variabel semua HotelModel ke 'listhotel' untuk dirender pada thymeleaf
        model.addAttribute("listHotel", listHotel);

        // Return view template yang diinginkan
        return "viewall-hotel";
    }

    @RequestMapping("/hotel/view")
    public String detailHotel(
            @RequestParam(value = "idHotel") String idHotel, Model model
    ){
        // Mendapatkan HotelModel sesuai dengan idHotel
        HotelModel hotel = hotelService.getHotelByIdHotel(idHotel);

        // Mengecek apakah id hotel ada dalam database atau tidak
        if (hotel != null){
            // Add variabel HotelModel ke 'hotel' untuk dirender pada thymeleaf
            model.addAttribute("hotel", hotel);

            return "view-hotel";
        } else {
            return "errorMsg";
        }
    }

    @RequestMapping("/hotel/view/id-hotel/{idHotel}")
    public String lihatHotel(
            @PathVariable(value = "idHotel") String idHotel, Model model
    ){
        // Mendapatkan HotelModel sesuai dengan idHotel
        HotelModel hotel = hotelService.getHotelByIdHotel(idHotel);

        // Mengecek apakah id hotel ada dalam database atau tidak
        if (hotel != null){
            // Add variabel HotelModel ke 'hotel' untuk dirender pada thymeleaf
            model.addAttribute("hotel", hotel);

            return "view-hotel";
        } else {
            return "errorMsg";
        }
    }

    @RequestMapping("/hotel/update/id-hotel/{idHotel}/no-telepon/{noTelepon}")
    public String updateNoTeleponHotel(
            @PathVariable(value = "idHotel") String idHotel,
            @PathVariable(value = "noTelepon") String noTelepon, Model model
    ){
        // Mengupdate no Telepon sesuai dengan idHotel
        HotelModel hotel = hotelService.updateNoTeleponHotel(idHotel, noTelepon);

        // Mengecek apakah id hotel ada dalam database atau tidak
        if (hotel != null){
            // Add variabel HotelModel ke 'hotel' untuk dirender pada thymeleaf
            model.addAttribute("hotel", hotel);

            return "update-noTelepon";
        } else {
            return "errorMsg";
        }
    }

    @RequestMapping("hotel/delete/id-hotel/{idHotel}")
    public String deleteHotel(@PathVariable(value = "idHotel") String idHotel, Model model
    ){
        // Mendapatkan HotelModel sesuai dengan idHotel
        HotelModel hotel = hotelService.getHotelByIdHotel(idHotel);

        // Mengecek apakah id hotel ada dalam database atau tidak
        if (hotel != null){
            // Add variable id Hotel ke 'idHotel' untuk dirender di thymeleaf
            model.addAttribute("idHotel", idHotel);

            // Melakukan fitur delete dari hotel
            hotelService.deleteHotel(idHotel);

            return "delete-hotel";
        } else {
            return "errorMsg";
        }
    }
}
