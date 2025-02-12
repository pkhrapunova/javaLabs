package lab3_2_2sem;

public class Material {
    private String name;
    private double cost;
    Categories categories;

    public Material(String name, double cost, Categories categories) {
        this.name = name;
        this.cost = cost;
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", cost=" + cost +
                ", categories=" + categories.toString();
    }
}
