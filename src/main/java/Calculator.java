public record Calculator(String expression) {
    public int evaluate() {
        return 0;
    }

    public static void main(String[] args) {
        var expression = String.join(" ", args);
        System.out.printf("%s = %s%n", expression, new Calculator(expression).evaluate());
    }
}
