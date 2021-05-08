import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RecursionSamples {

    public static void main(String[] args){

        //Reverse String
    //   System.out.println(reverseString(new char[]{'h', 'e', 'l', 'l', 'o'}));

       //Swap
//        ListNode head = new ListNode(1);
//        head.next =  new ListNode(2);
//        head.next.next =  new ListNode(3);
//        head.next.next.next =  new ListNode(4);
//
//        System.out.println(swapPairs(head).val);

        //Pascals Triangle with recursion
      //  System.out.println(generatePascalsTriangle(0));

        //Double Size
       // System.out.println(doubleSize(new ArrayList<Long>(){2, 1, 3, 8, 6, 11, 16}, 2));

        //Reverse LinkedList
        ListNode head2 = new ListNode(1);
        head2.next =  new ListNode(2);
        head2.next.next =  new ListNode(3);
        head2.next.next.next =  new ListNode(4);
        head2.next.next.next.next =  new ListNode(2);
        System.out.println(reverseList(head2).val);
    }

    /*
    Reverse a string in a char array using recursion
    No new array used - reverse in place
     */
    public static char[] reverseString(char[] s) {
        reverse(0, s.length - 1, s);
        return s;
    }

    private static void reverse(int index, int swapIndex, char[] s){
        if(index >= swapIndex){
            return;
        }
        char temp = s[index];
        s[index] = s[swapIndex];
        s[swapIndex] = temp;

        reverse(index +1, swapIndex - 1, s);
    }


    /*
    swap members of a linked list in pairs
    1->2->3->4 = 2->1->4->3
     */

    public static ListNode swapPairs(ListNode head) {

        if(head == null) return head;

        if(head.next == null) return head;

        swap(head, head.next);

        return head;
    }

    private static void swap(ListNode head, ListNode nodeToSwap){

        if(nodeToSwap == null) return;

        int tempVal = head.val;
        head.val = nodeToSwap.val;
        nodeToSwap.val = tempVal;

        if(nodeToSwap.next == null) return;

        swap(nodeToSwap.next, nodeToSwap.next.next);
    }

    private void swap2(ListNode head){

        if(head == null || head.next==null) return;

        int tempVal = head.val;
        head.val = head.next.val;
        head.next.val = tempVal;

        if(head.next == null) return;

        swap2(head.next.next);
    }



    /*
    Pascals Triangle with Recursion
    Given a level 4 ; the triangle is as follows
            1
          1   1
        1   2   1
      1   3   3   1
     */
    public static List<List<Integer>> generatePascalsTriangle(int level){

        if(level == 0) return new ArrayList<>(new ArrayList<>());

        List<List<Integer>> result = new ArrayList<>(new ArrayList<>());
        generate(result, level);
        return result;
    }

    private static void generate(List<List<Integer>> result, int level){

        if(level == 1){
            List<Integer> levelZero = new ArrayList<>();
            levelZero.add(1);
            result.add(levelZero);
            return;
        }

        generate(result, level-1);

        List<Integer> inner = new ArrayList<>();

        inner.add(1); //left boundary
        for(int i=1; i < level - 1; i++){ //middle
            inner.add(result.get(level-2).get(i-1) + result.get(level-2).get(i));
        }
        inner.add(1); //right boundary
        result.add(inner);

    }


    /*
     * Complete the 'doubleSize' function below.
     * double the given number if the number is equal to the element in the array
     * it is beneficial to order the array in order to get the maximum double
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER_ARRAY arr
     *  2. LONG_INTEGER b
     */
    public static long doubleSize(List<Long> arr, long b) {
        // Write your code here
        if(arr == null) return 0;
        Collections.sort(arr);

        for(int index = 0; index < arr.size(); index++){

            if(arr.get(index) == b) b *=2;
        }
        return b;
    }


    /*
     * Complete the 'fibonacci' function below.
     * generate the fibonacci sequence
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER n as parameter.
     */

    public static List<Integer> fibonacci(int n) {
        // Write your code here

        List<Integer> result = new ArrayList<>();

        if (n==0) return result;

        result.add(0);

        if(n == 1) return result;

        result.add(1);

        generateFibonacci(result, 2, n);

        return result;
    }

    private static void generateFibonacci(List<Integer> result, int index, int number){

        if(index >= number){
            return;
        }

        result.add(result.get(index-2) + result.get(index - 1));
        generateFibonacci(result,index+1, number);


    }


    /*
    Reverse a linkedlist with recursion
     */
    public static ListNode reverseList(ListNode head) {

        if(head == null) return null;
        head = reverseLinkedList(head);
        return head;
    }

    private static ListNode reverseLinkedList(ListNode current){
        if(current.next == null) return current;


        ListNode swapNode = reverseLinkedList(current.next);
        current.next.next = current;
        current.next = null;


        return swapNode;
    }

    //reverse Linklist with loop
  //  public static ListNode reverseListWithLoop(ListNode head){}
}
