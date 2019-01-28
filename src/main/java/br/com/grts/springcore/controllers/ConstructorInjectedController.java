package br.com.grts.springcore.controllers;

import br.com.grts.springcore.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

  private GreetingServiceImpl greetingService;

  @Autowired
  public ConstructorInjectedController(GreetingServiceImpl greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
