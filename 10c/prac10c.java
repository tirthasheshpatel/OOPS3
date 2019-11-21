import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class prac10c {
    public static void main(String[] args) {
        File inSearch = new File("names.txt");

        for (String toSearch : args)
        {
            Thread t = new Thread(new Search(inSearch, toSearch));
            t.start();
        }
    }
}

class Search implements Runnable
{

    File inSearch;
    String toSearch;

    Search(File inSearch, String toSearch)
    {
        this.inSearch = inSearch;
        this.toSearch = toSearch;
    }

    @Override
    public void run()
    {
        Scanner input;
        try
        {
            input = new Scanner(inSearch);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
            return;
        }
        boolean flag = false;
        while(input.hasNextLine())
        {
            flag = input.nextLine().toLowerCase().contains(toSearch.toLowerCase());
            if (flag)
            {
                break;
            }
        }

        if(flag)
        {
            System.out.println(toSearch + " found in the file");
        }
        else
        {
            System.out.println(toSearch + " not found in the file");
        }
    }
}