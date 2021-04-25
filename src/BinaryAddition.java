public class BinaryAddition {
    /*
    Return the addition of 2 binary strings
     */

    public static void main(String[] args){
          System.out.println(addBinary("1011", "1010"));
    }

    public static String addBinary(String a, String b) {

        if(a.length() == 0 && b.length() == 0) {
            return "";
        }else if(a.length() == 0 && b.length() > 0){
            return b;
        }else if (a.length() > 0 && b.length() == 0){
            return a;
        }


        StringBuilder result = new StringBuilder();

        int largeArraySize = Math.max(a.length(), b.length());

        int i = 0, remainder = 0, sum = 0;
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;

        while (i < largeArraySize){

            sum += (i <= aLength) ? Character.digit(a.charAt(aLength - i), 10) : 0;
            sum += (i <= bLength) ? Character.digit(b.charAt(bLength - i), 10) : 0;
            sum += remainder;

            if (sum <= 1) {
                result.append(sum);
                remainder = 0;
            } else if (sum == 2) {
                result.append(0);
                remainder = 1;
            } else if (sum == 3) {
                result.append(1);
                remainder = 1;
            }

            sum = 0; // reset
            i++;
        }

        if (remainder > 0) result.append(remainder);

        return result.reverse().toString();
    }
}
