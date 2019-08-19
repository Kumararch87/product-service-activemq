package in.armvin.productservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.armvin.productservice.product.Product;
import in.armvin.productservice.product.ProductLauncher;
import in.armvin.productservice.product.ProductStorage;

@RestController
public class ProductRestAPI {

	@Autowired
	ProductLauncher productLauncher;

	@Autowired
	private ProductStorage productStorage;

	@PostMapping(value = "/api/product")
	public Product postCustomer(@RequestBody Product product) {
		productLauncher.send(product);
		return product;
	}
	
	 @GetMapping(value="/api/products")
	  public List<Product> getAll(){
	    List<Product> products = productStorage.getProducts();
	    return products;
	  }

}
