package usantatecla.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.openMocks;

import java.util.List;

import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import usantatecla.tictactoe.views.console.Command;



@ExtendWith(MockitoExtension.class)
public class MenuTest {
    
    private List<Command> commandList;

    @InjectMocks
    private Menu menu;

    @Mock
    private Console console;

    @BeforeEach
    void before() {
        openMocks(this);
    }

    @Test
    void testGivenArrayStringWithLengthOptionsThenWriteLengthArrayString() {
        try (MockedStatic console = mockStatic(Console.class)) {
            console.when(Console::getInstance).thenReturn(this.console);
            menu.execute(commandList);
            verify(this.console, times(commandList.size())).writeln(anyString());
        }

    }

    @Test
    void testGivenArrayStringWithLengthOptionsChoseOneOptionThenWriteLengthArrayString() {
        try (MockedStatic console = mockStatic(Console.class)) {
            when(this.console.readInt(anyString())).thenReturn(1);
            console.when(Console::getInstance).thenReturn(this.console);
            menu.execute(commandList);
            verify(this.console, times(commandList.size())).writeln(anyString());
        }

    }

}
