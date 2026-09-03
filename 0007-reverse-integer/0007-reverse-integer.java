class Solution {
    public int reverse(int x) {
        long rev = 0;
        for( ; x!=0 ; x=x/10){
            int last_digit= x%10;
            rev = rev*10+last_digit;
        }
        if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
        
           }
    
}