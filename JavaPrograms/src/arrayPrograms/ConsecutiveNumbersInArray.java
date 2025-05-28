package arrayPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ConsecutiveNumbersInArray {

	public static void main(String[] args) {
        int[] arr = {1,0,3,4,6,1,8,9,7,12,14,15,16};
        //o/p= [[ 3,4],[8,9]]
        
        HashSet<Integer> set = new LinkedHashSet<Integer>();

        for(int i = 0; i<arr.length ; i++){
          if(i+1 == arr.length){
              break;
          }
            if(arr[i]+1==arr[i+1]){
             
                set.add(arr[i]);
                set.add(arr[i+1]);
            }
        }
        System.out.println(set);
	}
}
