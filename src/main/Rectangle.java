package main;

public class Rectangle extends Figure implements Randomable{
    private Integer sideA;
    private Integer sideB;

    public Rectangle(Integer sideA, Integer sideB) throws SideSizeException {
        this.sideA = sideA;
        this.sideB = sideB;
        if (sideA.equals(sideB)) {
            throw new SideSizeException("Side A have to not be smaller then to side B");
        }
    }

    public Integer getSideA() {
        return sideA;
    }

    public Integer getSideB() {
        return sideB;
    }

    public void setSideA(Integer sideA) {
        this.sideA = sideA;
    }

    public void setSideB(Integer sideB) {
        this.sideB = sideB;
    }

    @Override
    Integer getArea() {
        return this.sideA * this.sideB;
    }

    @Override
    Integer getHigh() {
        return this.sideA;
    }

    @Override
    public String print(){
        return "Side A: " + this.sideA + ", side B: " + this.sideB;
    }
}
