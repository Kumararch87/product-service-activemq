package in.armvin.productservice.product;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

	private Long productId;
	private String productCode;
	private String productName;
	private Date mnfDate;
	private Date expDate;
	private BigDecimal price;

	public Product() {
		super();
	}

	public Product(Long productId, String productCode, String productName, Date mnfDate, Date expDate,
			BigDecimal price) {
		super();
		this.productId = productId;
		this.productCode = productCode;
		this.productName = productName;
		this.mnfDate = mnfDate;
		this.expDate = expDate;
		this.price = price;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getMnfDate() {
		return mnfDate;
	}

	public void setMnfDate(Date mnfDate) {
		this.mnfDate = mnfDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCode=" + productCode + ", productName=" + productName
				+ ", mnfDate=" + mnfDate + ", expDate=" + expDate + ", price=" + price + "]";
	}

}
