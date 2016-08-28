package lv.neueda.jep213;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class TryWithResourcesDemo {
    void tryThis() {
        try (InputStream is = new FileInputStream(new File("notpornatall.mov"))) {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
