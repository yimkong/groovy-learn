/**
 * author yg
 * description 
 * date 2020/5/12
 */
class Person {
    String name;
    int print(){
        println "hello ${name}"
        return 3
    }
    def shout() {
        println("hey i am ${name}")
    }

    static def methodWithDefaultParam(int i, int j = 5) {
        println(i+j)
    }
    static void main(String[] arg){
        println("hello world")
        test()
        def a=3
        println('hey,a:'+a)
        def person = new Person()
        person.setName("Boieno")
        person.shout()
        methodWithDefaultParam(3)
        methodWithDefaultParam(3,3)
    }

    static void test() {
        println "hello static"
    }
}
