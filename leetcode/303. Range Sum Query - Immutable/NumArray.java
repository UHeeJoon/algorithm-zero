class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        return IntStream.rangeClosed(left, right)
                .map(val -> nums[val])
                .sum();
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

/**
 * Best
 
  class NumArray{
    int[] p;
    public NumArray(int[] nums){
        int n=nums.length;
        p=new int[n+1];
        for(int i=0;i<n;i++)p[i+1]=p[i]+nums[i];
    }
    public int sumRange(int l,int r){
        return p[r+1]-p[l];
    }
  }
 */
