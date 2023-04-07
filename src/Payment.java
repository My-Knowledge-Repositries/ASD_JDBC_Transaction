import java.util.Date;

public class Payment {
    private String payId;
    private Date payDate;
    private double payment;

    public Payment() {
    }

    public Payment(String payId, Date payDate, double payment) {
        this.payId = payId;
        this.payDate = payDate;
        this.payment = payment;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
}
