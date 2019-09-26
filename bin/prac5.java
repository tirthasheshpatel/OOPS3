import java.util.*;

class prac5
{
    public static void main(String[] args) {
        int a[] = {1,423,312,323,533,312,2};
        int b[] = countingSort(a,7);
        mergeSort(a,0,6);
        System.out.print("Merge Sort: ");
        for(int i=0;i<6;i++) System.out.print(a[i] + " ");
        System.out.print("\nCounting Sort: ");
        for(int i=0;i<6;i++) System.out.print(b[i] + " ");
    }

    public static void mergeSort(int a[], int p, int r)
    {
        if(r>p)
        {
            int mid = (int)((p+r)/2);
            // System.out.print("Callback for: " + p + " " + mid + " " + r + "\n");
            mergeSort(a,p,mid);
            mergeSort(a,mid+1,r);
            merge(a, p, mid, r);
        }
    }

    public static void merge(int a[], int p, int q, int r)
    {
        int n1 = q-p+1;
        int n2 = r-q;
        int a1[] = new int[n1];
        int a2[] = new int[n2];
        for (int i = p, j = 0; i <= q; i++, j++) a1[j] = a[i];
		for (int i = q + 1, j = 0; i <= r; i++, j++) a2[j] = a[i];
        int i=0;
        int j=0;
        int k=p;
        while(i<n1 && j<n2)
        {
            if(a1[i] <= a2[j]) a[k++] = a1[i++];
            else a[k++] = a2[j++];
        }
        while(i<n1) a[k++] = a1[i++];
        while(j<n2) a[k++] = a2[j++];
    }

    public static int maxeleinarr(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static int[] countingSort(int a[], int n)
    {
        int maxele = maxeleinarr(a);
        int counts[] = new int[maxele+1];
        int aux[] = new int[n];
        for(int i=0;i<n;i++) aux[i] = 0;
        for(int i=0;i<maxele+1;i++) counts[i] = 0;
        for(int i=0;i<n;i++)
        {
            counts[a[i]]++;
        }
        for(int i=1;i<maxele+1;i++)
        {
            counts[i] += counts[i-1];
        }
        for(int i=0;i<n;i++){
            aux[counts[a[i]]-1] = a[i];
            counts[a[i]]--;
        }
        return aux;
    }

}