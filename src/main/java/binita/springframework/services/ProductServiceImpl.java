package binita.springframework.services;

import binita.springframework.domain.DomainObject;
import binita.springframework.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class ProductServiceImpl extends AbstractMapService implements ProductService {


    public ProductServiceImpl(){
        loadDomainObjects();

    }
    private Map<Integer,Product> products;



    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Product getById(Integer Id) {
        return (Product)super.getById(Id);
    }

    @Override
    public Product saveOrUpdate(Product domainObject) {
        return (Product) super.saveOrUpdate(domainObject);
        /*if(product != null){
            if(product.getId() == null){
                product.setId(getNextKey());
            }
            products.put(product.getId(), product);
            return product;
        }else{
            throw new RuntimeException("Product cant be null");
        }*/

    }

    @Override
    public void delete(Integer Id) {
        super.delete(Id);
    }

    private Integer getNextKey(){
        return Collections.max(products.keySet())+1;
    }

    @Override
    protected void loadDomainObjects() {

       products = new HashMap<>();

        Product product1 = new Product();
        product1.setId(1);
        product1.setDescription("Product 1");
        product1.setPrice(new BigDecimal("12.99"));
        product1.setImageUrl("http://example.com/product1");

        products.put(1, product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setDescription("Product 2");
        product2.setPrice(new BigDecimal("14.99"));
        product2.setImageUrl("http://example.com/product2");

        products.put(2, product2);

        Product product3 = new Product();
        product3.setId(3);
        product3.setDescription("Product 3");
        product3.setPrice(new BigDecimal("34.99"));
        product3.setImageUrl("http://example.com/product3");

        products.put(3, product3);

        Product product4 = new Product();
        product4.setId(4);
        product4.setDescription("Product 4");
        product4.setPrice(new BigDecimal("44.99"));
        product4.setImageUrl("http://example.com/product4");

        products.put(4, product4);

        Product product5 = new Product();
        product5.setId(5);
        product5.setDescription("Product 2");
        product5.setPrice(new BigDecimal("25.99"));
        product5.setImageUrl("http://example.com/product5");

        products.put(5, product5);
    }


}
