package lv.neueda.jep213;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class SafeVarargsDemo {
    // @SafeVarargs
    SafeVarargsDemo(List<String>... stringLists) {
    }

    // @SafeVarargs
    static void doStuff(Consumer<String>... consumers) {
    }

    // @SafeVarargs
    final void doMoreStuff(Supplier<String>... suppliers) {
    }

    // @SafeVarargs
    private void doEvenMoreStuff(Function<Integer, String>... functions) {

    }
}
