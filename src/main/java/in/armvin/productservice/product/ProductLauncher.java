package in.armvin.productservice.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductLauncher {

	@Autowired
	JmsTemplate jmsTemplate;

	@Value("${amrvin.activemq.queue}")
	String queue;

	public void send(Product product) {
		jmsTemplate.convertAndSend(queue, product);
	}

}
