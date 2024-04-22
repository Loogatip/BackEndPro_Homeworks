package app.repository;

import app.domain.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class ProductRepositoryMap implements ProductRepository{

    private Map<Long, Product> database = new HashMap<>();

    public ProductRepositoryMap() {
        database.put(1L, new Product(1L, "Шлепки", 12));
        database.put(2L, new Product(2L, "Ботинки", 49));
        database.put(3L, new Product(3L, "Сапоги", 37));
    }
    @Override
    public Product getById(Long id) {
        return database.get(id);
    }
}
