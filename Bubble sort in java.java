/* Bubble short always compare adjust elements. for example it alwayscompare array[i] with array[i+1]

if array[i]<==array[i+1] then it does not do anything.

if array[i] > array[i+1] then it will swap

its stable algorithm

its a comparision based algorithm, its have a multiple passes
*/


// n = 4, i = 0
void buubleSort(arr , n)
{
    for(int i= 0; i < n-1; i++)// outer loop for n number of passes
    
        for(int j =0; j < n-i-1; j++) // here we taken j < n-2 becuase if use n-1 then the loop will go out of index
            if(arr[j]  > arr[j+1]);
            swap(arr, arr[j+1]);

}

/* time complexity of this algorithm 
(n-1) + (n-2) + .... + 2 +1

n*(n-1)/2

theta(n^2)

Optimization solution if the array is already sorted ->
*/

void buubleSort(arr, n)
{
    for(int i =0; i< n-1 ; i++){
        swapped = false;

        for(j =0 ; j < n-i-1 ; j++){

            if(arr[i] < arr[j+1])
            {
                swap(arr[j] , arr[j+1])
                swapped = true;
            }
        }
        if(swapped == false)
        break;
    }
}
















