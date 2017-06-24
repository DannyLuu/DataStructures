package test.lists;

import com.lists.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
        assertNotNull("Linked List should be created.", linkedList);
    }

    @Test
    public void testCreateLinkedListWithFiveNodes() {
        addFiveElements();

        assertEquals(5, linkedList.getSize());
        assertEquals("Element at the head", "e", linkedList.get(0).toString());
        assertEquals("Element at the tail", "a", linkedList.get(linkedList.getSize() - 1).toString());
    }

    @Test
    public void testDeleteFromHead() {
        addFiveElements();
        linkedList.remove(0);

        assertNotNull(linkedList);
        assertEquals(4, linkedList.getSize());
        assertEquals("New element at head", "d", linkedList.get(0).toString());
        assertEquals("New element at head's next node", "c", linkedList.get(0).getNext().toString());
    }

    @Test
    public void testDeleteFromTail() {
        addFiveElements();
    }

    private void addFiveElements() {
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
    }
}
