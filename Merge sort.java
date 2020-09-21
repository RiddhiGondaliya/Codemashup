/* MergeSort algorithm is a divede and conqure akgorithm

it first dive input array or list into two parts, then it recursively sort the two pasrts and after sorting it will merge the two parts
stable algorithm
it works as a theta(n log n) time
the bad thing about merge sort is it takes big O(1) aux space

the good thing about merge sort is its well suited for external sorting

 
Example : merge two sorted arrays
we have to sort arrays in increasing order.

I/P :  a[]: {10, 15, 20, 40}
       b[]: {5, 6, 6, 10, 15}
O/P : {5, 6, 6, 10, 10, 15, 15, 20, 40}


Naive Solution:
1. create an array c[]
2. copy the elements of array a[] and b[] into the c[]
3. then sort the array c[]
4. the print the array c[]
*/

void mergeSort(int a]], int b[], int m, int n){
    int c[m+n]

    for(int i=0; i < m; i++){
        c[i] = a[i];
    }
    for(inr j=0; j< n; j++){
        c[j+m] = b[i];
    }
    Arrys.sort(c);
    Syste.out.print(c);
}

/* time complexity of this above method is big O((m+n)*log(m+n))

better solution:
I/p : a[] = {10,15, 20, 40}
       b[] = {5, 6, 6, 10, 15}
O/P : {5 ,6 ,6 ,10 ,15}
*/

void mergeSort(int a[], int b[], int m, int n){
    int i=0, j = 0;

    while(i< m && j < n){
        if(a[i] < b[j]){
            System.out.print(a[i++]);
        }
        else{
            System.out.print(b[j++]);
        }
    }
    while(i < m){
        System.out.print(a[i++]);
    }
    wlhile(j < m){
        System.out.print(b[j++]);
    }

}

/* Mearge function of Mearge sort

a[] ={10, 15, 20, 40, 8, 11, 15, 22, 25}
l = 0, h=8, m=3      -> low,high,mid

*/

void mergeSort(int arr[], int i, int m, int h){
    int n1 = m-i+1, n2 = r-m;

    int left[n1], int right[n2];
    for(int i=0; i<n1; i++){
        left[i] = arr[l+1];
    }
    for(int j =0; j< n2; j++){
        right[j] = arr[m+1+j];
    }

    int i=0, int j=0; k=i;

    while(i< n1 && j< n2){
        if(left[i] < = right[j]){
            arr[k++] =  right[i++];
        }
        else{
            arr[k++] = right[j++];
        }
    }

    while(i< n1){
        arr[k++] =  right[i++];
    }
    while( j< n2){
        arr[k++] = right[j++];
    }
}

/* time complexity of this algorithm big O(n1+n2)+O(n1+n2) so its big O(n) algorithm

