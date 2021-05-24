package bai12_java_collection_framework.bai_tap.ltarraylist_linkedlist;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPriceProduct()>o2.getPriceProduct()){
            return 1;
        }else if (o1.getPriceProduct()==o2.getPriceProduct()){
            return 0;
        }else {
            return -1;
        }
    }
}
