import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Triplets {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] input = new int[n];
        System.out.println("Enter " +n+ " values");
        //input = sc.nextInt();
        for (int i =0; i<n; i++)
        input[i] = sc.nextInt();
		int target = 0;
		Triplets r = new Triplets();
        System.out.println(r.Sum(input,target));       
    }
    public List<List<Integer>> Sum(int[] nums, int target) {
        List<List<Integer>> my_List = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length ;j++){
                for(int k = j; k<nums.length;k++){
                    if ( i != j && j != k && i != k && (nums[i] + nums[j] + nums[k] == target)){
                        List<Integer> inner_List = new ArrayList<Integer>(3);
                        inner_List.add(nums[i]);
                        inner_List.add(nums[j]);
                        inner_List.add(nums[k]);
                        my_List.add(inner_List);
                    }
                }
            }
        }
       return my_List;
    }
  }
