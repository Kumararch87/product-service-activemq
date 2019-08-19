package in.armvin.productservice.product;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductBeanConfiguration {

	@Bean
	public ProductStorage productStorage() {
		return new ProductStorage();
	}

}
