package test.lists;

import com.lists.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Hisoka on 2017-06-23.
 */
public class LinkedListTest {
    private LinkedList linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList<String>();
    }

    @Test
    public void testCreateLinkedList() {
        assertNotNull("New linked list", linkedList);
        assertTrue("LinkedList with 0 elements", linkedList.isEmpty());
    }

    @Test
    public void testCreateLinkedListWithFiveNodes() {
        addFiveElements();

        assertEquals("LinkedList with 5 elements", 5, linkedList.getSize());
        assertEquals("Element at the head", "e", linkedList.get(0).toString());
        assertEquals("Element at the tail", "a", linkedList.get(linkedList.getSize() - 1).toString());
    }

    @Test
    public void testDeleteFromHead() {
        addFiveElements();
        linkedList.remove(0);

        assertNotNull("LinkedList with 4 elements", linkedList);
        assertEquals("Size after removal", 4, linkedList.getSize());
        assertEquals("New element at head", "d", linkedList.get(0).toString());
        assertEquals("New element at head's next node", "c", linkedList.get(0).getNext().toString());
    }

    @Test
    public void testDeleteFromTail() {
        addFiveElements();
        linkedList.remove(linkedList.getSize() - 1);

        assertNotNull("LinkedList with 4 elements", linkedList);
        assertEquals("Size after removal", 4, linkedList.getSize());
        assertEquals("New element at head", "e", linkedList.get(0).toString());
        assertEquals("New element at tail", "b", linkedList.get(linkedList.getSize() - 1).toString());
        assertEquals("Tail's next element", null, linkedList.get(linkedList.getSize() - 1).getNext());
    }

    @Test
    public void testDeleteFromIndexTwo() {
        addFiveElements();
        linkedList.remove(2);

        assertNotNull("LinkedList with 4 elements", linkedList);
        assertEquals("Size after removal", 4, linkedList.getSize());
        assertEquals("New element at index 2", "b", linkedList.get(2).toString());
        assertEquals("Element at index 2's next node", "a", linkedList.get(2).getNext().toString());
    }

    @Test
    public void testAddAtHead() {
        addFiveElements();
        linkedList.add("swag");

        assertNotNull("LinkedList with 6 elements", linkedList);
        assertEquals("Size after insertion", 6, linkedList.getSize());
        assertEquals("New element at head", "swag", linkedList.get(0).toString());
        assertEquals("New element at head's next node", "e", linkedList.get(0).getNext().toString());
    }

    @Test
    public void testAddAtHeadUsingIndex() {
        addFiveElements();
        linkedList.add("kittens", 0);

        assertNotNull("LinkedList with 6 elements", linkedList);
        assertEquals("Size after insertion", 6, linkedList.getSize());
        assertEquals("New element at head", "kittens", linkedList.get(0).toString());
        assertEquals("New element at head's next node", "e", linkedList.get(0).getNext().toString());
    }

    @Test
    public void testAddElementAtTail() {
        addFiveElements();
        linkedList.add("yolo", linkedList.getSize());

        System.out.println(linkedList.toString());
        assertNotNull("LinkedList with 6 elements", linkedList);
        assertEquals("Size after insertion", 6, linkedList.getSize());
        assertEquals("New element at tail", "yolo", linkedList.get(linkedList.getSize() - 1).toString());
        assertEquals("Tail's next element", null, linkedList.get(linkedList.getSize() - 1).getNext());
    }

    @Test
    public void testAddElementAtIndexTwo() {
        addFiveElements();
        linkedList.add("despacito", 2);

        assertNotNull("LinkedList with 6 elements", linkedList);
        assertEquals("Size after insertion", 6, linkedList.getSize());
        assertEquals("Previous element before index 2's next node", "despacito", linkedList.get(1).getNext().toString());
        assertEquals("New element at index 2", "despacito", linkedList.get(2).toString());
        assertEquals("New element at index 2's next node", "c", linkedList.get(2).getNext().toString());
    }

    private void addFiveElements() {
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
    }
}
