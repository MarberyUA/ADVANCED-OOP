package main;

public class Square extends Figure implements Randomable {
    private Integer sideA;
    private Integer sideB;

    public Square(Integer sideA, Integer sideB) throws SideSizeException {
        this.sideA = sideA;
        this.sideB = sideB;
        if (!sideA.equals(sideB)) {
            throw new SideSizeException("Side A have to be equals to side B");
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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public Integer getArea() {
        this.area = this.sideA * this.sideB;
        return this.area;
    }

    @Override
    public Integer getHigh() {
        this.high = this.sideA;
        return this.high;
    }

    @Override
    public String print(){
        return "Side A: " + this.sideA + ", side B: " + this.sideB;
    }
}
