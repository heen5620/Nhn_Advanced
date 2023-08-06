package practice;

import Urisu.mathxx;

// How to design a type// (1) primitive operation to define a (data) type (set)
// - ADT (abstraction data type, where primitives = abstraction barrier)
// abstraction barrier
// (2) combinatations (combinational, opersatins) e.g) add,multipl
public class Fractional extends Number {

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numerator;
        result = prime * result + denomiator;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;
        Fractional other = (Fractional) obj;
        return this.equals(other);
    }

    public boolean equals(Fractional that) { // 얘는 Overide가 안됌. 자바에서 타입을 하나 만들면 오브젝트의 서브타입이다.
        if (this == that)
            return true;
        if (that == null)
            return false;
        return this.getNumerator() == that.getNumerator()
                && this.getDenomiator() == that.getDenomiator();
    }

    private int numerator; // 선언은 없던 이름을 드러낸다? 직접 지정하면 안되니깐 private로 지정한다.
    private int denomiator; //

    public Fractional(int numerator, int denomiator) { // 원래 static이 있는게 맞음 이유는 아래 메소드 들이 기능하기 위해서
                                                       // 필요한 값들을 받아와야하기 때문?
        if (denomiator == 0)
            throw new IllegalArgumentException("Bonnja is 0! ");
        this.numerator = numerator;
        this.denomiator = denomiator;
        normalize();
        // classInvariant(rep); 직접 구현하는 것이 우리의 숙제. / 제대로된 유리수인지 판별하는
    }

    public int getNumerator() { // getter
        return this.numerator;
    } // 분자 //selector //getter

    public int getDenomiator() { // getter
        return this.denomiator;
    } // 분모 //getter

    private void normalize() { // 내부 연산
        int g = mathxx.gcd(this.numerator, this.denomiator);
        numerator /= g;
        denomiator /= g;
    }

    public Fractional add(Fractional r) { // 왜 this인지, Fractional 메서드에서 원래 static을 사용해야하는지? ,
                                          // 사용자가 받아와야하는 것에 대한 접근지정자는 public으로 사용해야한다.
        return new Fractional(
                this.getNumerator() * r.getDenomiator() + r.getNumerator() * this.getDenomiator(),
                this.getDenomiator() * r.getDenomiator());
    }

    @Override
    public String toString() {
        return this.getNumerator() + "/" + this.getDenomiator();
    }

    @Override
    public int intValue() {
        return (int) this.longValue();
    }

    @Override
    public long longValue() {
        return (long) (this.getNumerator()) / (this.getDenomiator());
    }

    @Override
    public double doubleValue() {
        return (double) this.getNumerator() / (double) this.getDenomiator();
    }

    @Override
    public float floatValue() {
        return (float) this.doubleValue();
    }

}
