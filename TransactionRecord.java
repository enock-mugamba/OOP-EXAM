public class TransactionRecord {
    private String buyerTIN;
    private String sellerTIN;
    private double invoiceAmount;
    private long transactionTimestamp;

    public String getBuyerTIN() {
        return buyerTIN;
    }

    public void setBuyerTIN(String buyerTIN) {
        if (buyerTIN != null && !buyerTIN.isEmpty()) {
            this.buyerTIN = buyerTIN;
        } else {
            throw new IllegalArgumentException("Buyer TIN cannot be null or empty.");
        }
    }

    public String getSellerTIN() {
        return sellerTIN;
    }

    public void setSellerTIN(String sellerTIN) {
        if (sellerTIN != null && !sellerTIN.isEmpty()) {
            this.sellerTIN = sellerTIN;
        } else {
            throw new IllegalArgumentException("Seller TIN cannot be null or empty.");
        }
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        if (invoiceAmount >= 0) {
            this.invoiceAmount = invoiceAmount;
        } else {
            throw new IllegalArgumentException("Invoice amount cannot be negative.");
        }
    }

    public long getTransactionTimestamp() {
        return transactionTimestamp;
    }

    public void setTransactionTimestamp(long transactionTimestamp) {
        if (transactionTimestamp > 0) {
            this.transactionTimestamp = transactionTimestamp;
        } else {
            throw new IllegalArgumentException("Transaction timestamp must be a valid positive value.");
        }
    }

    @Override
    public String toString() {
        return "TransactionRecord{" +
                "buyerTIN='" + buyerTIN + '\'' +
                ", sellerTIN='" + sellerTIN + '\'' +
                ", invoiceAmount=" + invoiceAmount +
                ", transactionTimestamp=" + transactionTimestamp +
                '}';
    }