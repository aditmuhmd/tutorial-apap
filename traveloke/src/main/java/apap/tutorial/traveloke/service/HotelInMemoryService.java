package apap.tutorial.traveloke.service;

import apap.tutorial.traveloke.model.HotelModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelInMemoryService implements HotelService {

    private List<HotelModel> listHotel;

    // Constructor
    public HotelInMemoryService(List<HotelModel> listHotel) {
        this.listHotel = listHotel;
    }

    @Override
    public void addHotel(HotelModel hotel) {
        listHotel.add(hotel);
    }

    @Override
    public List<HotelModel> getHotelList() {
        return listHotel;
    }

    @Override
    public HotelModel getHotelByIdHotel(String idHotel) {
        for (HotelModel hotel: listHotel)
        {
            if (idHotel.equals(hotel.getIdHotel())){
                return hotel;
            }
        }
        return null;
    }
}
