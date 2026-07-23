class Solution {
    public int reverse(int x) {
        int reve=0;
        while(x!=0){
            int digit=x%10;
            x=x/10;
            if(reve>Integer.MAX_VALUE/10||reve<Integer.MIN_VALUE/10){
                return 0;
            }
            reve=reve*10+digit;
        }
        return reve;
    }
}