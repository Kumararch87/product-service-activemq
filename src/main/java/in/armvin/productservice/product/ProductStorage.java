package in.armvin.productservice.product;

import java.util.ArrayList;
import java.util.List;

public class ProductStorage {

	private List<Product> products = new ArrayList<>();

	public void launchProduct(Product product) {
		products.add(product);
	}

	public List<Product> getProducts() {
		return products;
	}
}
