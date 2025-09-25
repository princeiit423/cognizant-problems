public class constructor_chaining_02 {
    static class Customer {
        private int cId;
        private String cName;
        private long cNum;

        Customer() {
            cId = 1;
            cName = "afreen";
            cNum = 896124907;
        }

        // setter function conventionaly used class name but we can also used another
        // name
        Customer(int cId, String cName, long cNum) {
            this(); // used for cunstroctor chaining in local
            // this.cId = cId;
            // this.cName = cName;
            // this.cNum = cNum;
        }

        // getter fuction
        public int getId() {
            return cId;
        }

        public String getName() {
            return cName;
        }

        public long getNum() {
            return cNum;
        }
    }

    public static void main(String args[]) {
        Customer c1 = new Customer(1, "Alif", 87523190);

        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getNum());

    }
}