package ArrayExpt1;

import java.util.ArrayList;

public class PrintArray {

    private StringBuilder values;
    private ArrayList<Character> items;

    public PrintArray(int numItems, String values) {
        this.values = new StringBuilder(values);
        items = new ArrayList<Character>(numItems);
    }

    public ArrayList<Character> getValues() {
        for (int i = 0; i < values.length(); i++) {
            char current = values.charAt(i);
            if( current !=' ') {
                items.add(current);
            }
        }
        return items;
    }
}
