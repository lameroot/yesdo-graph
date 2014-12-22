package ru.yesdo.graph;

import com.sun.deploy.util.SearchPath;
import ru.yesdo.model.Product;
import ru.yesdo.model.SearchProductCriteria;

import java.util.List;

/**
 * User: Krainov
 * Date: 22.12.2014
 * Time: 18:33
 */
public interface ProductGraphRepository {

    public List<Product> findByCriteria(SearchProductCriteria searchProductCriteria);
}
