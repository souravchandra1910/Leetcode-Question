class Solution {

    public List<Integer> majorityElement(int[] arr) {
        List<Integer> al = new ArrayList<>();
        int el1 = 0, el2 = 0, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cnt1 == 0 && arr[i]!=el2) {
                cnt1 = 1;
                el1 = arr[i];
            } else if (cnt2 == 0  && arr[i]!=el1) {
                cnt2 = 1;
                el2 = arr[i];
            } else if (el1 == arr[i]) cnt1++; else if (el2 == arr[i]) cnt2++; else {
                cnt1--;
                cnt2--;
            }
        }
        // System.out.println(el1+"  "+el2);
        cnt1 = cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (el1 == arr[i]) cnt1++; else if (el2 == arr[i]) cnt2++;
        }
        if (cnt1 > arr.length / 3) al.add(el1);
        if (cnt2 > arr.length / 3) al.add(el2);
        return al;
    }
}
