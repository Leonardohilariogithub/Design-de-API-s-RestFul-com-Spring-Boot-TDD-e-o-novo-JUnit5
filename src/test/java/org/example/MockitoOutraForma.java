package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MockitoOutraForma {

    @Mock
    List<String> lista;


    @Test
    public void primeiroTestMockito(){

        Mockito.when(lista.size()).thenReturn(20);

        int size = lista.size();

        //verificação
        Assertions.assertThat(size).isEqualTo(20);

    }
}