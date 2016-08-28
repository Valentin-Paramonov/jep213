package lv.neueda.jep213;

class MiClosable implements AutoCloseable {
    void doStuff() {
        System.out.println("Did done");
    }

    @Override
    public void close() throws Exception {
        System.out.println("closed");
    }
}