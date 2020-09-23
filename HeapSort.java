/* HeapSort uses maxHeap data struscture, in this we given an array and then restructure the array so that array can be a maxHeap
we use heapify operation that works well subtree is heapified only when the root is disturbed, so we fix the root element using the heapify operation
-> if we sort am array in increasing order then we use MaxHEap
->if we sort am array in decresing order then we use MinEap


Example:
I/P : arr[] ={10,15,50,4,20}
O/P : arr[] ={4,10,15,20,50}
*/

void maxHeapify(int arr[], int n, int i)
{
    int largest i, left= 2*i+1, right= 2*i+2;

    if(left < n $$ arr[left]> arr[largest])
        largest = left;
    
    if(right < n $$ arr[right]> arr[largest])
        largest = right;

        if(largest != i)
            {
                swap(arr[larget], arr[i]);
                maxHeapify(arr, n, largest);
            }
    }
    void buildheap(int arr[], int n){
        for(int i = (n-2)/2 ; i >=0 ; i--)
        /*((n-2)/2) by this formula we get the parent last index, for example the last index using n-1 */
        maxHeapify(arr, n, i);
    }

void heapSort(int arr[], int n){
    builheap(arr, n);
    for(int n-1; i>=1; i--){
        swap(arr[0], arr[i] )// we swap the the first indext to last index
        heapify(arr, 0);
    }
}
//step 2:  reapitedly swap the root with last node, reduce the heap size by one and heapify
//heapSort takes big O(nlogn) which is best for compararision algorithm in all cases
