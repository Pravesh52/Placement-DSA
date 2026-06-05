// package Amazon.StringBuilder;

public class string {
    public static char kthcharacterfind(String s,int k){
           StringBuilder descrypt=new StringBuilder();
           int i=0;

           while(i<s.length()){
               StringBuilder sub=new StringBuilder();
               while(i<s.length() && Character.isLetter(s.charAt(i))){
                        sub.append(s.charAt(i));
                        i++;
               }

               int freq=0;

               while(i<s.length() && Character.isDigit(s.charAt(i))){
                      freq=freq*10+(s.charAt(i)-'0');
                      i++;
               }

               for(int j=0;j<freq;j++){
                     descrypt.append(sub);
               }
           }
           return descrypt.charAt(k-1);

    }
    public static void main(String[] args) {
        String s="a1b2cd4";
        int k=8;



       char ans= kthcharacterfind(s, k);

        System.out.println(ans);
        
    }
}
