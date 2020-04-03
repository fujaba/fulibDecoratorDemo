package uniks.shopping;

import org.fulib.builder.ClassModelDecorator;
import org.fulib.builder.ClassModelManager;

public class TheModel implements ClassModelDecorator
{
   @Override
   public void decorate(ClassModelManager mm)
   {
      System.out.println("Hello from the model manager");
      mm.haveClass("Store");
   }
}
