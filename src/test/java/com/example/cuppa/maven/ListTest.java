package com.example.cuppa.maven;

import static org.assertj.core.api.Assertions.assertThat;
import static org.forgerock.cuppa.Cuppa.*;

import java.util.Arrays;
import java.util.List;

import org.forgerock.cuppa.Test;

@Test
public class ListTest {
    {
        describe("List#indexOf", () -> {
            it("returns -1 when the value is not present", () -> {
                List<Integer> list = Arrays.asList(1, 2, 3);
                assertThat(list.indexOf(5)).isEqualTo(-1);
            });
        });
    }
}
