public class Keypad {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yx"};

    public static void SubS(int i, String a, String Comb){
        if(i==a.length()){
            System.out.println(Comb);
            return;
        }
        char currChar=a.charAt(i);
        String mapping=keypad[currChar-'0'];
        for(int j=0; j<mapping.length(); j++){
            SubS(i+1, a, Comb+mapping.charAt(j));
        }
    }
    public static void main(String args[]){
        String b="43";
        SubS(0, b, "");
    }
}
