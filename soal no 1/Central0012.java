/*Nama : Indah Nirwana
Nim : 13020210012
Kelas : B1*/

interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0012 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0012 obj = new Central0012();
        System.out.println("main");
        obj.aaa();
    }
}
