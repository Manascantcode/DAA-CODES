// public class linear {
//     public static int ls(int arr[],int key){
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]==key){
//                 return i;
//             }
//         }
//         return -1;

//     }
//     public static void main(String[] args) {
//         int arr[]= {10,25,30,45,50};
//         int key =30;
//         int result =ls(arr,key);
//         if (result ==-1)
//             System.out.println("element not foung");
//         else
//             System.out.println("element found at index:"+result);
//     }

// }
public class linear{
    public static int ls(int arr[],int key){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,56,8,41,58,85};
        int key = 85;
        int result= ls(arr,key);
        if(result==-1)
            System.out.println("element not found");
        else
            System.out.println("found at "+result);
    }
}