package DesignPattern;

public class Account {
    private float amount;

    public void deposit(float money){
        if(money>0)
        amount+=money;
    }
    public void withDrawel(float money){
        if(money>0)
        amount-=money;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
