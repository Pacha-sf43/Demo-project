public class removeDuplicatesInString {
    public static void Remove(int i, String b, String c){
        if(i==b.length()){
            System.out.println("The string wih no dublicates is: "+c);
            return;
        }
        if(c.indexOf(b.charAt(i))==-1){
            Remove(i+1, b, c+b.charAt(i));
        }else{
            Remove(i+1, b, c);
        }
    }

    public static void main(String args[]){
        String a="dbbasrfb";
        Remove(0, a, "");
    }
}
