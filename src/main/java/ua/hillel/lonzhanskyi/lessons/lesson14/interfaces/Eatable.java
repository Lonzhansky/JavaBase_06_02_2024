package ua.hillel.lonzhanskyi.lessons.lesson14.interfaces;

public interface Eatable {

    void eat();

    default void defaultMethod() {
        System.out.println("its defaultMethod from Eatable");
    }

}
