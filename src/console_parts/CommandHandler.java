package console_parts;

import Exceptions.NotCommandExcep;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Класс, для обработки священных литаний во обращения к богу машин
 */
public class CommandHandler {
  public CommandHandler(){}

  public static void Handle(String str) throws NotCommandExcep {
    String[] PartsOfStr =  str.split(" ");

    try {
      CommandsEn.valueOf(PartsOfStr[1]);
    } catch (IllegalArgumentException e){
      throw new NotCommandExcep("Данная строка не является частью литаний",PartsOfStr[1]);
    }

    switch (CommandsEn.valueOf(PartsOfStr[1]).name()){
      case

    }


  }

  }
