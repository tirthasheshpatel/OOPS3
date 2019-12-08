import java.io.*;

class SerializeMe implements Serializable
{
    int attr_1 = 10;
    int attr_2 = 20;
}

class TestFiles
{
    public static void main(String[] args) {
        /** An abstract representation of the data connected to some
         * input or output device is called a `Stream`.
         * 
         * Byte Stream:
         *  - Usually works for bytes and binary objects.
         *  - `InputStream` and `OutputStream` are abstract classes
         *    which represent Byte Streams.
         * 
         * Character Streams: 
         *  - Usually works for Strings and Characters.
         *  - Follows the unicode.
         *  - `Reader` and `Writer` are abstract classes which
         *    represent Character Streams.
         * 
         * Buffer: 
         *  - In computer science, a data buffer (or just buffer) is a region
         *    of a physical memory storage used to temporarily store data while
         *    it is being moved from one place to another.
         * 
         * 
        */

        /**
         * FileInputStream: 
         *  - subclass of class `InputStream`.
         *  - Reads raw bytes as integers. 
         *  - Returns -1 in case it is not found!
        */
        testFileInputStream();

        /**
         * BufferedInputStream: 
         *  - Stores the data of file in  buffer.
         *  - Reads from buffer instead of directly
         *    reading from the file.
         *  - subclass of `InputStream`.
        */
        testBufferedInputStream();

        /**
         * Same applies for FileOutputStream.
        */
        testFileOutputStream();

        /**
         * Same applies for BufferedOutputStream.
        */
        testBufferedOutputStream();

        /**
         * Data I/O stream
         *  - We may want an even higher level of abstraction
         *    for reading and writting data in the form of
         *    primitive datatypes.
         *  - `DataOutputStream` and `DataInputStream` helps
         *    achieve that level of abstraction.
        */
        testDataOutputStream();
        testDataInputStream();

        /**
         * Serialization:
         *  - Sexy name given to storing the object as is.
         *  - We can also retrive the object using deserialization.
         *  - Stores all the attributes of the object so they
         *    can be used after the execution of a program.
         * 
         * Deserialization:
         *  - Bruh!
        */
        testSerialization();
        testDeserialization();

        /**
         * 
        */
    }

    public static void testFileInputStream() {
        try {
            FileInputStream f = new FileInputStream("file2.txt");
            int _byte;
            while((_byte = f.read()) != -1) {
                System.out.print((char)_byte);
                if((char)_byte == '\n') System.out.println();
            }
            f.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void testBufferedInputStream() {
        try {
            BufferedInputStream f = new BufferedInputStream(
                                        new FileInputStream("file2.txt")
                                    );
            int _byte;
            while((_byte = f.read()) != -1) {
                System.out.print((char)_byte);
                if((char)_byte == '\n') System.out.println();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void testFileOutputStream() {
        try {
            FileOutputStream f = new FileOutputStream("file3.txt");
            String newData = "This is the New Data from FileOutputStream!\nFuck off!\n";
            char[] str = newData.toCharArray();
            for(char ch: str) {
                f.write((int)ch);
            }
            f.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void testBufferedOutputStream() {
        try {
            BufferedOutputStream f = new BufferedOutputStream(
                                        new FileOutputStream("file3.txt")
                                     );
            String newData = "This is the new data from BuferedOutputStream!\nFuck off.\n";
            char[] str = newData.toCharArray();
            for(char ch: str) {
                f.write((int)ch);
            }
            f.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void testDataOutputStream() {
        try {
            DataOutputStream data = new DataOutputStream(
                                        new BufferedOutputStream(
                                            new FileOutputStream("file3.txt")
                                        )
                                    );
            
            String newData = "This is the new data from BuferedOutputStream!\nFuck off.\n";
            char[] str = newData.toCharArray();
            data.writeInt(10);
            for(char ch: str) {
                data.write((int)ch);
            }
            data.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void testDataInputStream() {
        try {
            DataInputStream data = new DataInputStream(
                                        new BufferedInputStream(
                                            new FileInputStream("file3.txt")
                                        )
                                    );
            
            int ch;
            int storedInt = data.readInt();
            System.out.println("Integer retrived: " + storedInt);
            while((ch = data.read()) != -1) {
                System.out.print((char)ch);
                if((char)ch == '\n') System.out.println();
            }
            data.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void testSerialization() {
        try {
            ObjectOutputStream obj$os = new ObjectOutputStream(
                                            new FileOutputStream("serialized.ser")
                                        );
            SerializeMe obj = new SerializeMe();

            obj.attr_1 = 30;
            obj.attr_2 = 50;

            obj$os.writeObject(obj);

            obj$os.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void testDeserialization() {
        try {
            ObjectInputStream obj$os = new ObjectInputStream(
                                            new FileInputStream("serialized.ser")
                                        );

            SerializeMe obj = (SerializeMe)obj$os.readObject();

            System.out.println("attr_1: " + obj.attr_1);
            System.out.println("attr_2: " + obj.attr_2);

            obj$os.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
