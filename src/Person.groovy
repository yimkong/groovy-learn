/**
 * author yg
 * description 
 * date 2020/5/12
 */
class Person {
    String name;
    void print(){
        println "hello ${name}"
    }
    static void main(String[] arg){
        println("hello world")
        test()
    }

    static void test() {
        println "hello static"
    }
}
