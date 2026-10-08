class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        int sum=0;
        for(int num : map.keySet()){
           
            if(map.get(num) %k==0){
                sum+= map.get(num)*num;
            }
        }
        return sum;
    }
}