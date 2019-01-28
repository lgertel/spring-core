package br.com.grts.springcore;

import br.com.grts.springcore.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SpringCoreApplication.class, args);

    MyController bean = (MyController) ctx.getBean("myController");
    bean.hello();
  }

}

