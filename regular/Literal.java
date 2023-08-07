package regular;

public final class Literal implements Expression { // 마지막 코드야 상수야 라는 의미

    private char character;

    public Literal(char c) {
        this.character = c;
    }

    public char getCharacter() {
        return character;
    }

    @Override
    public String toString() {
        return String.valueOf(character);
        // Integer v = Integer.valueOf(character);
    }

}
