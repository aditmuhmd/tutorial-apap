package apap.tutorial.traveloke.service;

import apap.tutorial.traveloke.model.HotelModel;

import java.util.List;

public interface HotelService {
    // Method untuk menambahkan Hotel
    void addHotel(HotelModel hotel);

    // Method untuk mendapatkan daftar hotel yang tersimpan
    List<HotelModel> getHotelList();

    // Method untuk mendapatkan data sebuah Hotel berdasarkan id hotel
    HotelModel getHotelByIdHotel(Long idHotel);

    // Method untuk update Hotel
    HotelModel updateHotel(HotelModel hotel);

    // Method untuk view all Hotel
    List<HotelModel> findAllByOrderByIdDesc();
}
