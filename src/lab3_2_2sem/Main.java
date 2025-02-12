package lab3_2_2sem;

import jdk.jfr.Category;

public class Main {
    public static void main(String[] args) {
        Master master = new Master("sfb","jhg","+987654","jhgfiuytr");
        Client client= new Client("ggghh","jgbjgb","+34567890");
        Material material = new Material("hgf",456,Categories.LIPSTICK);

        System.out.println(material.toString());
    }
}
