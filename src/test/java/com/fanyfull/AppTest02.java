package com.fanyfull;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest02 {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void justAnExample() {
        System.out.println("full test");
        Assertions.assertThat("App").endsWith("pp");
    }


    @Test
    public void exampleTest02() {
        System.out.println("full test02");
        Assertions.assertThat("App").endsWith("pp");
    }
}
