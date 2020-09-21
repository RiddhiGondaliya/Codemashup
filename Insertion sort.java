/* inserstion algorithm is best among all the algorthms when your input size is small
 and small number of elements to be sorted


big O(n^2)worst case algorithm
big O(n) worst case algorithm
it mainatains stable 
hibrid algoritham Timsort(python)which is use merge the insertion sort together) and Introsort(which is mix of insertionsort, quipsort and heapsort)they use insertion is sort


I/P : [50, 20, 40, 60, 10, 30]
i=1 [20]

key = arr[i] = 20 [assign as a key]


 */

 void insSort(int arr[], int n){
     for(int i=1; i< n; i++)// i=1, which means we are starts with the second element(i = 1  to n-1) 
     int key = arr[i];
     int j = i-1;

     while(j>=0 $$ arr[j] > key)
     {
         arr[j+1] = arr[j]
         j--;
     }
     arr[j+1] = key;
 }