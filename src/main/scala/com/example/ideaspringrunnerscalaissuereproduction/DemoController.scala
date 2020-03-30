package com.example.ideaspringrunnerscalaissuereproduction

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class DemoController {

  @RequestMapping(name = "/")
  def index() = "Hello"

}
