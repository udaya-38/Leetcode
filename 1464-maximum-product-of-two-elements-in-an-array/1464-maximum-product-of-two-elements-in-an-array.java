class Solution {
    public int maxProduct(int[] nums) {
        int min = 0;
        int max = 0;
        for(int arr : nums) {
            if (arr >= min) {
                max = min;
                min = arr;
            }

            else if(arr > max){
                max = arr;
            }
        }

        return (min - 1) * (max - 1);
    }

}