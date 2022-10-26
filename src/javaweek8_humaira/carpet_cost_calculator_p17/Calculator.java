package javaweek8_humaira.carpet_cost_calculator_p17;

public class Calculator {
    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return (floor.getArea() * carpet.getCost());
    }

}
