package segundo;

import primero.A;

class C {

    A a = new A();
    B b = new B(a.numero, "Stefan");

    void pintaB() {
        b.info();
    }
    
}
