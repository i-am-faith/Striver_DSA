import java.util.*;
public class zeroes_to_end {
        public static int[] moveZeros(int n, int []a) {
        List<Integer> temp = new ArrayList<>(n);
        //copying all non zero elements to temp
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                temp.add(a[i]);
            }
        }
        //copying all non zero element to the front of main array
        int nz = temp.size();
        for(int i=0;i<nz;i++)
        {
            a[i] = temp.get(i);
        }
        //add rest of the 0's
        for(int i=nz;i<n;i++)
        {
            a[i] = 0;
        }

        return a;
    }
}