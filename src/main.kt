
fun main() {

    val libro1 = Libro("Harry Potter y la Piedra filosofal", "J.K.Rowling", 130, 10)
    val libro2 = Libro("Harry Potter y la Camara de los Secretos", "J.K.Rowling", 156, 10)

    val conjunto1 = ConjuntoLibros()

    conjunto1.anadirLibro(libro1)
    conjunto1.anadirLibro(libro2)

    conjunto1.eliminarLibro("Harry Potter y la Camara de los Secretos")

    conjunto1.mostrarTodo()
}