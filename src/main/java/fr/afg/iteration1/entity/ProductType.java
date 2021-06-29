package fr.afg.iteration1.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "product_type")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productType;
    @OneToMany(mappedBy = "productType")
    private List<Product> products;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private VATType vatType;

    public ProductType(String productType, VATType vatType) {
        this.productType = productType;
        this.vatType = vatType;
    }
}
