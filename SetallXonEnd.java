public class SetallXonEnd{
    public static void setX(int i, String a, String b, int m){
        if(i==a.length()){
            for(int k=0; k<m; k++){
                b+='x';
            }
            System.out.println("the rearranged word is: "+b);
            return;
        }
        if(a.charAt(i)=='x'){
            setX(i+1, a, b, m+1);
        }
        else{
            setX(i+1, a, b+a.charAt(i), m);
        }
        
    }
    public static void main(String args[]){
        String a="aacnxxijnxxwfgx";
        setX(0, a, "", 0);
    }
}
