package com.paradigmas.demo;

import org.springframework.stereotype.Component;

@Component
public class Empleado {
	public void listarEmpleado() {
		System.out.println("--Listad de empleados ---");
		// toda la logica
	}
	
	public String mostrarEmpleado() {
		return "--empleado buscado--";
	}

	public void eliminarEmpleado(String nombre) {
		System.out.println("--empleado eliminado--");
	}
}
