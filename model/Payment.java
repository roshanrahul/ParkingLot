package model;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private PaymentMode paymentMode;
    private LocalDateTime exitTime;
    private String transactioNo;
    private Status status;
    private Bill bill;

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public String getTransactioNo() {
        return transactioNo;
    }

    public void setTransactioNo(String transactioNo) {
        this.transactioNo = transactioNo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
