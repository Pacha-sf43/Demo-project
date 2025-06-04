public class ReverseName {
    public static void reverseName(String name, int i){
        if(i==0){
            System.out.print(" "+ name.charAt(i));
            return;
        }
        System.out.print(" "+ name.charAt(i));
        reverseName(name,i-1);
    }
    public static void main(String args[]){
        String name="Moti";
        reverseName(name,name.length()-1);
    }
    
}
