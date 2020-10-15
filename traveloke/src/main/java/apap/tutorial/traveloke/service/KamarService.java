package apap.tutorial.traveloke.service;

import apap.tutorial.traveloke.model.HotelModel;
import apap.tutorial.traveloke.model.KamarModel;

import java.util.List;

public interface KamarService {
    // Method untuk Add Kamar
    void addKamar(KamarModel kamar);

    // Method untuk mencari seluruh kamar menggunakan id Hotel
    List<KamarModel> findAllKamarByIdHotel(Long idHotel);

    // Method untuk mendapatkan data sebuah Hotel berdasarkan id hotel
    KamarModel getKamarByNoKamar(Long noKamar);

    // Method untuk update kamar
    KamarModel updateKamar(KamarModel kamar);

    // Method untuk delete kamar
    void deleteByNoKamar(Long noKamar);
}
