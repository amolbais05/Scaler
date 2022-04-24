package builder;

public class Sandwich {

    private int numOfPickle;
    private int numOfOnion;
    private int numOfBreads;

    private Sandwich() {}

    public Sandwich(int numOfPickle, int numOfOnion, int numOfBreads) {
        this.numOfPickle = numOfPickle;
        this.numOfOnion = numOfOnion;
        this.numOfBreads = numOfBreads;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public int getNumOfPickle() {
        return numOfPickle;
    }

    public int getNumOfOnion() {
        return numOfOnion;
    }

    public int getNumOfBreads() {
        return numOfBreads;
    }

    public static class Builder {

        private int numOfPickle;
        private int numOfOnion;
        private int numOfBreads;

        public int getNumOfPickle() {
            return numOfPickle;
        }

        public Builder setNumOfPickle(int numOfPickle) {
            this.numOfPickle = numOfPickle;
            return this;
        }

        public int getNumOfOnion() {
            return numOfOnion;
        }

        public Builder setNumOfOnion(int numOfOnion) {
            this.numOfOnion = numOfOnion;
            return this;
        }

        public int getNumOfBreads() {
            return numOfBreads;
        }

        public Builder setNumOfBreads(int numOfBreads) {
            this.numOfBreads = numOfBreads;
            return this;
        }

        public Sandwich build(){
            return new Sandwich();
        }
    }
}
