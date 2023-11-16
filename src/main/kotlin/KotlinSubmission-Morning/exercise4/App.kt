package id.infinitelearning.KotlinSubmission.exercise4

/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini
fun validateAndsayHello(nama: String){
    if (nama.isBlank()){
        throw IllegalArgumentException("Nama is blank")
    } else {
        println("Hello $nama")
    }
}

fun main(){
    try {
        validateAndsayHello("Asfia")
        validateAndsayHello("")
    } catch (error: IllegalArgumentException){
        println("Terjadi Error: ${error.message}")
    }
}