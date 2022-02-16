package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class MockitoTest {

    @Test
    public void primeiroTestMockito(){

        List<String> lista = Mockito.mock(ArrayList.class);

        Mockito.when(lista.size()).thenReturn(20);

        int size = lista.size();

        //verificação
        Assertions.assertThat(size).isEqualTo(20);

    }
}
