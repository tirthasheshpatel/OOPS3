public class GSSArray
{
    private int size; // The current size of the array.
    private int avail; // available elements (a integer indicating the last index).
    private int arr[]; // array to store the elements.

    GSSArray(int size)
    {
        this.size = size;
        this.arr = new int[this.size];
        for(int i=0;i<this.size;i++) arr[i] = 0;
        this.avail = -1;
    }

    public void insert(int data)
    {
        if(this.avail == this.size-1) this.grow();
        // 10 20 30 40 -> 23
        int i=this.avail;
        if(this.avail == -1)
        {
            this.avail++;
            arr[i+1] = data;
            return;
        }
        while(data<this.arr[i])
        {
            arr[i+1] = arr[i];
            i--;
            if(i==-1)
            {
                arr[0] = data;
                this.avail++;
                return;
            }
        }
        arr[i+1] = data;
        this.avail++;
    }

    private void grow()
    {
        this.size = this.size*2;
        int arr2[] = new int[this.size];
        for(int i=0;i<=this.avail;i++)
        {
            arr2[i] = this.arr[i];
        }
        this.arr = arr2;
    }

    public boolean delete(int data)
    {
        // 10 20 20 40 60 -> 60
        int i = 0;
        if(this.avail == -1)
        {
            System.out.println("Array Empty! No elements to delete!");
            return false;
        }
        while(data!=this.arr[i])
        {
            if(i==this.avail) return false;
            i++;
        }
        while(i<=this.avail-1)
        {
            arr[i] = arr[i+1];
            i++;
        }
        arr[this.avail] = 0;
        this.avail--;
        return true;
    }

    public void display()
    {
        System.out.println("Current Size: " + this.size + ", Available elements: " + (this.avail+1));
        for(int i=0;i<=this.avail;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}