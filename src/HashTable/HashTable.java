package HashTable;

import OOP1.StudentOOP2.Student;
import sun.invoke.empty.Empty;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by ITHILLEL6 on 28.07.2015.
 */
    public class HashTable {
    private LinkedList[] table = new LinkedList[10];
    private static int DEFAULT_TABLE_SIZE = 10;
    public void put(Object key, Object value){
        int index = Math.abs(key.hashCode()%DEFAULT_TABLE_SIZE);

        LinkedList linkedList = table[index];
        if(linkedList==null) {
            linkedList = new LinkedList();
        }
//        Empty emptyToAdd = new Empty(key, value);

//        if(linkedList.contains())
        linkedList.add(new Entry(key,value));
        table[index]=linkedList;
    }

    public Object get(Student key){
        int index =Math.abs(key.hashCode()%DEFAULT_TABLE_SIZE);
        LinkedList list = table[index];
        if(list==null)return null;
        for(Object entryFromList : list){
            Entry entry = (Entry)entryFromList;
            if(entry.getKey().equals(key)){
                return entry.getValue();
            }
        }
        return null;

    }
    public static class Entry{
        private Object key;
        private Object value;

        public Entry(Object key, Object value){
            this.key=key;
            this.value=value;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Student ivanov =
                new Student(2,"Ivanov",new int[]{5,5,5,4});
        HashTable table = new HashTable();
        table.put(ivanov,100);
        System.out.println(table);
        int gotFromTable = (Integer)table.get(ivanov);
        System.out.println(table);




    }

    @Override
    public String toString() {
        return "HashTable{" +
                "table=" + Arrays.toString(table) +
                '}';
    }


}
