package br.com.grts.springcore.controllers;

import br.com.grts.springcore.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {

  private GreetingService greetingService;

  public String sayHello() {
    return greetingService.sayGreeting();
  }

  @Autowired
  @Qualifier("getterGreetingService")
  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }
}
