public class ncr_modulo_m_03 {
    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static void findModulo(int n, int r, int m) {
        int nfact = fact(n);
        int nrfact = fact(n - r);
        int rfact = fact(r);

        int res = nfact / (rfact * nrfact);

        int ans = res % m;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int n = 5;
        int c = 2;
        int m = 13;
        findModulo(n, c, m);
    }
}
