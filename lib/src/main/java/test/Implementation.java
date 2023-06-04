package test;

interface Recursive<A, B> {}

public final class Implementation
        implements Recursive<Implementation.Inner, Implementation> {

    public static class Inner implements Recursive<Inner, Implementation> {
    }
}