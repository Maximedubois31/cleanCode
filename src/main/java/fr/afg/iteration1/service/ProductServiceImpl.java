package fr.afg.iteration1.service;

import fr.afg.iteration1.dao.ProductDao;
import fr.afg.iteration1.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;


    public Product saveProduct(Product product) {
        return productDao.save(product);
    }

    public List<Product> getAllProduct() {
        return productDao.findAll();
    }

    public Product findById(Long id) {
        return productDao.findById(id).get();
    }

    public void deleteProduct(Product product) {
        productDao.delete(product);
    }

    public List<Product> findByProductIsActive(boolean isActive) {
        return productDao.findByProductIsActive(isActive);
    }


}
