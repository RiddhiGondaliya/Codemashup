/*
I/P : "ABCABCDABCD"
Patn: "ABCD"
O/P : 3 7

I/P : "GEEKSFORGEEKS"
Patn : "EKS"
O/P  :  2, 10
*/

/*Logic : if you see some mismatch charcters after mathiching some charcters then you can simiply forward the patern by j, for example in the first input string the "ABC" from index 0 to 2 is matched with the patern ABCD from index 0 to 2 but when it comes forward 
then the index 3 "A" from the input string is not matched with the pattern of the index 3 "D" so here the logic we used that we simply slide the matched whole pattern over the index 4 of the input string by J */


// peasudo code

void patSerachDist(string tct, string patn)
{

    int n = txt.length();
    int m = patn.length();

    for(int i = 0; i< n-m)
    {
        int j;
        for(j =0; j<m ; j++)
            if(patn[j] != txt[i+j])
            break;
        if(j == m)
            print(i +"");
        if(j == 0)
            i++;
        else
        i = (i+j);

        }

}

//Time complexity of this linear time algorithem is theta(n) times to find out the occurnces of the pattern in this text.
