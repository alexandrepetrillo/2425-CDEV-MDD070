package iterator.collection;

public class MonArrayList {

    private String[] array = new String[10];
    private int count = 0;

    void add(String x) {
        if (count == array.length) {
            String[] array2 = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
            }
            array = array2;
        }
        array[count] = x;
        count++;
    }

    String get(int i) {
        return array[i];
    }

    int size() {
        return count;
    }

    public static void main(String[] args) {
        MonArrayList list = new MonArrayList();
        list.add("A");
        list.add("B");
        System.out.println("Size=" + list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
    }
}
