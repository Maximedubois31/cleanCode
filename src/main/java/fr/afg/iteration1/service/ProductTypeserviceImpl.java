package fr.afg.iteration1.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afg.iteration1.dao.ProductTypeDao;
import fr.afg.iteration1.entity.ProductType;

@Service
@Transactional
public class ProductTypeserviceImpl implements ProductTypeService {

    @Autowired
    ProductTypeDao productTypeDao;

    @Autowired
    ProductTypeService productTypeService;

    public List<ProductType> getAllProductType() {
        return productTypeDao.findAll();
    }

    public ProductType saveProductType(ProductType productType) {
        return productTypeDao.save(productType);
    }


}
