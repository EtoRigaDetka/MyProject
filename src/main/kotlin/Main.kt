data class Student(val name: String, val ids: Int, var grade: Double = 1.0)
    val student1 = Student("Georgijs", 111)
    val student2 = Student("Dmitrij", 222)

    val listOfStudents = listOf<Student>(student1, student2)


fun  getStudentById(ids: Int): Student? {

      return listOfStudents.find { it.ids == ids } !!

    }
fun searchStudentByName(name: String):Student?{
    return listOfStudents.find { it.name.lowercase()==name.lowercase() }
}


fun main() {
    print("Hello ,insert students IDS")
    val id = readln().toInt()
    var student =getStudentById(id)
    println(student)
    println("Insert name of student ")
    var name =readln()
    student=searchStudentByName(name)
    println(student?:"the student is not found")
}

