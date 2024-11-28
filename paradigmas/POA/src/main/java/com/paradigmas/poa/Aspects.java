package com.paradigmas.poa;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspects {
	@Before("execution(* *.*(..))")
	public void enTodosLosMetodos() {
		System.out.println("Yo estoy antes del método :D");
	}
	
	@After("execution(* com.paradigmas.demo.Empleado.*(..))")
	public void todosMetodosEmpleado() {
		System.out.println("Hola estoy después de los métodos de empleadooooooo");
	}
	
	@Before("execution(String *.* (..))")
	public void todosMetodosReturnString() {
		System.out.println("Metodos que retornan String");
	}
}
