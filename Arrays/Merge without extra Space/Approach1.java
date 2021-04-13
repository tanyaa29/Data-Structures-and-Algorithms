class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here
          for(int i=0;i<n;i++)
            {
                if(arr1[i]>arr2[0])
                {
                    long tmp= arr1[i];
                    arr1[i]=arr2[0];
                    arr2[0]= tmp;
                }
                long key= arr2[0];
                int j=1;
                for(j=1;(j<m && arr2[j]<key);j++)
                {
                    arr2[j-1]=arr2[j];
                    
                }
                arr2[j-1]= key;
                
            }
            
    }
}
