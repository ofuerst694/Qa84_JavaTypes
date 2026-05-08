public class MainJavaTypes {
    public static void main(String[] args) {
        System.out.println("Hello Olga");
        System.out.println("Hello QA");
        System.out.print("Hello");
        System.out.print(" Java");

        //Primitive type
        //Ganze Zahlen
        int a = 5;//a-> [][][][] nur ganze Zahlen
        byte b = 127; //b -> []
        short c = 34; //c-> [][]
        char n = '#';// n ->[][] Simbol nicht Zahl ascii(american standard)
        long m = 214500000L;// m->[][][][][][][][]

        //Bruchzahlen
        double t =34.8;// t-> [][][][][][][][]
        float g = 3.8F; //g-> [][][][]

        boolean x = true;//x->[]

        //reference type
        String s = "Hello JAVA";

        int k = 8;
        int h = k;
        /*
        k->[][][][8]
        h->[][][][8]
         */
        String str = "Hello";
        String str1 = str;
        String str2 = str1;
        System.out.println(str2);
        /*  str1 _> smotri tuda zhe, kuda smotrit str
            str -> ["Hello"]
            str1 ->["Hello"]
            str2 -> ["Hello"]
         */


    }
}
