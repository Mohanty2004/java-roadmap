import java.util.*;;

public class Pattens {

    /*
     * RULES for solving pattern problems:
     * 
     * 1.outer loop for prints the no. of lines or rows
     * 2.Identify for every row no./line no ,how many columns are there || type of
     * element in col
     * 3.what do we need to print
     */
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    //qn-1:rectangle 
    // for(int i=0;i<n;i++){
    //     for (int j = 0; j < n; j++) {
    //         System.out.print("*");
            
    //     }
    //     System.out.println();
    // }

    //right angle triangle
    // for (int i = 0; i < n; i++) {
    //     for(int j=0;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //inverted right angle triangle
    // for(int i=0;i<n;i++){
    //     for (int j=0; j <n-i+1;j++){
    //       System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //print    1
            // 12
            // 123
            // 1234
            // 12345

    // for(int i=0;i<n;i++){
    //     for (int j=0;j<=i;j++){
    //         System.out.print(j+1);
    //     }
    //     System.out.println();
    // }

//print this
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

    // for(int i=0;i<2*n;i++){
    //     int col=i>n?2*n-i:i;
    //     for(int j=0;j<col;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


//print this
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *

    // for(int i=0;i<2*n;i++){
    //     int col=i>n?2*n-i:i;
    //     int space=n-col;
    //     for(int s=0;s<space;s++){
    //         System.out.print(" ");
    //     }
    //     for(int j=0;j<col;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
//print this
//      1
//     212
//    32123
//   4321234
//  543212345
    
    // for(int i=1;i<=n;i++){
    //     for(int space=0;space<n-i;space++){
    //         System.out.print("  ");
    //     }
    //     for(int j=i;j>=1;j--){
    //         System.out.print(j+" ");
    //     }
    //     for(int j=2;j<=i;j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }

    //
}

}
