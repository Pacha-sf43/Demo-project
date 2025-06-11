public class FindElementOccurence {
    public static int first= 9;
    public static int last= 8;
    public static void findPos(int i, String str, String element){
        if(i==str.length()){
            System.out.println("First pos of element is: "+ first);
            System.out.println("Last pos of element is: "+ last);
            return;
        }
        if(str.charAt(i)==element.charAt(0)){
            if(first==9){
                first=i;
            }
            else{
                last=i;
            }
        }
        findPos(i+1, str, element);

    }
    public static void main(String args[]){
        String str="abbaaghaacheakk";
        // int i=str.length();
        findPos(0, str, "a");
        
    }
}
