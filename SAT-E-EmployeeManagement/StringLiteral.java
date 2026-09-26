public class StringLiteral {
    public static void main(String[] args) {
       
        String s1 = "sat-e";
        String s2 = "sat-e";
        String s3 = new String("sat-e");
        String s4 = new String("sat-e");

        // 1. Literal vs Literal
        System.out.println("Literal == Literal: " + (s1 == s2));          // true
        System.out.println("Literal .equals Literal: " + s1.equals(s2));  // true

        // 2. Literal vs New Object
        System.out.println("Literal == Object: " + (s1 == s3));           // false
        System.out.println("Literal .equals Object: " + s1.equals(s3));   // true

        // 3. New Object vs New Object
        System.out.println("Object == Object: " + (s3 == s4));            // false
        System.out.println("Object .equals Object: " + s3.equals(s4));    // true

        // 4. Interned Object vs Literal
        System.out.println("Interned == Literal: " + (s3.intern() == s1)); // true


        String str="java";
        char[] ch=str.toCharArray();
       for (char c : ch) {
            System.out.println(c);
       }                                         //J
                                                //a
                                                //v
                                                //a

     System.out.println("String length: " + ch.length()); // 4  
     
     for (int i = ch.length-1; i >= 0; i--) {
            System.out.print(ch[i]);                       //avaj  (reverse string)
        }                  
        
        
        String str1 = "Hello";
        String s2=str1.concat(" World");  // CONCATE DIFFERENT STRING
        System.out.println(s2);  // Hello World
        String s3="Hello World";  //LEXICAL STRING
        System.out.println(s2==s3); // false

// isempty() and isBlank() methods in Java are used to check the content of a string, but they serve different purposes:

        String s4="";  //EMPTY STRING
        String s5=" ";     //blank string

        System.out.println(s4.isEmpty()); // true (length is 0)
        System.out.println(s5.isBlank()); // true (contains only whitespace)

        String s2 = ""; // empty
        String s3 = " "; // blank = length 1

        System.out.println(s2.isEmpty()); // returns true if string length is zero
        System.out.println(s3.isBlank()); // true

        System.out.println(s3.length());

        System.out.println(s2.isBlank());  // true (empty strings are also blank)
        System.out.println(s3.isEmpty());  // false (contains a space, length is 1)

        // note : /n is empty (false) but blank (true) because it contains a whitespace character (newline) and length is 1
        // note : /t is empty (false) but blank (true) because it contains a whitespace character (tab) and length is 1
   
   // IndexAt Methods in Java are used to find the index of a character or substring within a string. The index is zero-based, meaning the first character has an index of 0.
        String str2 = "Hello, World!";
        int index1 = str2.indexOf('o'); // returns 4 (first occurrence of 'o')
        int index2 = str2.indexOf('o', 5); // returns 8 (first occurrence of 'o' after index 5)
        int index3 = str2.indexOf("World"); // returns 7 (first occurrence of "World")
        int index4 = str2.indexOf("Java"); // returns -1 (not found)

        System.out.println("Index of 'o': " + index1);
        System.out.println("Index of 'o' after index 5: " + index2);
        System.out.println("Index of \"World\": " + index3);
        System.out.println("Index of \"Java\": " + index4);

        //consistOf() method in Java is used to check if a string contains a specific sequence of characters. It returns true if the sequence is found, and false otherwise.
        String str3 = "Hello, World!";
        boolean contains1 = str3.contains("World"); // returns true

       //StartsWith() method in Java is used to check if a string starts with a specific prefix. It returns true if the string starts with the specified prefix, and false otherwise.
        String str4 = "Hello, World!";
        boolean startsWith1 = str4.startsWith("Hello"); // returns true
        boolean startsWith2 = str4.startsWith("World"); // returns false

        System.out.println("Contains \"World\": " + contains1);
        System.out.println("Starts with \"Hello\": " + startsWith1);
        System.out.println("Starts with \"World\": " + startsWith2);


        //EndsWith() method in Java is used to check if a string ends with a specific suffix. It returns true if the string ends with the specified suffix, and false otherwise.
        
        // Comparison --> equals(), equalsIgnoreCase(), compareTo()
        
        String s1 = "Grishma";
        String s2 = "Saisha";
        
        String s3 = "Saisha";
        String s4 = "grishma";
        
        System.out.println(s1.equals(s2)); // false
        System.out.println(s2.equals(s3)); // true

        System.out.println(s1.equalsIgnoreCase(s4)); // true
        
        System.out.println(s1.compareTo(s2)); // -1  s1 is lexicographically smaller than s2, so it returns a negative value
        System.out.println(s2.compareTo(s1)); // 1 
        System.out.println(s2.compareTo(s3)); // 0
        
        // replace(), replaceAll(), trim()

        String str5 = "Hello, World!";
        String replaced1 = str5.replace('o', 'a'); // replaces all occurrences of
        // OUTPUT: Hella, Warld!
        String replaced2 = str5.replaceAll("World", "Java"); // replaces all occurrences of "World"
        // output: Hello, Java!
        String trimmed = str5.trim(); // removes leading and trailing whitespace (start and ending space)
        // output: Hello, World!

        System.out.println("Replaced 'o' with 'a': " + replaced1);
        System.out.println("Replaced \"World\" with \"Java\": " + replaced2);
        System.out.println("Trimmed string: " + trimmed);

        // Split() method in Java is used to split a string into an array of substrings based on a specified delimiter. The method takes a regular expression as an argument and returns an array of strings.
        String str6 = "apple,banana,cherry";
        String[] fruits = str6.split(","); // splits the string at each comma
        for (String fruit : fruits) {
            System.out.println(fruit);
        }        
         // output:
         // apple
         // banana
         // cherry   
         
         //join() method in Java is used to join multiple strings into a single string with a specified delimiter. It takes a delimiter and an array or varargs of strings as arguments and returns a single concatenated string.
        String joined = String.join(" - ", "apple", "banana", "cherry");
        System.out.println(joined); // output: apple - banana - cherry  

        //substring() method in Java is used to extract a portion of a string based on specified start and end indices. The method takes two parameters: the starting index (inclusive) and the ending index (exclusive). It returns a new string that contains the characters from the original string within the specified range.
        String str7 = "Hello, World!";
        String substring1 = str7.substring(7); // extracts from index 7 to the end (world!)
        String substring2 = str7.substring(0, 5); // extracts from index 0 to 5 (hello)

        



    }
}



    

