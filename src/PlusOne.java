import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// this is leetcode exercise 66
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0;  i--){
            if(digits[i] < 9){
                digits[i] += 1;
                return digits;
            }else{
                digits[i] = 0;
            }

        }

        int[] new_nums = new int[digits.length + 1];
        new_nums[0] = 1;
        return new_nums;


    }
    public static boolean isAllNines(int[]digits){
        for(int i = 0 ; i < digits.length; i++){
            if(digits[i] != 9) {
                return false;
            }
            return true;
        }
        return false;
    }


    //convert array to a queue
    // 999 -> 1000
    //4321 -> 4322
    //4999



    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Simon", 292);
        myMap.put("Silas", 392);
        myMap.put("Emily", 382);
        myMap.put("Reggie", 321);

        for(String key : myMap.keySet()){
            System.out.println(myMap.get(key));
        }


    }

}
