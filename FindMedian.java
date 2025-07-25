import java.util.Scanner;

public class FindMedian {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int arr1Size=sc.nextInt();
        int arr2Size=sc.nextInt();
        int arr1[]=new int[arr1Size];
        int arr2[]=new int[arr2Size];
        double merge[]=new double[arr1Size+arr2Size];
        for(int i=0;i<arr1Size;i++){
           arr1[i]=sc.nextInt();
        
        }
        for(int i=0;i<arr2Size;i++){
        
           arr2[i]=sc.nextInt();
        }

        for(int i=0;i<arr1Size;i++){
            merge[i]=arr1[i];
        }
    
      for(int i=0;i<arr2Size;i++){
            merge[arr1Size+i]=arr2[i];
        }
        // for(double ele:merge){
        //     System.out.println(ele+" ");
        // }
        double temp;
        for(int i=0;i<merge.length-1;i++){
            for(int j=0;j<merge.length-1-i;j++){
                if(merge[j]>merge[j+1]){
                temp=merge[j];
                merge[j]=merge[j+1];
                merge[j+1]=temp;
                }
            }
        }
        for(int i=0;i<merge.length;i++){
            System.out.print(merge[i]+" ");
        }

        int len=merge.length;
        int mid=len/2;
        if(len%2==0){
            
           System.out.println();
           System.out.print("\n"+"Median: "+(merge[mid-1]+merge[mid])/2.0);
        }
        else{
            System.out.println();
            System.out.println("Median: "+merge[mid]);
        
      }sc.close();
    }
    
}
