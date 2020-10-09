package apap.tutorial.traveloke.repository;

import apap.tutorial.traveloke.model.KamarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KamarDb extends JpaRepository<KamarModel,Long> {
    // Method mencari list kamar berdasarkan Id Hotel
    List<KamarModel> findByHotelId(Long hotelId);

    // Method mencari kamar dari list Kamar
    KamarModel findByNoKamar(Long noKamar);

    // Method menghapus kamar
    void deleteByNoKamar(Long noKamar);
}

