package training;
public class Test { 
Test() {
this(10);
System.out.println("No-arg constructor");
}
Test(int i) {
this(10.5);
System.out.println("int-arg");
}
Test(double d) {
System.out.println("double-arg");
}
public static void main(String arg[]) {
Test t1 = new Test();
Test t2 = new Test(10);
Test t3 = new Test(20.5);
Test t4 = new Test('a');
Test t5 = new Test(10l);

 
}

}