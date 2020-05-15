

    public class MoneyTransfer {

        public static void main(String args[]){
            Account a = new Account();
            Account a2 = new Account();

            a2.setAmount(100d);
            a2.setId(2);
            a.setId(1);


        }

        public static void transfer(Account origemAccountId, Account destinyAccountId, double amount) {
            if(origemAccountId.getAmount() >= amount) {
                destinyAccountId.setAmount(amount);
                origemAccountId.setAmount(origemAccountId.getAmount() - amount);


        }
    }

    static class Account {
        private int id;
        private double amount;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }
    }

}
