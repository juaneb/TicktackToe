package usantatecla.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.openMocks;
import org.mockito.MockedStatic;

import usantatecla.tictactoe.views.Message;

@ExtendWith(MockitoExtension.class)
public class MenuTest {

    private String[] comandos = {"Opción 1","Opción 2","Opción 3"};

    @InjectMocks
    private Menu menu;

    @Mock
    private Console console;

    @BeforeEach
    void before() {        
        openMocks(this);
    }

    @Test
    void testGivenArrayStringWithZeroOptionsThenWriteLengthArrayString() {
        try (MockedStatic console = mockStatic(Console.class)) {            
            console.when(Console::getInstance).thenReturn(this.console);
            menu.execute(comandos);            
            verify(this.console, times(comandos.length)).writeln(anyString());           
        }

    }

}
