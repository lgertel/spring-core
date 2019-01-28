package br.com.grts.springcore.controllers;

import br.com.grts.springcore.services.GreetingService;
import br.com.grts.springcore.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

  private GreetingService greetingService;

  public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
