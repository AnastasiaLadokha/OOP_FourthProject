package ua.cn.stu.cs.oop.lab.lab4.model;

public class Waste implements IWeight {
    private float weight;

    @Override
    public float weight() {
        return weight;
    }

    public Waste(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Waste{" +
                "weight=" + weight +
                '}';
    }
}
