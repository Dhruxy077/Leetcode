class Solution {
    public String intToRoman(int nums) {
       int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
       String[] romans={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
       StringBuilder result=new StringBuilder();
       for(int i=0;i<values.length;i++){
        while(nums>=values[i]){
            result.append(romans[i]);
            nums-=values[i];
        }
       }
       return result.toString();
    }
}