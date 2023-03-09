package by.itacademy.courses.hw8.task3;
public enum Sizes {
    XXS(42),
    XS(44),
    S(46),
    M(48),
    L(50),
    XL(52),
    XXL(54),
    XXXL(56);
    public int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }
    @Override
    public String toString() {
        return name() + "(" + euroSize + ") ";
    }
}

