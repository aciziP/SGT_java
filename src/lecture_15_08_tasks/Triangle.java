package lecture_15_08_tasks;

public class Triangle {

    //Fields
    private double sideA;
    private double sideB;
    private double sideC;

    //Set methods

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    //Getter methods

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    //Private method

    private boolean isValid(double sideA, double sideB, double sideC){
        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    //Public method

    public double areaTriangle(){
        if(isValid(sideA,sideB,sideC)){
            double p = (sideA+sideB+sideC)/2;
            double area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
            return area;
        }else {
            System.out.println("Triangle is not valid");
            return 0.00;
        }
    }

}
