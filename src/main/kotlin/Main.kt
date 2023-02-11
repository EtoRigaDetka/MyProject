fun main() {

//    *************
//    .***********
//    ..*********
//    ...*******
//    ....*****
//    .....***
//    ......*

    var space=""
    for (i in 7 downTo 1) {
        print(space)
        for (j in i*2-1 downTo 1  ) {

            print("*")
        }
        println()
        space = space + "."
    }
}
