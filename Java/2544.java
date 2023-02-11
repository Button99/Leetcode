class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        String str= String.valueOf(n);
        char[] c= str.toCharArray();
        for(int i=0; i<c.length; i++) {
            if(i%2 == 0) {
                sum+= Character.getNumericValue(c[i]);
            } else {
                sum-=Character.getNumericValue(c[i]);
            }
        }
        return sum;
    }
}