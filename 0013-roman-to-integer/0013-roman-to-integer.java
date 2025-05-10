class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch == 'I'){
                
                if(i+1<n && s.charAt(i+1)=='V') {sum+=4;i++;}
                else if(i+1<n && s.charAt(i+1)=='X') {sum+=9;i++;}
                else sum+=1;
            
            }
            else if(ch == 'V') {sum+=5;}
            else if(ch == 'X'){

                if(i+1<n && s.charAt(i+1)=='L') {sum+=40;i++;}
                else if(i+1<n && s.charAt(i+1)=='C') {sum+=90;i++;}
                else sum+=10;

            }
            else if(ch=='L') sum+=50;
            else if(ch=='C'){

                if(i+1<n && s.charAt(i+1)=='D') {sum+=400;i++;}
                else if(i+1<n && s.charAt(i+1)=='M') {sum+=900;i++;}
                else sum+=100;

            }
            else if(ch=='D') {sum+=500;}
            else sum+=1000;
        }

        return sum;
    }
}