package com.java.yea.springfeature.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.servlet.http.HttpServletMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.java.yea.springfeature.ws.GreetingService;


@WebService(serviceName="GreetingService")
public class GreetingServiceEndpoint extends SpringBeanAutowiringSupport  {

 @Autowired
 private GreetingService greetingService;
 
 @WebMethod
 public String sayHello() {
  return greetingService.sayHello();
 }
 
}