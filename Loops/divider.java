public class divider {
    public static void main(String[] ars) {
        String s = "408408";
        Boolean check = true;
        if (check == true) {
            int num = Integer.parseInt(s.substring(s.length() - 1, s.length()));
            if (num % 2 == 0) {
                check = true;
            } else {
                check = false;
            }
        }
        if (check == true) {
            int i = 0;
            int sum = 0;
            while ((i + 1) <= s.length()) {
                sum = sum + Integer.parseInt(s.substring(i, i + 1));
                i++;
            }
            if (sum % 3 == 0) {
                check = true;
            } else {
                check = false;
            }
        }
        if (check == true) {
            int result = Integer.parseInt(s.substring(0, 1));
            int pos = 1;
            while ((pos + 1) <= s.length()) {
                // (4 % 7) * 10 + nextIndex
                result = (result % 7) * 10 + Integer.parseInt(s.substring(pos, pos + 1));
                pos++;
            }
            if (result % 7 == 0) {
                check = true;
            } else {
                check = false;
            }
        }
        if (check == true) {
            int result = Integer.parseInt(s.substring(0, 1));
            int pos = 1;
            while ((pos + 1) <= s.length()) {
                // (4 % 7) * 10 + nextIndex
                result = (result % 11) * 10 + Integer.parseInt(s.substring(pos, pos + 1));
                pos++;
            }
            if (result % 11 == 0) {
                check = true;
            } else {
                check = false;
            }
        }
        if (check == true) {
            int result = Integer.parseInt(s.substring(0, 1));
            int pos = 1;
            while ((pos + 1) <= s.length()) {
                // (4 % 7) * 10 + nextIndex
                result = (result % 17) * 10 + Integer.parseInt(s.substring(pos, pos + 1));
                pos++;
            }
            if (result % 17 == 0) {
                check = true;
            } else {
                check = false;
            }
        }
        if (check == true) {
            System.out.println("valid");
        } else {
            System.out.println("not valid");
        }
    }
}
