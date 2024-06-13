package rikkei.academy.modules.products.service;


import rikkei.academy.generic.IGeneric;
import rikkei.academy.modules.products.Product;
import rikkei.academy.modules.products.dto.request.ProductRequest;
import rikkei.academy.modules.products.dto.response.ProductResponse;

import java.util.List;

public interface IProductService extends IGeneric<Product,Integer> {
    List<Product> findAllProduct();
    List<Product> findByPagination(Integer page ,Integer limit);
    void save(ProductRequest request);
    List<ProductResponse> searchByName(String keyword);
    long getTotalsElement();
    boolean existByName(String name);
    List<Product> findByCategory(Integer categoryId);
}
