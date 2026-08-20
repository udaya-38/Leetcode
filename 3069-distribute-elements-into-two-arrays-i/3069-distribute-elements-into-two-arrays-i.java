class Node {
    int val;
    Node next;
    Node(int x) { val = x; }
}

class Solution {
    public int[] resultArray(int[] nums) {
        Node head1 = new Node(nums[0]);
        Node head2 = new Node(nums[1]);
        Node arr1 = head1;
        Node arr2 = head2;

        for (int i = 2; i < nums.length; i++) {
            if (arr1.val > arr2.val) {
                arr1.next = new Node(nums[i]);
                arr1 = arr1.next;
            } else {
                arr2.next = new Node(nums[i]);
                arr2 = arr2.next;
            }
        }

        arr1.next = head2;

        int[] ans = new int[nums.length];
        int index = 0;

        while (head1 != null) {
            ans[index] = head1.val;
            head1 = head1.next;
            index++;
        }

        return ans;
    }
}