/*Selection sort is not a stable algorithm

you given an array you find the maximum number in this array, after find the maximum array you swap the array 
with the last element

it takes less memory rights compare to other algorithms
theta(n^2) algorithm  
it is basic idea for the HeapSort, HeapSort is used heap  data strusture is used to optimize the selction sort idea


Example : sorting number in the increasing order: find the minimum elment and put it into the
first position


i/P :  10, 5, 8, 20, 2, 18 

*/
//Naive solution:

void selectionSort(arr, n){
    int temp[n];

    for (i=0 ; i< n; i++)// this i decide the position of the index
    {
            int  min_ind = 0;
            for(int j =1; j < n-1; j++ )
              if(arr[j] < arr[min_ind])// compare if J'th value is minimum of the min_ind's value ? if yes then,
    
                 min_ind = j;  // update the j'th value as min_ind value
                 temp[i] = arr[min_ind];// now min_ind value is stored in the temp varaible 
                 arr[min_ind] = INF; // and then empty min_ind index set as a INF(infinite) value
                 
    }
    for(int i = 0; i < n; i++)// this loop will run for the sorted array{
        arr[i] = temp[i]; // now all the sorted element will store into the i
    }


}
// optimize solution

void selectionSort(arr , n)
{
    for(int i =0 ; i< n-1; i++)
    {
        min_ind = i;
        for(int j = i+1; j< n ; j++)
        if(arr[j] < arr[min_ind])
         min_ind = j;
         swap(arr[min_ind], arr[i])
    }
}
/* time complexity of this algorithm 
(n-1) + (n-2) + .... + 2 +1

n*(n-1)/2

theta(n^2)