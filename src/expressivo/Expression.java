package expressivo;

/**
 * An immutable data type representing a polynomial expression of:
 *   + and *
 *   nonnegative integers and floating-point numbers
 *   variables (case-sensitive nonempty strings of letters)
 * 
 * Concrete syntax such as parentheses and whitespace is not represented in the AST.
 */
public interface Expression {
    
    // Datatype definition
    // Expression = Number(n: double) + Variable(name: String) + Add(left: Expression, right: Expression) + Multiply(left: Expression, right: Expression)
    
    /**
     * Parse an expression.
     * @param input expression to parse, as defined in the PS3 handout.
     * @return expression AST for the input
     * @throws IllegalArgumentException if the expression is invalid
     */
    public static Expression parse(String input) {
        // Parsing logic to be implemented separately
        throw new RuntimeException("unimplemented");
    }
    
    @Override 
    public String toString();

    @Override
    public boolean equals(Object thatObject);
    
    @Override
    public int hashCode();
}
