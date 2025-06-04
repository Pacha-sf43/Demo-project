public class FirstLastOccurance {
    public static void firstOccurance(String name, int i){
        if(i==0){
            System.out.print("The first letter of name is: "+ name.charAt(i));
            return;
        }
        if(i==name.length()-1){
            System.out.println("The last letter of name is: "+ name.charAt(i));
            // return;
        }
        if(i>0){
            firstOccurance(name,i-1);
        }
    }
    public static void main(String args[]){
        String name="Motisi";
        firstOccurance(name,name.length()-1);
    }
    
}
