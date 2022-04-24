package builder;

public class Client {

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich(1,2,2);

        Sandwich builder = Sandwich.getBuilder()
                                    .setNumOfPickle(1)
                                    .setNumOfOnion(0)
                                    .setNumOfBreads(2)
                                    .build();

    }


}
