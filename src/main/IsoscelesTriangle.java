package main;

public class IsoscelesTriangle extends Figure implements Randomable {
    private Integer sideA;
    private Integer sideB;
    private Integer sideC;

    public IsoscelesTriangle(Integer sideA, Integer sideB, Integer sideC) throws SideSizeException {
        this.sideA = sideA;
        this.sideB = sideB;
        if (!sideA.equals(sideB)) {
            throw new SideSizeException("Side A have to be equals to side B");
        }
        this.sideC = sideC;
    }

    public Integer getSideA() {
        return sideA;
    }

    public Integer getSideB() {
        return sideB;
    }

    public Integer getSideC() {
        return sideC;
    }

    public void setSideA(Integer sideA) {
        this.sideA = sideA;
    }

    public void setSideB(Integer sideB) {
        this.sideB = sideB;
    }

    public void setSideC(Integer sideC) {
        this.sideC = sideC;
    }

    @Override
    public Integer getArea() {
        this.area  = 1/2 * (this.sideC * this.getHigh());
        return this.area;
    }

    @Override
    public Integer getHigh() {
        this.high = (int) Math.sqrt(this.sideA * this.sideA) -  (this.sideB * this.sideB) / 4;
        return this.high;
    }

    @Override
    public String print(){
        return "Side A: " + this.sideA + ", side B: " + this.sideB + ", side C: " + this.sideC;
    }
}