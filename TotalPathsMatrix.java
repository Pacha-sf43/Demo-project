// public class TotalPathsMatrix {
//     public static int reps(int r, int c, int a, int b){
//         if(a==r || b==c){
//             return 0;
//         }
//         if(a==r-1 && b==c-1){
//             return 1;
//         }
//         // Downward movement
//         int downpaths=reps(r, c, a+1, b);

//         // Right movement
//         int rightwards=reps(r, c, a, b+1);

//         return downpaths+rightwards;
//     }
//     public static void main(String args[]){
//         int totalpath=reps(3, 4, 0, 0);
//         System.out.println(totalpath);
//     }
// }

// 2- Ways to arrange 1*M block in N*M spaces size

// public class TotalPathsMatrix{
//     public static int recFun(int a, int b){
//         if(a==b){
//             return 2;
//         }
//         if(a<b){
//             return 1;
//         }
//         // if first block placed veertically
//         int vert=recFun(a-b, b);

//         // if first block placed horizontally
//         int hor=recFun(a-1, b);

//         return vert+hor;
//     }
//     public static void main(String args[]){
//         System.out.println(recFun(6, 4));
//     }
// }


// 3- Tell combinations of invite n friends either in pair or single
public class TotalPathsMatrix{
    public static int Combs(int n){
        if(n<=1){
            return 1;
        }
        // pairs
        int pair=(n-1)*Combs (n-2);
        // Single
        int single=Combs(n-1);

        return pair+single;

    }
    public static void main(String args[]){
        System.out.println(Combs(4));
    }
}
