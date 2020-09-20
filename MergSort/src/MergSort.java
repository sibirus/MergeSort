public class MergSort
{
    public static void split(int[] x)
    {
        int size =x.length;
        int half=size/2;
        if(size<2)
        {
            return;
        }
        int[] left = new int[half];
        int[] right= new int[size - half];
        for (int i=0;i<half;i++)
        {
            left[i]=x[i];
        }
        for(int i=half;i<size;i++)
        {
                right[i-half] = x[i];
        }
        split(left);
        split(right);
        marge(x, left, right, half, size-half);


    }

    public static void marge(int[] x, int[] left, int[] right, int half, int sh)
    {
        int i = 0, j = 0, k = 0;
        while (i < half && j < sh)
        {
            if (left[i] <= right[j])
            {
                x[k++] = left[i++];
            }
            else {
                x[k++] = right[j++];
            }
        }
        while (i < half)
        {
            x[k++] = left[i++];
        }
        while (j < sh)
        {
            x[k++] = right[j++];
        }
    }

        public static void main (String[]args)
        {
            int [] sample={2,6,9,4,1};
            MergSort.split(sample);
            for(int i:sample)
            {
                System.out.print(i+" ");

            }

        }
}
