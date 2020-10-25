package pl.kzlamaniec.cc.creaditcard;

import java.math.BigDecimal;

public class CreditCard {
    private final String creditCardNumber;
    private final BillingCycle billingCycle;
    private BigDecimal balance;
    private BigDecimal cardLimit;


    public CreditCard(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
        this.billingCycle = new BillingCycle();
    }
    public String getCreditCardNumber(){
        return creditCardNumber;
    }

    public void assignLimit(BigDecimal limit){
        if (limitIsAlreadyAssigned()) {
            throw new limitIsAlreadyAssignedException();
        }

        if (limitIsLowerThan(limit)) {
            throw new limitIsLowerExeption();
        }
        cardLimit = limit;
        balance = limit;
    }

    public void reassignLimit(BigDecimal newLimit){
        if (limitIsLowerThan(newLimit)) {
            throw new limitIsLowerExeption();
        }
        balance = balance.add(newLimit.subtract(cardLimit));
        cardLimit = newLimit;
    }

    private boolean limitIsLowerThan(BigDecimal limit) {
        return limit.compareTo(BigDecimal.valueOf(100)) <= 0;
    }

    private boolean limitIsAlreadyAssigned() {
        return cardLimit != null;
    }

    public BigDecimal getCardLimit(){
        return cardLimit;
    }

    public void Withdraw(BigDecimal amount){
        if (overTheCardLimit(amount)){
            throw new notEnoughMoneyException();
        }
        if (notEnoughMoney(amount)){
            throw new notEnoughMoneyException();
        }

        balance = balance.subtract(amount);
    }

    private boolean notEnoughMoney(BigDecimal amount) {
        return amount.compareTo(balance) > 0;
    }

    private boolean overTheCardLimit(BigDecimal amount) {
        return amount.compareTo(cardLimit) > 0;
    }

    public void repay(BigDecimal amount){
        balance = balance.add(amount);
    }
    public BigDecimal getCurrentBalance(){
        return balance;
    }
    public void closeBillingCycle(){

    }
}
