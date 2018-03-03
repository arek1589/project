package pl.sda.spring.domain;


public class HelloWorldImpl implements HelloWorld {

    private String word;

    public HelloWorldImpl(String word) {
        this.word = word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void sayHello() {
        System.out.println("Hello " + word);
    }

}
