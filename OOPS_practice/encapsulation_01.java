//package OOPS_practice;

public class encapsulation_01 {
    public static class BankAccount {
        private int bal;

        public void setBal(int bal) {
            this.bal = bal;
        }

        public int getBal() {
            return bal;
        }
    }

    public static void main(String args[]) {
        BankAccount ba = new BankAccount();
        ba.setBal(1200);
        System.out.print(ba.getBal());
    }
}