package fr.afg.iteration1.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "vat_type")
public class VATType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private float rate;
    private LocalDate startDate;
    private LocalDate endDate;
    @OneToMany(mappedBy = "vatType", cascade = CascadeType.ALL)
    private List<ProductType> productTypes;

    public VATType(float rate, LocalDate startDate, LocalDate endDate) {
        this.rate = rate;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
