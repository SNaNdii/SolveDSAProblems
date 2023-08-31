import java.util.HashMap;

class TwoSum{
    public static void main(String[] args) {
        int[] arr = {1,5,2,8};
        int n = arr.length;
        int t = 13;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
                if(map.containsKey(t-arr[i])){
                    System.out.println(arr[i]+" "+ (t-arr[i]));
                    return;
                }
            map.put(arr[i], i);
        }
        System.out.println("No such values...");
        
    }
}