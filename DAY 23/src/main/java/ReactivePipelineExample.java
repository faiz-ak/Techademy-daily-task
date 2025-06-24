import reactor.core.publisher.Flux;

public class ReactivePipelineExample {
    public static void main(String[] args) {

        Flux<String> nameFlux = Flux.just("Ram", "Sita", "Lakshman", "Hanuman", "Ravan");

        nameFlux
            .filter(name -> name.length() > 4)
            .map(String::toUpperCase)
            .subscribe(
                name -> System.out.println("Name: " + name),
                error -> System.err.println("Error: " + error),
                () -> System.out.println("All names processed!")
            );
    }
}

