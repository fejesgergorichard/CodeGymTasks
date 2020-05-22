package com.codegym.task.task17.task1707;

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        // Class-level synchronization
        synchronized (IMF.class) {
            // Initialize imf only when it is null (singleton design pattern)
            if (imf == null) {
                imf = new IMF();
            }
            return imf;
        }
    }

    private IMF() {
    }
}
