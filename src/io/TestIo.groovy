package io

/**
 * author yg
 * description 
 * date 2020/5/12
 */
class TestIo {
    static void main(String[] args) {
        def file = new File("test.txt")
        file.eachLine { line->println("line:$line")}
        println("=================")
        println(file.text)
        def writer = file.newWriter('utf-8', true)
        writer.writeLine("i am back!")
        writer.flush()
        writer.close()
    }
}
