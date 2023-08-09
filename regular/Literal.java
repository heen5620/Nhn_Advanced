package regular;

public final class Literal implements Expression { // 마지막 코드야 상수야 라는 의미

    private char character;

    public Literal(char c) {
        this.character = c;
    }

    public char getCharacter() {
        return character;
    }

    // @Override
    // public String toString() { // toString은 엮으면 안됌, 현재 구현이 안되어있는 것이 돌려주는 것, toString은 String만
    // 돌려준다는
    // // 제약임
    // return String.valueOf(this.getCharacter());
    // // Integer v = Integer.valueOf(character);
    // }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
