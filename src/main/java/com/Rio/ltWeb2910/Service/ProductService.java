package com.Rio.ltWeb2910.Service;

import com.Rio.ltWeb2910.entity.Product;

public interface ProductService {

    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

}
