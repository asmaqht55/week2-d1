public class Account {


    public String id;
    public  String name;
     public  int balance =0;

     public Account(String id,String name){
         this.id=id;
         this.name=name;
     }
      public Account(String id,String name,int balance){
         this.id=id;
         this.name=name;
         this.balance=balance;
      }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public void setId (String id){
         this.id=id;
    }
    public void  setName(String name){
         this.name=name;
    }
    public void setBalance(int balance){
         this.balance=balance;
    }
    public int credit(int amount){
         return balance+=amount;
    }
    public int debit(int amount) {
        if (amount <= balance)
            return amount - balance;
         else
             System.out.println("THE AMOUNT NOT LESS THAN OR EQUAL BALANCE:");
         return 0;
    }
    public int transferTo(Account another,int amount){
         if(amount<=balance){
             another.credit(amount);
         }
         else
             System.out.println("Amount Exceeded Balance");
         return balance;
    }

    @Override
    public String toString() {
        return "Account{"+"id="+id+'/'+"balance="+balance+'}';
    }
}
