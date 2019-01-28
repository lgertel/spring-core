package br.com.grts.springcore;

import br.com.grts.springcore.controllers.ConstructorInjectedController;
import br.com.grts.springcore.controllers.GetterInjectedController;
import br.com.grts.springcore.controllers.MyController;
import br.com.grts.springcore.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SpringCoreApplication.class, args);

    MyController bean = (MyController) ctx.getBean("myController");
    bean.hello();

    System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
    System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
    System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
  }

}

