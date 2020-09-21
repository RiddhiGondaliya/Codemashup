/* Partition of an Array

I/P : arr[] ={3,8,6,12,10,7}
p = 5  -> partition

O/P : arr[] ={3, 6,7, 8, 10, 12}


Example 1: arr[] = {5, 13, 6, 9, 12, 11, 8}
p = 6, l= 0, h=6


*/
// Naive solution
Void partition(int arr[], int l, int h, int p){
    int temp[ h-l+1]//   in temp vairable the size of an arry will be (6-0+1)= 7
    int index = 0;

for(int i =l ; i<= h; i++)
    if(arr[i]<=arr[p]){
        temp[index] = arr[i], index++;
    }
for(int i =l ; i<=h ;i++)
    if(arr[i]>= arr[p]){
        temp[index] = arr[i] , index++;
    }
for(int i =l ; i< = h; i++)
    arri[i] = temp[i-l]

}

/* Auxilory space require the big O(n) , time compexity O(n) for this lagorithm


---->  Lomouto Partition
in standerd lomouto partition the pivot is always in the last element

for example:

arr[] ={10,80,90,40,50,70}
l=0, h= 6, pivot = 70;

*/

void lpartition(int arr[], int l, int h)
{
    int pivot = arr[h];// we taking pivot values as a highest element or last element
    int i = l-1; //  index will start from lower -1

    for(int j = l; j<= h-1; j++){
        if(arr[j] < pivot)
            {
                i++;
                swap(arr[i], arr[j]);
            }
    }
    swap(arr[i+1], arr[h]);
    return(i+1);    
}

/* what if the pivot element is in the middle of the array, then simply
move the

arr[] ={10,80,90,70,50,40}
pivot = 70,
l = l-1
h = 6

then simply swap the pivot elemt with the higer index
swap(arr[p], arr[h])

now the array will be, arr[] ={10,80,90,40,50,70}

time complexity : big O(n), it requires big O(1) extra space , also it does only one travarsal, so it better then navive solution

----> Quick Sort

-> divide and conqure algorithm
-> the key part is partitioning(Hoaurs, Lonmuto, naive(stable))
-> worst case time complexity big O(n^2)
-> Dispite having higer worst case time it is prefered over other algoithm due to
following reasons
 - tail recusive
 - In-place
 - catch friendly
 - Average case (theta (n log n)) that's the reason better then others algorithms

-> quick sort is used lot librery functions
Qsort -> c
Introsort -> c++
quick sort and mearge sort -> java

Example : quick sort using lomuto algorithm

arr[] = {8,4,7,9,3,10,5}*/

void qSort(int arr, int l, int h)
{
    if(l < h)
    {
        int p = partition(arr, l, h)
        qSort(arr, l , p-1) //  check the lomuto algorithm
        qSort(arr,  p-1, h) //  check the lomuto algorithm
    }
}

// Example : quick sort using Hoare's algorithm, it is three time fater then lomuto algorithm
// it takes the fisrt element of an array
void qSort(int arr, int l, int h)
{
    if(l < h)
    {
        int p = partition(arr, l, h)
        qSort(arr, l , p) //  check the Hoare's algorithm
        qSort(arr,  p-1, h) //  check the Hoare's algorithm

    }
}
// expected time compelxity of an quicksort algorithm is big O(n log n)




















































































