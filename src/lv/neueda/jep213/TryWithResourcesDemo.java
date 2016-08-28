package lv.neueda.jep213;

class TryWithResourcesDemo {
    void tryThis() {
        try (MiClosable closable = new MiClosable()) {
            closable.doStuff();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
