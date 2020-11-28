package usantatecla.utils;

import usantatecla.tictactoe.views.Message;

public class Menu {  

  public Menu() {    
  }

  protected void execute(String[] comandos) {  
        if (comandos != null){
          
          Console console = Console.getInstance();
          int option;          

            for (int i = 0; i < comandos.length; i++) {
                console.writeln((i + 1) + ") " + comandos[i]);
            }

            option = console.readInt("Elige opción ") - 1;
        }
        


  }

}

