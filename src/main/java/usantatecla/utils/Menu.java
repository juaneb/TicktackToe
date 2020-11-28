package usantatecla.utils;

import usantatecla.tictactoe.views.Message;

public class Menu {  

  public Menu() {    
  }

  protected void execute(String[] comandos) {  
        if (comandos != null){
            for (int i = 0; i < comandos.length; i++) {
                Console.getInstance().writeln((i + 1) + ") " + comandos[i]);
            }
        }
  }

}

