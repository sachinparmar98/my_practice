public class A {
    public String toString() {
        return "ram";
    }
}

class Only1OnePublicClassInFile {
    public static void main(String ar[]) {
        A a1 = new A();
        System.out.println(a1);
        System.out.println(a1.toString());
    }
}
/*
 * toS5.java:1: error: class A is public, should be declared in a file named
 * A.java
 * public class A {
 * ^
 * 1 error
 * 
 * 
 * Solution==jis class ko public declare kiya ha sirf usi class ka name sa hi
 * file name ko save ker sakta ha
 * nhi too error ayga
 * 
 * 
 * 
 */
