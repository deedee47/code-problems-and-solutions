public class Staircase {
    /*
    print a stair of # based on a given number. the base and height of the stairs is the same
    add space as padding to create the stairs effect
     */

    public static void main(String[] args){
        staircase(6);
    }

    public static void staircase(int n) {
        // Write your code here
        for(int i = 1; i <= n; i++){
            String hashes = "";
            for(int j = i; j> 0; j--){
                hashes+="#";
            }
            System.out.println(String.format("%" + n + "s", hashes));
        }
    }
}
