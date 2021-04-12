public class FindMissingAndRepeating
{
public int[] repeatedNumber(final int[] A) 
    {
       int B[]= new int[2];
       int xor=0;
       int l=A.length;
       for(int i=1;i<=l;i++)
       {
           xor=xor^i;
       }
       for(int i=0;i<l;i++)
       {
           xor= xor^A[i];
       }
       int setbit= xor & ~(xor-1);
       int x=0,y=0;
       for(int i=0;i<A.length;i++)
       {
           if((A[i] & setbit )!=0)
           x= x^A[i];
           else
           y= y^A[i];
       }
        for(int i=1;i<=A.length;i++)
       {
           if((i & setbit) !=0)
           x= x^i;
           else
           y= y^i;
       }
       for(int i=0;i<A.length;i++)
       {
           if(y==A[i])
           {
               int tmp= x;
               x=y;
               y=tmp;
           }
       }
       B[0]=x;
       B[1]=y;
       return B;
    }
}
