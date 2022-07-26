public class Main {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("%d Số nguyên tố đầu tiên là: \n");
        int count = 0;
        int i = 2;
        while (count < n) {
            if (soNguyenTo(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }

    public static boolean soNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
