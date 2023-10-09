import static java.lang.StringTemplate.STR;

@FunctionalInterface
interface MessageStrategy {
    String execute(String message);
}

class SayHelloJava {
    private final MessageStrategy strategy;

    public SayHelloJava(MessageStrategy strategy) {
        this.strategy = strategy;
    }

    public void print(String message) {
        System.out.println(strategy.execute(message));
    }
}


public class StrategyJava {
    public static void main(String[] args) {
        SayHelloJava addMessage = new SayHelloJava(message -> STR. "say \{ message } 😎" );
        SayHelloJava toLowerCase = new SayHelloJava(String::toLowerCase);
        SayHelloJava toUpperCase = new SayHelloJava(message -> message.toUpperCase());
        SayHelloJava toReverse = new SayHelloJava((String message) -> new StringBuilder(message).reverse().toString());

        addMessage.print("Hello World !");
        toLowerCase.print("Hello World !");
        toUpperCase.print("Hello World !");
        toReverse.print("Hello World !");
    }
}