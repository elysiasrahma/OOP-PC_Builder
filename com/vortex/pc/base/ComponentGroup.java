package com.vortex.pc.base;
import java.util.List;

public class ComponentGroup {
    private List<? extends Component> components;

    public ComponentGroup(List<? extends Component> components) {
        this.components = components;
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Component component : components) {
            total += component.calculatePrice();
        }
        return total;
    }
}
