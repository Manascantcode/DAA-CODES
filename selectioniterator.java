class selectioniterator{
    public static void selectiondesc(int arr[]){
        int n =arr.length;
        int passCount =0;

        for (int i = 0; i < n-1; i++) {
            int maxIndex=i;
            passCount++;

            for (int j = i+1; j < n; j++) {
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[i];
            arr[i]=temp;
        }
        System.out.println("\nTotal passes:"+passCount);
    }
    public static void main(String[] args) {
        int arr[]={64,68,34,53,77,49,35};
        System.out.print("original:");
        for(int x:arr){
            System.out.print(x+" ");
        }
        selectiondesc(arr);
        System.out.print("sorted:");
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
}