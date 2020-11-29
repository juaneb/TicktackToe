package usantatecla.utils;

import java.util.List;
import usantatecla.tictactoe.views.console.Command;

public class Menu {  

  

  public Menu() {    
  }

  protected void execute(List<Command> comandos) {  
        if (comandos != null){
          
          Console console = Console.getInstance();
          int option;          

            for (int i = 0; i < comandos.size(); i++) {
                console.writeln((i + 1) + ") " + comandos.get(i));
            }

            option = console.readInt("Elige opción ") - 1;

        }
  }

}

