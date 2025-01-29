
class ConjuntoLibros(lista: Array<Libro?>) {

    var lista: Array<Libro?> = Array(3) { null }

    fun anadirLibro(libro: Libro) {
        lista.forEachIndexed { index, elemento ->
            if (elemento == null ) {
                lista[index] = libro
                return@forEachIndexed
            }
            else {
                println("No se ha podido agregar ningún libro")
            }
        }
    }

    fun eliminarLibro(campo: String) {
        lista.forEachIndexed { index, elemento ->
            if (elemento?.autor == campo || elemento?.titulo == campo ) {
                lista[index] = null
                return@forEachIndexed
            }
            else {
                println("No se ha podido encontrar/eliminar el libro")
            }
        }
    }


    fun mostrarLibro() {
        var minimo = lista.filterNotNull().minOfOrNull { it.calificacion }
        var maximo = lista.filterNotNull().maxOfOrNull { it.calificacion }

        println("")

    }

    fun mostrarTodo() {
        lista.forEach { libro ->
            println("Titulo: ${libro?.titulo} | Autor: ${libro?.autor} | Número de páginas: ${libro?.numPaginas} | Calificación: ${libro?.numPaginas}")
        }
    }

}