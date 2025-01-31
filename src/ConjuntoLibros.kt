
class ConjuntoLibros() {

    private var lista: Array<Libro?> = Array(3) { null }

    fun anadirLibro(libro: Libro) {
        lista.forEachIndexed { index, elemento ->
            if (elemento == null ) {
                lista[index] = libro
                return@forEachIndexed
            }
        }
    }

    fun eliminarLibro(campo: String) {
        lista.forEachIndexed { index, elemento ->
            if (elemento?.autor == campo || elemento?.titulo == campo ) {
                lista[index] = null
                return@forEachIndexed
            }
        }
    }

    fun mostrarLibro() {
        var minimo = lista.filterNotNull().minOfOrNull { it.calificacion }
        var maximo = lista.filterNotNull().maxOfOrNull { it.calificacion }

        println("¿Quiéres el libro con mayor calificacion o con la menor? (mayor/menor) »» ")
        val opcion = readln().trim(' ')

        when (opcion) {
            "menor" -> println("El de menos nota es $minimo")
            "mayor" -> println("El de mayor nota es $maximo")
        }
    }

    fun mostrarTodo() {
        lista.forEach { libro ->
            if (libro != null) {
                println("Titulo: ${libro?.titulo} | Autor: ${libro?.autor} | Número de páginas: ${libro?.numPaginas} | Calificación: ${libro?.numPaginas}")
            }
        }
    }

}