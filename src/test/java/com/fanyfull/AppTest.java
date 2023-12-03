package com.fanyfull;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void justAnExample() {
        System.out.println("fany test");
        Assertions.assertThat("App").endsWith("pp");
    }


    @Test
    public void exampleTest02() {
        System.out.println("fany test02");
        Assertions.assertThat("App").endsWith("pp");
    }
}
