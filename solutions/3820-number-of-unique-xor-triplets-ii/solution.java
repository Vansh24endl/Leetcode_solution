class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int[] U = Arrays.stream(nums).distinct().toArray();
        int n = U.length;
        boolean[] hasPair = new boolean[2048];
        boolean[] tripletXor = new boolean[2048];

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j<n; j++){
                hasPair[U[i] ^ U[j]] = true;
            }
        }

        for(int p = 0; p < 2048; p++){
            if(hasPair[p]){
                for(int c : U){
                    tripletXor[p ^ c] = true;
                }
            }
        }

        for(int x : U){
            tripletXor[x] = true;
        }

        int ans = 0;
        for(boolean present : tripletXor){
            if(present){
                ans++;
            }
        }
        return ans;
    }
}
