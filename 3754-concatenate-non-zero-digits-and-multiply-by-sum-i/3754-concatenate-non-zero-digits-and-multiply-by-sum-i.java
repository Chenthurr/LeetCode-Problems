class Solution {
    public long sumAndMultiply(int n) {

        String s = String.valueOf(n);

        long newNumber = 0;
        int sum = 0;

        for(char ch : s.toCharArray()){

            if(ch != '0'){

                int digit = ch - '0';

                newNumber = newNumber * 10 + digit;

                sum += digit;
            }
        }

        return newNumber * sum;
    }
}