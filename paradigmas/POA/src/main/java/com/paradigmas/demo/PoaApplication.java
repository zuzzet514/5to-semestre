package com.paradigmas.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.paradigmas.poa.Configurador;

public class PoaApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configurador.class);
		
		Cliente cliente = contexto.getBean("cliente", Cliente.class);
		System.out.println(cliente.mostrarCliente());
		
		System.out.println("----------------------\n");
		
		Empleado empleado = contexto.getBean("empleado", Empleado.class);
		empleado.listarEmpleado();
		
		System.out.println("----------------------\n");
		System.out.println(empleado.mostrarEmpleado()); // "empleado.mostrarEmpleado()" se termina antes de que se ejecuta el sout
		
		System.out.println("----------------------\n");
		empleado.eliminarEmpleado("jordain");
	}

}
