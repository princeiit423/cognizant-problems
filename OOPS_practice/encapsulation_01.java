//package OOPS_practice;

public class encapsulation_01 {
    public static class BankAccount {
        private int bal;

        public void setBal(int bal) {
            if (bal >= 0) {
                this.bal = bal;
            } else {
                System.out.print("balance is negative");
                System.exit(0);
            }
        }

        public int getBal() {
            return bal;
        }
    }

    public static void main(String args[]) {
        BankAccount ba = new BankAccount();
        ba.setBal(-1200);
        System.out.print(ba.getBal());
    }
}