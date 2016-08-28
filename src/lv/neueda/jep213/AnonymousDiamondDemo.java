package lv.neueda.jep213;

class AnonymousDiamondDemo {
    interface Clazz<T> {}

    void doThis() {
        new Clazz<>() {};
    }
}
