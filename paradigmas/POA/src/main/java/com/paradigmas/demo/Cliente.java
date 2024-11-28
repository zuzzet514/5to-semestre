package com.paradigmas.demo;

import org.springframework.stereotype.Component;

@Component
public class Cliente {
	public void listarCliente() {
		System.out.println("--Listad de cluentes ---");
		// toda la logica
	}
	
	public String mostrarCliente() {
		return "--Cliente buscado--";
	}

	public void eliminarCliente(String nombre) {
		System.out.println("--Cliente eliminado--");
	}
}
