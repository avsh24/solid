package com.solid.osp.shape_ocp_violation;

public class Main {
    public static void main(String[] args) {
        var rect1 = new Rectangle(10, 5);
        var rect2 = new Rectangle(20, 37.3);

        var ac = new AreaCalculator();
        System.out.println(ac.areaCalc(rect1, rect2));
    }
}
