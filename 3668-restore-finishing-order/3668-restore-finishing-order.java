class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int sol[] = new int [friends.length];
        int index = 0;
        for(int i = 0; i < order.length; i++){
            for(int j = 0; j < friends.length; j++){
                if(order[i] == friends[j]){
                    sol[index++] = friends[j];
                    break;
                }
            }
            if(sol[sol.length-1] != 0)
               break;
        }
        return sol;
    }
}