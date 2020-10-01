package apap.tutorial.traveloke.service;

import apap.tutorial.traveloke.model.*;
import java.util.List;

public interface HotelService {
    // Method untuk menambahkan Hotel
    void addHotel(HotelModel hotel);

    // Method untuk mendapatkan daftar hotel yang tersimpan
    List<HotelModel> getHotelList();

    // Method untuk mendapatkan data sebuah Hotel berdasarkan id hotel
    HotelModel getHotelByIdHotel(String idHotel);
}
