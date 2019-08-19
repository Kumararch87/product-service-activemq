package in.armvin.productservice.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerReceiveNotification {

	@Autowired
	private ProductStorage productStorage;

   @JmsListener(destination = "${amrvin.activemq.queue}", containerFactory="jsaFactory")
	public void receive(Product product) {
		System.out.println("Recieved Message: " + product);
		productStorage.launchProduct(product);
	}
}
