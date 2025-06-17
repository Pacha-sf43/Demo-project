public class AdvanceLevelQA {
   public static void repetetion(String inp, String outp){
    if(inp.length()==0){
        System.out.println(outp);
        return;
    }
    for(int i=0;i<inp.length();i++){
        char currChar = inp.charAt(i);
        String curr=inp.substring(0,i)+inp.substring(i+1);
        repetetion(curr, outp+currChar);
    }
   }
   public static void main(String args[]){
    String inp="abcd";
    repetetion(inp, "");
   }
}
