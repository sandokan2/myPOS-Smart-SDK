package com.mypos.smartsdk;


/**
 * Describes a refund
 */
public class MyPOSRefund {
    private double   refundAmount;
    private String   foreignTransactionId;
    private Currency currency;

    private MyPOSRefund(Builder builder) {
        this.refundAmount = builder.refundAmount;
        this.foreignTransactionId = builder.foreignTransactionId;
        this.currency = builder.currency;
    }


    public static Builder builder() {
        return new Builder();
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public MyPOSRefund setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }

    public String getForeignTransactionId() {
        return foreignTransactionId;
    }

    public MyPOSRefund setForeignTransactionId(String foreignTransactionId) {
        this.foreignTransactionId = foreignTransactionId;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public MyPOSRefund setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public static final class Builder {
        private Double   refundAmount;
        private String   foreignTransactionId;
        private Currency currency;

        public Builder refundAmount(Double productAmount) {
            this.refundAmount = productAmount;
            return this;
        }

        public Builder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public Builder foreignTransactionId(String foreignTransactionId) {
            this.foreignTransactionId = foreignTransactionId;
            return this;
        }

        public MyPOSRefund build() {
            if (this.refundAmount != null && this.refundAmount != 0.0D
                    && this.currency != null) {
                return new MyPOSRefund(this);
            } else {
                throw new IllegalArgumentException("Invalid amount");
            }
        }
    }
}
