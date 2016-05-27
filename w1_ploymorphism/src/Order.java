import java.util.Date;
import java.util.List;

public class Order {
	private Commissioned comissioned;

	Order(Commissioned comissioned,int orderNo,Date orderDate,int orderAmount){
		this.comissioned=comissioned;
		this.orderNo=orderNo;
		this.orderDate=orderDate;
		this.orderAmount=orderAmount;
	}
	private int orderNo;
	private Date orderDate;
	private int orderAmount;
	public Commissioned getComissioned() {
		return comissioned;
	}

	public void setComissioned(Commissioned comissioned) {
		this.comissioned = comissioned;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

}
