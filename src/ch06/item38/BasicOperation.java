package ch06.item38;


//ENUM 형은 기본적으로 계승이 안된다!!(상속)
//계승이 되는거처럼 흉내 내려면 인터페이스를 만들어서 같은 인터페이스를 implements 할수 있다.
public enum BasicOperation implements Operaiton {
    PLUS("+") {
        public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        public double apply(double x, double y) { return x / y; }
    };

    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override public String toString() {
        return symbol;
    }
}
