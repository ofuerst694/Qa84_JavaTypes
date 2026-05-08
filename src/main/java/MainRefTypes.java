public class MainRefTypes {

    public static void main(String[] args) {
        int a = 5;
        int b = a;
        if (a == b) //== spavnenie
            System.out.println("a == b");

        String str = "Hello";// = prisvoenie
        String str1 = new String("Hello");
        String str2 = "Hello";
        if (str == str1)
            System.out.println("equals ==");
        else
            System.out.println("not equals");

    }
}
/*
str -> "Hello"
str1 -> "Hello"
 */
/*
a[][][][5]
b[][][][5]
 */