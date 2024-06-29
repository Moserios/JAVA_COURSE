import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args){
        //Standard output
        System.out.println("Java Basics");


        // Variables
        int age = 24;
        System.out.println("Best age is: " + age);

        char a = 's';

        /* Assign variable
        and concatenate it
         */

        final String name = "Sergey";
        age += 10;
        age ++;
        System.out.println(name + "'s age is " + age);


        //Math operations
        System.out.println("\nMath operations");
        int x = 5;
        float y = 10.3F;

        // Addition
        double result = x + y;
        System.out.println("Addition: " + x + " + " + y + " = " + result);

        //Substraction
        result = x - y;
        System.out.println("Substraction: " + x + " - " + y + " = " + result);

        //Multiplication
        result = x * y;
        System.out.println("Multiplication: " + x + " * " + y + " = " + result);

        //Division
        result = x / y;
        System.out.println("Division: " + x + " / " + y + " = " + result);

        //Reminder
        result = x % y;
        System.out.println("Reminder: " + x + " % " + y + " = " + result);

        //Power
        result = Math.pow(x,y);
        System.out.println("Power: " + x + " in power " + y + " = " + result);

        //Square Root
        result = Math.sqrt(x);
        double result2 = Math.sqrt(y);
        System.out.println("Square root of '" + x + "' = " + result);
        System.out.println("Square root of '" + y + "' = " + result2);


        /*Comparisons signs*/
        System.out.println("\nComparisons signs");

        boolean boolresult = x > y;
        System.out.println("Greater then: " + x + " > " + y + " is " + boolresult);

        boolresult = x >= y;
        System.out.println("Greater or equal then: " + x + " >= " + y + " is " + boolresult);

        boolresult = x < y;
        System.out.println("Lower then: " + x + " < " + y + " is " + boolresult);

        boolresult = x <= y;
        System.out.println("Lower or equal then: " + x + " <= " + y + " is " + boolresult);

        boolresult = x == y;
        System.out.println("Equal: " + x + " equal " + y + " is " + boolresult);

        boolresult = x != y;
        System.out.println("Not equal: " + x + " not equal " + y + " is " + boolresult);


        /*Type casting*/
        System.out.println("\nType casting");

        System.out.println("From smaller to larger type is OK:\n byte >> short >> char >> int >> long >> float >> double");
        long x2 = x;
        double y2 = y;

        System.out.println("int x = " + x
                + "\n long x = " + x2
                + "\n float y = " + y
                + "\n double y = " + y2);

        System.out.println("\nFrom larger to smaller type should be done manually:\n double >> float >> long >> int >> char >> short >> byte");
        int x3 = (int)x2;
        float y3 = (float)y2;

        System.out.println("long x = " + x2
                + "\n int x = " + x3
                + "\n double y = " + y2
                + "\n float y = " + y3);


        /*Wrapper classes
            Boxing / Unboxing*/
        System.out.println("\nWrapper classes. Autoboxing/Unboxing");
        //Autoboxing: Automatic convertion primitive into it's wrapper class
        Integer x4 = x;
        System.out.println(x4.toString());

        //Unboxing: Automatic convertion wrapper class into it's primitive
        int x5 = x4;
        System.out.println(x5);


        //Import from the console
        System.out.println("\nConsole input");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
//        String userName = scanner.nextLine();
//        System.out.println("Enter your phone number (10 digits max):");
//        //int number = scanner.nextInt();
//        String input = scanner.next();
//        BigInteger phoneNumber = new BigInteger(input);
//        System.out.println("Hello " + userName + ", I'll call you to " + phoneNumber + " some day :)");


                /*If Else statements*/
        System.out.println("\nIf-Else statements");

        if (x > y){
            System.out.println(x + " > " + y);
        }
        else if (x < y){
            System.out.println(x + " < " + y);
        }
        else{
            System.out.println(x + " == " + y);
        }


        /*Switch statements*/
        System.out.println("\nSwitch statements");

        switch(x){
            case 3:
                System.out.println("Three");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 7:
                System.out.println("Seven");
                break;
            default:
                System.out.println(x + " is out of known values.");
        }

        /*Conditional operators*/
        System.out.println("\nConditional operators");
        System.out.println("AND operator is '&&': (x && y)");
        System.out.println("OR operator is '||': (x || y)");
        System.out.println("NOT operator is '!' (!(x || y))");
        if(x > 5 && y > 10) {
            System.out.println("&& condition is met");
        }
        else if(x > 5 || y > 10){
            System.out.println("|| condition is met");
        }
        else if(!(x > 5 || y > 10))
        {
            System.out.println("! condition is met");
        }


        /*For loop*/
        System.out.println("\nFOR loop");
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }

        /*WHY loop*/
        System.out.println("\nWHILE loop");
        int i = 10;
        while (i < 20)
        {
            System.out.println(i);
            i++;
        }

        /*DO-WHILE loop*/
        System.out.println("\nDO-WHILE loop");
        int k = 20;
        do{
            System.out.println(k);
            k++;
        }
        while(k < 31);

        /*BREAK and CONTINUE*/
        System.out.println("\nBREAK at 46 and CONTINUE at 42");
        for (int j = 40; j < 50; j++){
            if (j == 42)
            {
                continue;
            }
            else if( j == 46)
            {
                break;
            }
            System.out.println(j);
        }

        /*Functions*/
        System.out.println("\nFunctions");

        System.out.println("\nCalculat 10 + 20: " + calculate(10, 20, "+"));
        System.out.println("\nCalculat 10.5 - 20: " + calculate(10.5, 20, "-"));
        System.out.println("\nCalculat 10 * 20: " + calculate(10, 20, "*"));
        System.out.println("\nCalculat 10 / 20: " + calculate(10, 20, "/"));
        System.out.println("\nCalculat 10 % 20: " + calculate(10, 20, "%"));
        System.out.println("\nCalculat 10 // 20: " + calculate(10, 20, "//"));

        System.out.println("\nCalculat 10 and 20: " + calculate(10, 20));
        System.out.println("\nCalculat 10.75 and 20.25: " + calculate(10, 20));


        /*Arrays*/
        System.out.println("\nArrays");
        //In Java arrays can't change length after declaration!!!!

        int[] myArray = {1,2,3,4,5,6,7,8,9,10}; // array initialization with known elements
        System.out.println("4th element of array is: " + myArray[4]);
        myArray[9] = 99; // change array value with index of 9
        System.out.println("All elements of array are: " + Arrays.toString(myArray));
        int[] myArray2 = new int[10]; // empty array initialize with 10 elements

        for (int m = 0; m < myArray.length; m++)
        {
            System.out.println(myArray[m]);
        }

        for (int m : myArray) //loop via array elements
        {
            System.out.println(m);
        }

        /*Array lists*/
        System.out.println("\nArrays: changes available");
        //In Java array lists can be changed with changing the length!!!!
        ArrayList<Integer> myArr = new ArrayList<Integer>(); //declaration of the array list
        myArr.add(52); //add value to the arrayList
        myArr.add(100);
        myArr.add(12);
        myArr.add(10);
        myArr.add(210);
        myArr.add(29);
        System.out.println("All elements: " + myArr);

        myArr.remove(2); //remove element with index 2

        //Arrays.sort(myArr); //for arrays only!!!
        Collections.sort(myArr); //sorting arraylist
        System.out.println("All elements after remove element with index 2: " + myArr);
        for (int m : myArr) //loop via array elements
        {
            System.out.println(m);
        }

        int searchNumber = 100;
        int index = Collections.binarySearch(myArr, searchNumber);
        System.out.println("Index of number " + searchNumber + " found by binary search is: " + index);
        System.out.println("\nSending ArrayList to external method");
        printArray(myArr);

        //Multidimentional arrays
        System.out.println("\nMultidimentional arrays");
        //int[][] multyArray = new int[3][3];//declare empty array 3x3
        int[][] multyArray = {{0,1,2}, {3,4,5,}, {6,7,8}};//declare with values
        for (int n = 0; n < multyArray.length; n++){
            for (int o = 0; o < multyArray[n].length; o++){
                System.out.print(" " + multyArray[n][o]);
            }
            System.out.println();
        }

        //Copying arrays
        System.out.println("\nCopying arrays");
        int[][] newArray = new int[multyArray.length][];
        for (i = 0; i < multyArray.length; i++) {
            //System.arraycopy(multyArray, 0, newArray, 0, multyArray.length);
            newArray[i] = Arrays.copyOf(multyArray[i],multyArray[i].length);
        }
        System.out.println("Copied array content: " + Arrays.deepToString(newArray));

        //Strings formatting
        System.out.println("\nStrings formatting");
        double pi = 3.14159;
        System.out.println(String.format("Formatted string: Pi is approx equals %f", pi)); //%f == floating-point number

        String str = "Sergey";
        System.out.println(String.format("Formatted string: My name is %s", str)); // %s == string

        long dec = 1234567890;
        System.out.println(String.format("Formatted decimal: Decimal integer is big number %d", dec)); //d == decimal integer or long

        LocalDateTime birthDate = LocalDateTime.of(1979, 10 ,15, 22, 30);
        Date date = Date.from(birthDate.atZone(ZoneId.systemDefault()).toInstant());
        System.out.printf("\nFormatted Birth Date: %tY-%1$tm-%1$td", date); //t == date time format

        boolean trueFalse = true;
        System.out.printf("\nFormatted boolean: %b", trueFalse); //d == decimal integer or long

        //String Methods
        System.out.println("\nString Methods");
        String example1 = "  Hello World!  ";
        String example2 = "  I'm already here!  ";
        System.out.println("Initial string: " + example1);
        System.out.println("length: " + example1.length());
        System.out.println("toLower: " + example1.toLowerCase());
        System.out.println("toUpper: " + example1.toUpperCase());
        System.out.println("trim: " + example1.trim());
        System.out.println("startsWith: " + example1.startsWith("  He"));
        System.out.println("endsWith: " + example1.endsWith("!  "));
        System.out.println("charAt: " + example1.charAt(10));
        System.out.println("replace: " + example1.replace("W", "M"));
        System.out.println("concat: " + example1.concat(example2));
        System.out.println("isEmpty: " + example1.isEmpty());
        String subst = example1.substring(8,14);
        System.out.println("substring: " + subst);

        //String Builder (mutable while string class is immutable!!! For single-threaded applications only
        System.out.println("\nStringBuilder - For single-threaded applications only!");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" My World!");
        System.out.println(sb);
        sb.insert(9, "lovely ");
        System.out.println(sb);
        sb.delete(6, 9);
        System.out.println(sb);

        //String Buffer (mutable while string class is immutable!!! For multi-threaded applications
        System.out.println("\nStringBuffer - For multi-threaded applications!");
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" My World!");
        System.out.println(sbf);
        sbf.insert(9, "lovely ");
        System.out.println(sbf);
        sbf.delete(6, 9);
        System.out.println(sbf);


        //Regular expressions and character classes
        System.out.println("\nRegular expressions and character classes");
        System.out.println("[abc] - a, b or c, single character only, not ab,ac,bc or abc!!!!");
        System.out.print("('[abc]', 'abc') - ");
        System.out.println(Pattern.matches("[abc]", "abc")); // false, cause only single character a ,b or c allowed. Not abc, ab,ac, or bc!

        System.out.print("('[abc]', 'b') - ");
        System.out.println(Pattern.matches("[abc]", "b")); // true, cause b is in the pattern

        System.out.print("('[abc]', 'jk') - ");
        System.out.println(Pattern.matches("[abc]", "jk")); // false, cause jk are NOT in the pattern

        System.out.println("[^abc] - any lowercase single character except a, b or c");
        System.out.println("[a-zA-Z] or [a-dm-p] - all characters from a to z or from A to Z");
        System.out.println("[a-d[m-p]] - all characters from a to d or from m to p (m,n,o will be excluded)");
        System.out.println("[a-z&&[^bc]] or [ad-z]- all characters from a to z except b and c ");
        System.out.println("[a-z&&[^m-p]] or [a-lq-z]- all characters from a to z except from m to p (m,n,o will be excluded)");

        //Regular expressions quantifiers
        System.out.println("\nRegular expressions quantifiers");
        System.out.println("'a?' - a occurs once or not at all");
        System.out.print("('[abc]?, 'a') - ");
        System.out.println(Pattern.matches("[abc]?", "a")); //true

        System.out.print("('[abc]?, 'cc') - ");
        System.out.println(Pattern.matches("[abc]?", "cc")); //false cause c appears twice

        System.out.println("'a+' - a occurs once or more");
        System.out.print("('[abc]+, 'cc') - ");
        System.out.println(Pattern.matches("[abc]+", "cc")); //true cause expression expects c one or more timez
        System.out.print("('[abc]+, 'a') - ");
        System.out.println(Pattern.matches("[abc]+", "a")); //true

        System.out.println("'a*' - a occurs 0 times or more");
        System.out.print("('[abc]*, 'aaacbb') - ");
        System.out.println(Pattern.matches("[abc]*", "aaacbb")); //true

        System.out.println("'a{n}' - a occurs only 'n' times");
        System.out.println("'a{n,}' - a occurs 'n' or more times");
        System.out.println("'a{y,z}' - a occurs 'y' times, but not more then 'z' times");

        //Regular expressions Metacharacters
        System.out.println("\nRegular expressions Metacharacters (short codes)");
        System.out.println("'.' - means any character");
        System.out.println("'\\d' or '[0-9]' - means any digits");
        System.out.print("('\\\\d, '1') - ");
        System.out.println(Pattern.matches("\\d", "1")); //true cause "1" its digit char
        System.out.print("('\\\\d, '11') - ");
        System.out.println(Pattern.matches("\\d", "11")); //false cause "12" its 2 digit chars, expression expects single digit
        System.out.print("('\\\\d, 'c') - ");
        System.out.println(Pattern.matches("\\d", "c")); //false cause "c" its NON-digit char

        System.out.println("'\\D' or '[^0-9]' - means any NON-digit");
        System.out.print("('\\\\D, 'c') - ");
        System.out.println(Pattern.matches("\\D", "c")); //true cause "c" its NON-digit char
        System.out.print("('\\\\D, '1') - ");
        System.out.println(Pattern.matches("\\D", "1")); //true cause "1" its digit char, NON-digit expected
        System.out.print("('\\\\D, 'ab') - ");
        System.out.println(Pattern.matches("\\D", "ab")); //false cause "ab" its 2 NON-digit chars and expected single char

        System.out.println("'\\s' or '[\\t\\n\\x0B\\f\\r]' - any whitespace character");
        System.out.println("'\\S' or '[^\\s]' - any NON-whitespace character");
        System.out.println("'\\w' or '[a-zA-Z_0-9]' - any word character");
        System.out.println("'\\W' or '[^\\w]' - any NON-word character");
        System.out.println("'\\b' - any word boundary");
        System.out.println("'\\B' - a NON-word boundary");

        System.out.println("\nREGEX USECASES");
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher matcher = pattern.matcher("Hello World");
        boolean regexResult = matcher.matches();
        System.out.printf("\nRegEx matching result is %b, cause space ' ' between words is not expected in pattern '[a-zA-Z0-9]*'", regexResult);
        pattern = Pattern.compile("[a-zA-Z0-9\\s]*");
        matcher = pattern.matcher("Hello World");
        regexResult = matcher.matches();
        System.out.printf("\nRegEx matching result is %b, cause space ' ' between words is now expected in pattern '[a-zA-Z0-9\\s]*'", regexResult);
        pattern = Pattern.compile("[0-9]{10}");
        matcher = pattern.matcher("0123456789");
        regexResult = matcher.matches();
        System.out.printf("\nRegEx matching result for '0123456789' is %b, cause expression expects exactly 10 digits for pattern '[0-9]{10}'", regexResult);
        pattern = Pattern.compile("[0-9]{10}");
        matcher = pattern.matcher("012345678");
        regexResult = matcher.matches();
        System.out.printf("\nRegEx matching result for '012345678' is %b, cause expression expects exactly 10 digits and 9 only provided for pattern '[0-9]{10}'", regexResult);

        //MATH package
        System.out.println("\nMATH package");
        x = 10;
        k = 15;
       // int maxresult = Math.max(x,k);
        System.out.printf("\nUse Math.max(x,y) to get larger number from selection: %d", Math.max(x,k));
        System.out.printf("\nUse Math.sqrt(15) to get square root from selection: %f", Math.sqrt(k));
        System.out.printf("\nUse Math.round(x) to get math round: %d", Math.round(k));
        System.out.printf("\nUse Math.random() to get random number in range 0-0.999999: %f", Math.random());

        //DATE package
        System.out.println("\n\nDATE package: seconds counter/converter from 01.01.1970.");
        Date someDate = new Date(3542134384354354L);
        Date currentDate = new Date();
        boolean isAfter = currentDate.after(someDate);
        boolean isBefore = currentDate.before(someDate);
        System.out.println(isAfter);
        System.out.println(isBefore);
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-mm-dd");
        System.out.println(formatter.format(someDate));

        //ENUM
        System.out.println("\n\nENUM");
        dayOfWeek.printAllDays();
        weekdayActions(dayOfWeek.Monday);
        weekdayActions(dayOfWeek.Sunday);


        //Exceptions handling
        System.out.println("\n\nExceptions handling");
        double d1 = 5;
        double d2 = 2;
        double result3 = divide(d1, d2);
        System.out.printf("Divide result for %f and %f is: %f", d1, d2, result3);

        int d3 = 2;
        int d4 = 0;
        double result4 = divideInt(d3, d4);
        System.out.printf("Divide result for %d and %d is: %f", d3, d4, result4);


        //Throwing exception with THROW keyword
        System.out.println("\n\nThrowing exception with THROW keyword");
        double result5 = divideCheck(10, 0);
        System.out.println(result5);


        //Lambda expressions
        System.out.println("\n\nLambda expressions");
        IntBinaryOperator sum = (x1,y1) -> x1 + y1;
        int result6 = sum.applyAsInt(101, 2002);
        System.out.println(result6);



    }

    public static double divideCheck(int value1, int value2){
        double value3 = 0;
        if (value2 == 0){
            System.out.println("\nCan't divide by 0");
            return 0;
            //throw new ArithmeticException("Can't divide by 0");
        }
        value3 = value1 / value2;
        return value3;
    }


    public static double divide(double value1, double value2){
        double value3 = 0;
        try{
            value3 = value1 / value2;
            System.out.println("\nThis code is from TRY section");
        } catch (ArithmeticException e) {
            System.out.printf("\nThis code from CATCH section contains exception: %s", e);
        } finally {
            System.out.println();
            System.out.println("This code is from FINALLY section and runs always no matter if TRY section is successful or not");
        }
        System.out.println("Returning result.");
        return value3;
    }

    public static double divideInt(int value1, int value2){
        double value3 = 0;
        try{
            value3 = value1 / value2;
            System.out.println("\nThis code is from TRY section");
        } catch (ArithmeticException e) {
            System.out.printf("\nThis code from CATCH section contains exception: %s", e);
        } finally {
            System.out.println("This code is from FINALLY section and runs always no matter if TRY section is successful or not");
        }
        System.out.println("Returning result.");
        return value3;
    }

    public enum dayOfWeek{
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday;

        public static void printAllDays(){
            System.out.println("Days of the week:");
            for (dayOfWeek day: values()){
                System.out.println(day);
            }
            System.out.println();
        }
    }

    public static void weekdayActions(dayOfWeek day){
        if (day == dayOfWeek.Saturday || day == dayOfWeek.Sunday){
            System.out.println("Have a nice weekend :)");
        }
        else{
            System.out.println("Work hard!");
        }
    }

    public static void printArray(ArrayList<Integer> arr)
    {
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }

    static double calculate(double e, double f, String c)
    {
        double results;
        switch(c){
            case "+":
                results = e + f;
                break;
            case "-":
                results = e - f;
                break;
            case "*":
                results = e * f;
                break;
            case "/":
                results = e / f;
                break;
            case "%":
                results = e % f;
                break;
            default:
                results = 0;
        }
        return results;
    }

    static double calculate(int e, int f, String c)
    {
        double results;
        switch(c){
            case "+":
                results = e + f;
                break;
            case "-":
                results = e - f;
                break;
            case "*":
                results = e * f;
                break;
            case "/":
                results = e / f;
                break;
            case "%":
                results = e % f;
                break;
            default:
                results = 0;
        }
        return results;
    }

    static int calculate(int e, int f)
    {
        return e + f;
    }

    static double calculate(double e, double f)
    {
        return e + f;
    }

}
