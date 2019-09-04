package in.armvin.productservice.api;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.armvin.productservice.product.Product;
import in.armvin.productservice.product.ProductLauncher;
import in.armvin.productservice.product.ProductStorage;

@RestController
public class ProductRestAPI {

	private static final Logger LOG = LoggerFactory.getLogger(ProductRestAPI.class);

	@Autowired
	ProductLauncher productLauncher;

	@Autowired
	private ProductStorage productStorage;

	@PostMapping(value = "/api/product")
	public Product postCustomer(@RequestBody Product product) {
		productLauncher.send(product);
		return product;
	}

	@GetMapping(value = "/api/products")
	public List<Product> getAll() {
		List<Product> products = productStorage.getProducts();
		LOG.debug("get All product === > ", products);
		return products;
	}

	@RequestMapping(value = "/exception")
	public String exception() {
		String response = "";
		try {
			throw new Exception("Exception has occured....");
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("Excpetion  ", e);

			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String stackTrace = sw.toString();
			LOG.error("Exception - " + stackTrace);
			response = stackTrace;
		}

		return response;
	}
}
