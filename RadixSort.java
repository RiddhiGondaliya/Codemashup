/*RadixSort

*/
Void redixSort(int arr[], int n){
    int max =  arr[0];
    for(inyt i=0; i < n ; i++)
        if(arr[i] > max) // finding the maximum value from an given array
        max = arr[i]; 

        for(int exp =1; mzx/exp > 0; exp = exp*10)
        CountingSort(arr, n, exp);
}

void countingSort(int arr[], int n, int exp){
    int count[10], output[n];
    for(int i=0; i<10; i++){
        count[i]=0;  
    }
    for(int i=0; i<n; i++){
        count[(arr[i]/exp) % 10]++;
    }
    for(int i=0; i<10; i++){
        count[i]+count[i-1];
    }
    for(int i = n-1; i >=0; i--){
        output[count[(arr[i]/exp) % 10] - 1] = arr[i];
        count[(arr[i]/exp) % 10]--;
    }
    for(int i=0; i< n; i++){
        arr[i] = output[i];
    }
}
/* this exp reperenset the power of 10,we keep exp increment by exp^10, exp^20 when (max/exp)>0

