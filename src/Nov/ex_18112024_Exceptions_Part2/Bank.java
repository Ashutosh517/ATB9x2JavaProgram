package Nov.ex_18112024_Exceptions_Part2;

public class Bank {
    private String currency;
    private Integer amount;


    public Bank(Integer amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws Exception {
        if(!bankName.currency.equalsIgnoreCase("INR")){
            throw new Exception("Currency Mismatch,Can't Proceed");

        }
        return bankName.amount + this.amount;
    }

}

