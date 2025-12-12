package rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    
        double afforablePrice = 2.50;
        double change;
        if (payment >= 2.50) {
            change = payment - afforablePrice;
            this.money += (payment - change);
            return change;
        } else {
            return payment;
        }

    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    
     double heartilyPrice = 4.30;
        double change;
        if (payment >= 4.30) {
            change = payment - heartilyPrice;
            this.money += (payment - change);
            return change;
        } else {
            return payment;
        }
    }

     public boolean eatAffordably(PaymentCards card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= 2.50){
            this.affordableMeals += 1;
            card.takeMoney(2.50);
            return true;
        } else {
            return false;
        }
    }
    public boolean eatHeartily(PaymentCards card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    if (card.balance() >= 4.30){
            this.heartyMeals += 1;
            card.takeMoney(4.30);
            return true;
        } else {
            return false;
        }
    }
    public void addMoneyToCard(PaymentCards card, double sum) {
    if (sum > 0) {
        card.addMoney(sum);
        this.money += sum;
    }
}

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

}
