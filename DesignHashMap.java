class MyHashMap {
    
    ArrayList<Integer> keys, values;

    /** Initialize your data structure here. */
    public MyHashMap() {
        keys=new ArrayList();
        values=new ArrayList();
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        if(keys.contains(key)) values.set(keys.indexOf(key), value);
        else {
            keys.add(key);
            values.add(value);
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(keys.contains(key)) return values.get(keys.indexOf(key));
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if(keys.contains(key)) {
            int index=keys.indexOf(key);
            keys.remove(index);
            values.remove(index);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */