/* countingSort is a linear time algorithm, when our input size in a small range.
for example when the input is n and the range is k-1 then countingSort takes big O(n+k) time

its counter based algorithm
count the occurancy of an elements

I/P : arr[] ={1,4,4,,1,0,1}
O/P : arrp[] = {1,3,0,0,2}
}
*/
 void countSort(arr, n, k)
 {
     int count[k];
     for(int i =0; i < k; i++)
     count[i] = 0;
     for(int i =0; i< n; i++)
        count[arr[i]]++;
        int index = 0;

        for(int i =0; i< k; i++)
        {
            for(int j =0 ; j< count[i]; j++)
            arr[index]= i;
            index++;
        }

 }

 /*Genral problem solution

 k(range) = 5, n = 6
 arr[] ={1,4,4,1,0,1}
 count[] ={1,3,0,0,2}

 void countSort(arr, k, n){
        for(int i=0; i < k; i++)
        count[i] = 0;
        for(int i=0; i < n; i++)
        countarr[i]++;

        for(int i=0; i< k; i++)
        count[i] = count[i-1]+count[i];


        int output[n];
        for(int i = n-1 ; i >=0; i++)
        count[i] = count[i-1]+count[i];
        count[arr[i]]--;

        for(int i=0; i<n ; i++)
        arr[i] = output[i];
 }
 Important points:

 not a comparision based algorithm

 theta(n+k) Time
 theta(n+k) Aux space
 stable
 used as a subroutine in a radix sort