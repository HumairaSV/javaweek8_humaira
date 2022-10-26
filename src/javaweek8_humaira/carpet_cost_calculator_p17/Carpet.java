package javaweek8_humaira.carpet_cost_calculator_p17;

public class Carpet {
    double cost;

    public Carpet(double cost){
        if(cost<0){
            this.cost= 0;
        }else{
            this.cost = cost;
        }
    }public double getCost(){
        return cost;
    }
}
