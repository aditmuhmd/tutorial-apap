package apap.tutorial.traveloke.controller;

import apap.tutorial.traveloke.model.HotelModel;
import apap.tutorial.traveloke.model.KamarModel;
import apap.tutorial.traveloke.service.HotelService;
import apap.tutorial.traveloke.service.KamarService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class KamarController {
    @Qualifier("hotelServiceImpl")
    @Autowired
    private HotelService hotelService;

    @Autowired
    private KamarService kamarService;

    @GetMapping("/kamar/add/{idHotel}")
    private String addKamarFormPage(
            @PathVariable Long idHotel,
            Model model
    ){
        KamarModel kamar = new KamarModel();
        HotelModel hotel = hotelService.getHotelByIdHotel(idHotel);
        ArrayList<KamarModel> temp = new ArrayList<>();
        temp.add(new KamarModel());
        kamar.setHotel(hotel);
        hotel.setListKamar(temp);
        model.addAttribute("hotel",hotel);

        return "form-add-kamar";
    }

    @PostMapping(value="/kamar/add", params = {"add"})
    public String addRowKamar(@ModelAttribute HotelModel hotel,
                         Model model){
        if (hotel.getListKamar() == null){
            hotel.setListKamar(new ArrayList<KamarModel>());
        }
        hotel.getListKamar().add(new KamarModel());
        model.addAttribute("hotel", hotel);
        return "form-add-kamar";
    }

    @PostMapping(value="/kamar/add", params={"delete"})
    public String deleteRowKamar(@ModelAttribute HotelModel hotel,
//                            final BindingResult bindingResult,
                            final HttpServletRequest req,
                            Model model){
        final Integer row = Integer.valueOf(req.getParameter("delete"));
        hotel.getListKamar().remove(row.intValue());
        model.addAttribute("hotel", hotel);
        return "form-add-kamar";
    }

    @PostMapping(value = "/kamar/add", params = {"save"})
    private String addKamarSubmit(
            @ModelAttribute HotelModel hotel,
            Model model
    ){
        HotelModel hotelModel = hotelService.getHotelByIdHotel(hotel.getId());
        for (KamarModel kamar : hotel.getListKamar()) {
            kamar.setHotel(hotelModel);
            kamarService.addKamar(kamar);
        }
        return "add-kamar";
    }

    @GetMapping("/kamar/change/{noKamar}")
    private String changeKamarFormPage(
            @PathVariable Long noKamar, Model model
    ){
        KamarModel kamar = kamarService.getKamarByNoKamar(noKamar);
        model.addAttribute("kamar", kamar);
        return "form-update-kamar";
    }

    @PostMapping("/kamar/change")
    private String changeKamarFormSubmit(
            @ModelAttribute KamarModel kamar,
            Model model
    ){
        KamarModel kamarUpdated = kamarService.updateKamar(kamar);
        model.addAttribute("kamar", kamarUpdated);
        return "update-kamar";
    }

    @PostMapping(path = "/kamar/delete")
    public String deleteKamarFormSubmit(
            @ModelAttribute HotelModel hotel,
            Model model
    ){
        model.addAttribute("kamarCount", hotel.getListKamar().size());

        for(KamarModel kamar : hotel.getListKamar()){
            kamarService.deleteKamar(kamar);
        }
        return "delete-kamar";
    }
}