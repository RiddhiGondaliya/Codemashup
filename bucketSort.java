/* 

I/P= {30,40,10,80,5,12,70}
k = 4

*/
void bucketSort(int arr[], int n)
{
    int n = arr.length;
    int Max_val = arr[0];
    for(int i =0 ;i < n; i++)
    Max_val= Math.max(Max_val, arr[i]);
    Max_val++;

    ArrayList<ArrayList<Integer>>bkt = new ArrayList<ArrayList<Integer>>();

    for(int i =0 ; i< k; ++)
    bkt.add(new ArrayList<Integer>()); // for creating 4 buckets in their sizes


    for(int i =0 ;i< n ; i++)
    {
        int bi = (k*arr[i]/Max_val);  // this code will run for which array element go for which bucket according thier range
        bkt.get(bi).add(arr[i]); // now range of elemet will go in their backet in the format of array element
    }
    /* for example: we always increase the Max_value by 1 so,
    Max_val = 81 
     i = 0 : bi = 4 * 30 / 81  = 1
     i = 1 : bi = 4 * 40 / 81  = 1
     i = 2 : bi = 4 * 10 / 81  = 0
     i = 3 : bi = 4 * 80  / 81 = 3
     i = 4  : bi = 4 * 5 / 81  = 0
     i = 5  : bi = 4 * 12 / 81  = 0
     i = 6  : bi = 4 * 70 / 81  = 3

     now once we add individual elements into the backets them we sort an elments into the backet
    */

    for(int i =0 ; i< k ;i ++)
    Collections.sort(bkt.get(i)); // for sorting an elements into the bucket

    // now we perform simple concatation of an sorted buckets
    int index =0;
    for(int i =0 ; i< k ;i++) // travarse to the all buckets
        for(int j =0; j< bkt.get(i).size(); j++) // the loop travarse individual buckets
         arr[index++] = bkt.get(i).get(j); 

}
/* time complexity

Assumimg  k ~~ n
best case : data is uniformly distributed   O(n)

worst case:    all time go into the singal bucket, but if you use n log n algorithm to sort and individual buckets then your worst case can also become n log n algorithm


so bucket sort is the best suitable algoritham when your data is uniformly distributed accross the range