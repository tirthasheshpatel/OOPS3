# Question 2 Java Code

| Class | Attribute | Type | Short Description |
| ------ | ---------- | ------ | ------------------ |
| MyString | ``mainString`` | ``String`` | Stores the main string on which we want to operate |
| MyString | ``toSearch`` | ``String`` | A string that is to be searched for in the ``mainString`` to replace or to count the occurrence |
| MyString | ``replaceString`` | ``String`` | A string that is used to replace any particular occurrence in the ``mainString``. |
| MyString | ``no_of_occurrences`` | ``int`` | A string that is searched for in the ``mainString``. |

| Class | Method | Parameters | Parameter Type | Returns |
| ------ | -------- | ------- | -------- | ------- |
| MyString | printAllOccurrences | - | - | ``void`` |
| MyString | replaceSpecificOccurrences | ``occurrence`` | ``int`` | ``void`` |

```java
import java.util.Scanner;

class MyString
{
    String mainString;
    String toSearch;
    String replaceString;
    int no_of_occurrences;

    MyString(String mainString, String toSearch, String replaceString) {
        this.mainString = mainString;
        this.toSearch = toSearch;
        this.replaceString = replaceString;
        this.no_of_occurrences = 0;
    }

    public void printAllOccurrences() {
        int i = 0, j = this.toSearch.length();

        while(j <= this.mainString.length()) {
            String tempString = this.mainString.substring(i, j);
            if(this.toSearch.equals(tempString)) {
                no_of_occurrences++;
                System.out.println("\"" + this.toSearch + "\" found in \"" + this.mainString + "\" at index: " + i);
            }
            i++;
            j++;
        }
        System.out.println("Number of occurrences: " + this.no_of_occurrences);
    }

    public void replaceSpecificOccurrences(int occurrence) {
        int i = 0, j = this.toSearch.length(), count = 0;

        while(j <= this.mainString.length() && count != occurrence) {
            String tempString = this.mainString.substring(i, j);
            if(this.toSearch.equals(tempString)) {
                count++;
            }
            i++;
            j++;
        }

        if(j == this.mainString.length()+1) {
            System.out.println("Nothing to replace!");
            return;
        }
        String prevString = this.mainString;
        String front = this.mainString.substring(0, i-1);
        String mid = this.replaceString;
        String end = this.mainString.substring(j-1);
        this.mainString = front + mid + end;
        System.out.println("Main String: \"" + prevString + "\"");
        System.out.println("Modified String: \"" + this.mainString + "\"");
    }
}


class TestMyString
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String someString = in.nextLine();
        String searchString = in.nextLine();
        String replaceString = in.nextLine();
        MyString obj = new MyString(someString, searchString, replaceString);
        obj.printAllOccurrences();
        obj.replaceSpecificOccurrences(1);
        obj.replaceSpecificOccurrences(1);
    }
}
```
