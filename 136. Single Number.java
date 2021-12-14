class Solution {
    public int singleNumber(int[] nums) {
        Stack<Integer> st=new Stack<>();
        Arrays.sort(nums);
        st.push(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(!st.isEmpty()){
                if(st.peek()==nums[i])
                     st.pop();
            }
            else
                st.push(nums[i]);
            
        }
        return st.peek();
        
    }
}
