public class __13_genericsAndCollections {

    public static void main(String[] args) {

    /*
    ArrayList - fast random access, can be slow at resizing

    LinkedList - implements list and queue/dequeue. fast insertion/deletion at each end and fast traversal. Slow to access indexes in the middle as it must be traversed from the head or tail.

    List Methods:
        - .add(Element e) / .add(int index, Element e)
        - .get(int index)
        - .set(int index, Element e) - change an element at index
        - remove(int index) / remove(Object o)

    Set - typically unordered and no duplicates
        - common interfaces include: HashSet, TreeSet and LinkedHashSet
            - Linked Hash Set maintains the order items were inserted in

        Methods:
            - Set<String> names = new HashSet<>();
            - .add()
            - .remove()
            - in order to change an item, the old needs to be removed and the replacement added

     Map - dictionary
        - HashMap offers fast lookup and modify times when the order is not important
        - TreeMap is ordered
        - LinkedHashMap - combines constant performance and ordered nature.

        Methods:
            - Map<String, Integer> myMap = new HashMap<>();
            - .put("Key", value)   - adds pair to map, or changes existing pair
            - .get("Key")  - returns value
            - .remove("Key")

       Iterating:

            for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
                System.out.println(entry.getKey() + ", " + entry.getValue());
            }

            for (String key : myMap.keySet()) {
                System.out.println(key + ": " + myMap.get(key));
            }


     Queue:

        - Has sub-interface called Deque which allows access to head and tail of queue.
        - Most common implementations are: PriorityQueue, LinkedList, ArrayDeque

        Methods:
        - .add()  - throws error if queue is full
        - .offer()  - returns false if queue is full
        - .addLast() and .offerLast() are equivalent for Deque's.
        - .addFirst() and .offerFirst() are for the front of a Deque.

        - .element() - gets first item, throws error iff empty
        - .peek()  - returns first item in queue, returns null if empty
        - .getFirst() and peekFirst() for deque
        - .getLast() and .peekLast() for deque

        - .remove()  - returns error if empty
        - .poll()  - returns null if empty
        - .removeFirst() and .pollFirst()
        - .removeLast() and .pollLast()


     Comparable and Comparator interfaces:
        - When a class implements Comparable, we need to implement compareTo()
        - public class Person implements Comparable<Person> {}

        - compareTo() returns a -ve, 0 or +ve integer
              +Ve if the object is greater than the passed-in object
              -Ve if the object is less than the passed-in object
              0 if equal

       - Comparator is not meant to be implemented into a class
       - typically implemented in lambda expressions
              +Ve if the first object is greater than second
              -Ve if the first object is less than second
              0 if equal

        - We can either give them a natural order by making them implement Comparable
        - implement Comparator and pass this to the sort method


        Implementing compareTo():

            public class Person implements Comparable<Person> {

                ...

                @0verride
                public int compareTo(Person person2) {
                    return Integer.compare(this.age, person2.age);
                }
            }

            Collections.sort(personList);




        Implementing compare() using Comparator:
            - Create a separate class(not typical)
            - use anonymous inner class (better)
            - implement with a lambda expression (most common)


            Anonymous class example:

            Comparator<Person> nameComparator = new Comparator<>() {
                @Override
                public int compare(Person p1, Person p2) {
                    return p1.getName().compareTo(p2.getName());
                }
           }

           Collections.sort(personList, nameComparator);


           Implementing with a Lambda Expression:

                Comparator<Person> nameComparatorLambda = (p1, p2) -> p1.getName().compare(p2.getName());

                Collections.sort(personList, nameComparatorLambda);
     */
    }
}
