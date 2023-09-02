import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Billing {
    private int billId;
    private int reservationId;
    private BigDecimal totalAmount;
    private String paymentStatus;
    private String paymentMethod;
    private LocalDateTime billingDate;
    
	public Billing(int billId, int reservationId, BigDecimal totalAmount, String paymentStatus, String paymentMethod,
			LocalDateTime billingDate) {
		super();
		this.billId = billId;
		this.reservationId = reservationId;
		this.totalAmount = totalAmount;
		this.paymentStatus = paymentStatus;
		this.paymentMethod = paymentMethod;
		this.billingDate = billingDate;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public LocalDateTime getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(LocalDateTime billingDate) {
		this.billingDate = billingDate;
	}

	@Override
	public String toString() {
		return "Billing [billId=" + billId + ", reservationId=" + reservationId + ", totalAmount=" + totalAmount
				+ ", paymentStatus=" + paymentStatus + ", paymentMethod=" + paymentMethod + ", billingDate="
				+ billingDate + "]";
	}
    
}
