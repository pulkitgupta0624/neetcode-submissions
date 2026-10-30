class MyHashSet {

    List<Integer> list;

    public MyHashSet() {
        this.list = new ArrayList<>();
    }
    
    public void add(int key) {
        if (!contains(key)) {
            list.add(key);
        }
    }
    
    public void remove(int key) {
        list.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        for(int num : list){
            if(num == key){
                return true;
            }
        }

        return false;
    }
}