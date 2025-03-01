abstract class a{
    abstract void greet();
}
class b extends a{
    void greet(){
        System.out.println("Hello");
}
}

public class hello {
public static void main (String[] args) {
    b greeting = new b();
    greeting.greet();
}
}