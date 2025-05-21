package com.tuapellido.tunombre.usolayoutsv4

fun main() {
    val agenda = Agenda()
    val contacto1 = Contacto("Vania", "931800893", "sonalysifuentes@gmail.com")
    val contacto2 = Contacto("Adrian ", "987654321", "adrianpinillos@gmail.com")
    agenda.agregarContacto(contacto1)
    agenda.agregarContacto(contacto2)
    println()
    agenda.listarContactos()
    println()
    agenda.buscarContacto("Vania")
    agenda.buscarContacto("Carlos") // No existe
}
