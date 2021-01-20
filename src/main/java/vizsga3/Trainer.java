package vizsga3;

class A {
    String s = "-";
    protected A() { this("d"); s += "a"; }
    private A(String e) { s += "d"; }
}

class B extends A {
    B() { super(); s += "b"; }
}

class C extends B {
    C() { s += "c"; }
    public static void main(String... boo) {
        System.out.println((new C()).s);
    }
}
