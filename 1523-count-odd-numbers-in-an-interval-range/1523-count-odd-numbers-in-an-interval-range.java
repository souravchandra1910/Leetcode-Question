class Solution {

    public int countOdds(int low, int high) {
        int cnt = 0;
        if (low % 2 == 1) cnt++;
        if (high % 2 == 1) cnt++;
        if(cnt==2){
            cnt--;
        }
        cnt+=((high-low)/2);
        return cnt;
    }
}
// 3 9 ->3 5 7 9
//3 10->