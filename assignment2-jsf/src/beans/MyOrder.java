package beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Orders" database table.
 * 
 */
@Entity
@Table(name="\"Orders\"", schema="TESTAPP")
@NamedQuery(name="MyOrder.findAll", query="SELECT m FROM MyOrder m")
public class MyOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"ID\"")
	private Integer id;

	@Column(name="\"ORDER_NO\"")
	private String orderNo;

	@Column(name="\"PRICE\"")
	private double price;

	@Column(name="\"PRODUCT_NAME\"")
	private String productName;

	@Column(name="\"QUANTITY\"")
	private Integer quantity;

	public MyOrder() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}