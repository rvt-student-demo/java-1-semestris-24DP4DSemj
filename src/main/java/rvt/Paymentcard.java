package rvt;

public class Paymentcard {
   private double balance;
   
   public Paymentcard(double initialBalance) {
       this.balance = initialBalance;
   }

   public String toString() {
       return "The card has a balance of " + this.balance + " euros";
   }

   public void addMoney(double amount) {
       if (amount > 0) {
           this.balance += amount;
           if (this.balance > 150) {
               this.balance = 150;
           }
       }
   }

   public void eatAffordably() {
       if (this.balance >= 2.60) {
           this.balance -= 2.60;
       }
   }

    public void eatHeartily() {
         if (this.balance >= 4.60) {
              this.balance -= 4.60;
         }
    }

   public static void main(String[] args) {
        Paymentcard card = new Paymentcard(10);
        System.out.println(card);
   }

public class CardMain {
   public static void main(String[] args) {
    Paymentcard paulsCard = new Paymentcard(20);
    Paymentcard mattsCard = new Paymentcard(30);

    paulsCard.eatHeartily();
    mattsCard.eatAffordably();
    System.out.println("Paul: " + paulsCard);
    System.out.println("Matt: " + mattsCard);

    paulsCard.addMoney(20);
    mattsCard.eatHeartily();
    System.out.println("Paul: " + paulsCard);
    System.out.println("Matt: " + mattsCard);

    paulsCard.eatAffordably();
    paulsCard.eatAffordably();
    mattsCard.addMoney(50);
    System.out.println("Paul: " + paulsCard);
    System.out.println("Matt: " + mattsCard);
   } 
}
}