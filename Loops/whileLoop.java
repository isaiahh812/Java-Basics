public class whileLoop {

    public static void main(String[] args) {
        String s = "408408";
        int seq[] = { 2, 3, 7, 11, 17 };
        int i = 0;
        Boolean check = true;
        while (check && i < seq.length) {
            System.out.println(seq[i]);
            check = calc(s, seq[i]);
            i++;
        }
        if (check) {
            System.out.print("Valid message");
        } else {
            System.out.print("Invalid message");
        }
    }

    public static Boolean calc(String s, int num) {
        int pos = 1;
        int sum = Integer.parseInt(s.substring(0, 1));
        while (pos + 1 <= s.length()) {
            sum = (sum % num) * 10 + Integer.parseInt(s.substring(pos, pos + 1));
            pos++;
        }
        System.out.println("Sum: " + sum);
        if (sum % num == 0) {
            return true;
        } else {
            return false;
        }
    }
}
