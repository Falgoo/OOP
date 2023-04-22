package nguyenxuannghia_20001954.lab9.part1.ex2;

public class MyHashMap implements MyMap {

    private final static int INITIAL_SIZE = 8;
    private MyHashMapEntry[] table;
    private int size;

    MyHashMap() {
        table = new MyHashMapEntry[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public Object get(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            return table[bucket].getValue();
        }
        return -1;
    }

    @Override
    public void put(Object key, Object value) {
        if (capacityRatio() > 0.75) {
            enlarge();
        }

        int bucket = getBucket(key);
        if (table[bucket] == null) {
            table[bucket] = new MyHashMapEntry(key, value);
            size++;
        }
    }

    @Override
    public void remove(Object key) {
        int index = -1;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null && table[i].getKey().equals(key)) {
                index = i;
            }
        }

        if (index != -1) {
            table[index] = null;
            size--;
        }
    }

    @Override
    public boolean contains(Object key) {
        for (MyHashMapEntry myHashMapEntry : table) {
            if (myHashMapEntry != null && myHashMapEntry.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    int getBucket(Object key) {
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key) {
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] -> (%s, %s)\n", i, table[i].getKey(), table[i].getValue()));
            }
        }
        return sb.toString();
    }

    double capacityRatio() {
        return size / (double) table.length;
    }

    void enlarge() {
        MyHashMapEntry[] tmp = new MyHashMapEntry[size * 2];
        System.arraycopy(table, 0, tmp, 0, size);
        table = tmp;
    }
}
