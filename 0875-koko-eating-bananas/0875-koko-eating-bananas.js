/**
 * @param {number[]} piles
 * @param {number} h
 * @return {number}
 */
var minEatingSpeed = function(piles, h) {
    let low=1,high=0;
    for(let i=0;i<piles.length;i++)high+=piles[i];
    let ans=0;
    while(low<=high){
        let mid=Math.floor((low+high)/2);
        if(blackBox(piles,mid,h)===true){
            ans=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
    }
    return ans;
};

function blackBox(arr,mid,h){
    let cnt=0;
    for(let i=0;i<arr.length;i++){
       cnt=cnt+Math.ceil(arr[i]/mid);
        
    }
    return cnt<=h;
}