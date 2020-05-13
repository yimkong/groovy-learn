package io

/**
 * author yg
 * description 
 * date 2020/5/13
 */
class TestCopy {
    static void main(String[] args) {
        def file = new File("test.txt")
        def file1 = new File("test1.txt")
        file1 << file.text
    }
}
