class selection {
    public static void sel(int arr[]){
        int n =arr.length;
        for (int i = 0; i <n-1; i++){
            int min=i;
            for (int j = i+1; j < n; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
      
        }
    }
    public static void main(String[] args) {
        int arr[]={20,5,6,4,8,5,9,5};
        sel(arr);
        System.out.println("Sorted Array:");
        for(int x: arr)
            System.out.print(x+ " ");
    }
}