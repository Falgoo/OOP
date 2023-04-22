package nguyenxuannghia_20001954.lab9.part1.ex1;

public class TestApp {

    public static void main(String[] args) {
        MyList l = new MyArrayList();
        l.add("a", 0);
        l.add("c", 0);
        l.add("b");
        l.add("c", 3);
        System.out.println(l.size());
        System.out.println(l);

        l.remove(2);
        System.out.println(l.size());
        System.out.println(l);

        MyList myList = new MyLinkedList();
        myList.add("b", 0);
        myList.add("c");
        myList.add("d", 0);
        myList.add("e", 3);

        System.out.println(myList.size());
        System.out.println(myList);

        myList.remove(2);
        System.out.println(myList.size());
        System.out.println(myList);
    }
}
