package com.tuapellido.tunombre.usolayoutsv4

class Agenda {
    private val contactos = mutableListOf<Contacto>()
    fun agregarContacto(contacto: Contacto) {
        contactos.add(contacto)
        println("Contacto agregado: ${contacto.nombre}")
    }
    fun listarContactos() {
        println("Lista de Contactos:")
        for (contacto in contactos) {
            println("Nombre: ${contacto.nombre}, Teléfono: ${contacto.telefono}, Email: ${contacto.email}")
        }
    }
    fun buscarContacto(nombre: String) {
        val encontrados = contactos.filter { it.nombre.contains(nombre, ignoreCase = true) }
        if (encontrados.isEmpty()) {
            println("No se encontraron contactos con el nombre '$nombre'")
        } else {
            println("Contactos encontrados:")
            for (contacto in encontrados) {
                println("Nombre: ${contacto.nombre}, Teléfono: ${contacto.telefono}, Email: ${contacto.email}")
            }
        }
    }
}
