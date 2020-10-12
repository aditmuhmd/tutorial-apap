package apap.tutorial.traveloke.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name="review")
public class ReviewModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max=10)
    @Column(name = "namaReviewer", nullable = false)
    private String namaReview;

    @NotNull
    @Size(max=50)
    @Column(name = "isiReviewer", nullable = false)
    private String isiReviewer;

    @NotNull
    @Size(max=50)
    @Column(name = "saran", nullable = true)
    private String saran;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "kamarId", referencedColumnName = "noKamar", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private KamarModel kamar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaReview() {
        return namaReview;
    }

    public void setNamaReview(String namaReview) {
        this.namaReview = namaReview;
    }

    public String getIsiReviewer() {
        return isiReviewer;
    }

    public void setIsiReviewer(String isiReviewer) {
        this.isiReviewer = isiReviewer;
    }

    public String getSaran() {
        return saran;
    }

    public void setSaran(String saran) {
        this.saran = saran;
    }

    public KamarModel getKamar() {
        return kamar;
    }

    public void setKamar(KamarModel kamar) {
        this.kamar = kamar;
    }
}
