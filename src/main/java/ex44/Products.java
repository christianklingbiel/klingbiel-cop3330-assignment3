package ex44;

import java.util.ArrayList;

public class Products<Product> {
    private ArrayList<Product> products;

    private StringBuilder stringRepr;

    public <product> Product searchByName(String name){
        product match = null;
        for(Product p : products){
            //if(p.name.equalsIgnoreCase(name)){
                //match = (product) p;
            //}
        }
        return (Product) match;
    }

    @Override
    public String toString(){
        stringRepr = new StringBuilder();
        for(Product p : products){
            stringRepr.append(p.toString());
            stringRepr.append("\n");
        }
        return stringRepr.toString();
    }
}
