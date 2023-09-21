package DeitelJavaProgrammingBook.ChapterTwo;

public class BankAccount {
        private int balance;

        public void deposit(int amount) {
            this.balance = balance + amount;
        }

        public void withdraw(int amount) {
            this.balance = balance - amount;
        }

        public int checkBalance() {
            return balance;
        }
        public int getBalance() {
            return balance;
        }
    }


