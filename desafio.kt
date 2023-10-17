// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
val listConteudoEducacionais : MutableList<ConteudoEducacional> = mutableListOf()
val listConteudos : List<ConteudoEducacional> = listConteudoEducacionais

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
       inscritos.add(usuario) 
    }
    
     
}

fun addConteudoEducacional(conteudo: ConteudoEducacional) {
    listConteudoEducacionais.add(conteudo)
}

fun getConteudoEducacional(): List<ConteudoEducacional> {
    return listConteudos
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
   	
    // Criar um conteudo educacional
    var conteudo1 = ConteudoEducacional("Kotlin basico", nivel = Nivel.BASICO)
    var conteudo2 = ConteudoEducacional("Kotlin intermediário", nivel = Nivel.INTERMEDIARIO)
    var conteudo3 = ConteudoEducacional("Kotlin avançado", nivel = Nivel.AVANCADO)
    
    addConteudoEducacional(conteudo1)
    addConteudoEducacional(conteudo2)
    addConteudoEducacional(conteudo3)
    
    getConteudoEducacional().forEach{
        c -> println(c)    
    }
    
    var formacao = Formacao("Bootcamp Kotlin", listConteudos)
        
    val usuario1 = Usuario("Marco")
    val usuario2 = Usuario("José")
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    
    println("A Formação ${formacao.nome} contém os seguintes conteúdos")
    listConteudos.forEach{
        c -> println("Nome ${c.nome} com duração de ${c.duracao} e nível de ${c.nivel}")
    }
    
    println("E já possui ${formacao.inscritos.size} inscritos")
    
    for (usuario in formacao.inscritos) {
        println("Nome: ${usuario.nome}")
    }
}
