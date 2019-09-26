public class outputing {
    /*
     Answers -> 1 : error
                2 : 31
                3 : 31
                4 : error
                5 : -8
                6 : 504
                7 : error
                8 : 31
                9 : 31
                10 : -32
                11 : -32
                12 : 8
                13 : -504
                14 : -32
                15 : 1073741792
     */
    public static void main(String args[])
    {
    byte a = 126;
    byte b = 2;
    byte c;
    // ERROR: cannot convert form int to byte because
    //        a >> b converts both a and b to int and final
    //        result is in int form so we need to
    //        externally typecast the end expression to byte.

    // c = a >> b; 
    // System.out.println("1 : " + c);
    
    a = 126;
    b = 2;
    // Answer should be 31 because
    // First a and b will become integers.
    // Binary of 126 : 01111110 (happens as integer)
    // 01111110 >> 2 = 00011111 (happens as integer)
    // 31 is typecasted to byte.
    // which in the range of byte. 
    c = (byte) (a >> b);
    System.out.println("2 : " + c);
    

    int i1 = 126;
    int i2 = 2;
    int i3 = i1 >> i2;
    // Bruh! Same as previous but for int.
    System.out.println("3 : " + i3);
    
    // ERROR : cannot convert int to byte
    // for the same reason as mentioned in the
    // question 1.

    // c = a << b;
    // System.out.println("4 : " + c);
    
    // a = 126, b = 2
    // First a and b are converted into int
    // Now Binary of 126: 01111110
    // When left shifted by 2: 00000001 111111000
    // This is equal to 504 which is currently int.
    // Now we typecast to byte.
    // So, first 504 % 256 = 248 => c = -(256-248) = -8
    // Answer should be -8.
    c = (byte) (a << b);
    System.out.println("5 : " + c);
    
    // 504 for obvious reasons.
    i3 = i1 << i2;
    System.out.println("6 : " + i3);
    
    // ERROR: cannot convert from int to byte.

    // c = a >>> b;
    // System.out.println("7 : " + c);
    
    // a = 126, b = 2
    // Answer will be same as question 2.
    c = (byte) (a >>> b);
    System.out.println("8 : " + c);
    
    // Answer will be same as question 2.
    i3 = i1 >>> i2;
    System.out.println("9 : " + i3);
    
    // a = -126, b = 2
    // -126 : 11111111 11111111 11111111 10000010 ( 2's compliment of 126 )
    // When shifted by 2 bits, we would get:
    //        11111111 11111111 11111111 11100000
    // Answer will be -(2's compliment of above binary string)
    // =    -(00000000 00000000 00000000 00100000)
    // which is equal to -32 in int.
    // Then, we convert -32 to byte.
    // As -32 is in the range of byte,
    // we get the answer as -32.
    a = -126;
    c = (byte) (a >> b);
    System.out.println("10 : " + c);
    
    // Same argument as the previous question. 
    // Answer will be -32.
    i1 = -126;
    i3 = i1 >> i2;
    System.out.println("11 : " + i3);
    
    // a = -126, b = 2
    // -126:        11111111 11111111 11111111 10000010 ( 2's compliment of 126 )
    // -126 << 2 :  11111111 11111111 11111110 00001000
    //  =         -(00000000 00000000 00000001 11111000) in int
    //  =         -504 in int.
    // Typecating to byte: -504%256 = -248. => Answer: 256-248 = 8
    // So, our answer is 8.
    c = (byte) (a << b);
    System.out.println("12 : " + c);
    
    // Answer is -504. Explained in previous question.
    i3 = i1 << i2;
    System.out.println("13 : " + i3);
    
    // a = -126, b = 2
    // -126:        11111111 11111111 11111111 10000010 ( 2's compliment of 126 )
    // -126 >>> 2:  00111111 11111111 11111111 11100000
    //            = 1073741792
    // This is out of range of byte.
    // So, typecasting to int: 1073741792 % 256 = 224
    // So, answer = -(256-224) = -32.
    c = (byte) (a >>> b);
    System.out.println("14 : " + c);
    
    // Answer will be 1073741792 for the 
    // same reason as mentioned in previous question.
    i3 = i1 >>> i2;
    System.out.println("15 : " + i3);
    }
    }