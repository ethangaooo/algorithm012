class Solution {
    public int climbStairs(int n) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addLast(1);
        deque.addLast(1);

        if ( n < 3) return n;
        int sum = 0;
        for (int i =2;i<=n;i++){
            sum = deque.pollFirst()+deque.peekLast();
            deque.addLast(sum);

        }
        return deque.peekLast();

    }
}