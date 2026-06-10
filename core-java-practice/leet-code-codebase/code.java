class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
        int[] arr = new int[str.length()];

        for(int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==6){
                arr[i]=9;
                break;
            }   
        }
        int numa = 0;

        for(int digit : arr) {
        numa = numa * 10 + digit;
    }
    return numa;
    }
}