class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        HashSet <Integer> result = new HashSet<>();

        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }
        
        int answer [] = new int [result.size()];
        int count = 0;

        for (int num : result) {
            answer [count++] = num;
        }

        return answer;
    }
}