public class Pair<A,B> {
    private A first;
    private B second;

    /**
     * Constructor to force initial values to be passed in upon instantiation
     */

    public Pair(A a, B b){
        first = a;
        second = b;

    }
    public A getFirst(){
        return first;
    }

    public B getSecond(){
        return second;

    }

}
