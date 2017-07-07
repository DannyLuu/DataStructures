package com.trees;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Hisoka on 2017-06-27.
 */
public class BinarySearchTreeTest {
    private BinarySearchTree bst;

    @Before
    public void setup() {
        bst = new BinarySearchTree();
    }

    @Test
    public void testEmptyBST() {
        assertNull(bst.getRoot());
        assertNull(bst.search(1));
    }

    @Test
    public void testPopulatedBST() {
        populateBST();

        assertNotNull(bst.getRoot());
        assertEquals(10, bst.getRoot().data);
        assertEquals(15, bst.search(15).data);
        assertEquals(10, bst.search(10).data);
        assertEquals(5, bst.search(5).data);
        assertEquals(3, bst.search(3).data);
        assertEquals(13, bst.search(13).data);
    }

    @Test
    public void testRemoveLeafNodeBST_1() {
        populateBST();
        bst.remove(6);

        assertNull(bst.search(7).left);
        assertEquals(9, bst.search(7).right.data);
        assertEquals(5, bst.search(7).parent.data);
    }

    @Test
    public void testRemoveLeafNodeBST_2() {
        populateBST();
        bst.remove(40);

        assertNull(bst.search(27).right);
        assertEquals(20, bst.search(27).left.data);
        assertEquals(15, bst.search(27).parent.data);
    }

    @Test
    public void testRemoveNodeWithOneLeftChild() {
        populateBST();
        bst.remove(9);

        assertEquals(7, bst.search(8).parent.data);
        assertEquals(6, bst.search(7).left.data);
        assertEquals(8, bst.search(7).right.data);
        assertNull(bst.search(8).left);
        assertNull(bst.search(8).right);
    }

    @Test
    public void testRemoveNodeWithOneRightChild() {
        populateBST();
        bst.remove(11);

        assertEquals(15, bst.search(13).parent.data);
        assertEquals(13, bst.search(15).left.data);
        assertEquals(27, bst.search(15).right.data);
        assertNull(bst.search(13).left);
        assertEquals(14, bst.search(13).right.data);
    }

    @Test
    public void testRemoveNodeWithTwoChildren() {
        populateBST();
        bst.remove(15);

        // Check the root.
        assertEquals(5, bst.getRoot().left.data);
        assertEquals(16, bst.getRoot().right.data);

        assertEquals(bst.getRoot(), bst.search(16).parent);
        assertEquals(11, bst.search(16).left.data);
        assertEquals(27, bst.search(16).right.data);
    }

    @Test
    public void testRemoveRootNode() {
        populateBST();
        bst.remove(10);

        //Check the root.
        assertNull(bst.getRoot().parent);
        assertEquals(11, bst.getRoot().data);
        assertEquals(5, bst.getRoot().left.data);
        assertEquals(15, bst.getRoot().right.data);
        assertEquals(11, bst.search(15).parent.data);
        assertEquals(13, bst.search(15).left.data);
        assertEquals(27, bst.search(15).right.data);
        assertEquals(14, bst.search(13).right.data);
        assertNull(bst.search(13).left);
        assertEquals(15, bst.search(13).parent.data);
    }

    /**
     * Populates the binary search tree with:
     *                     10
     *                    / \
     *                   /   \
     *                  /     \
     *                 /       \
     *                /         \
     *               /           \
     *              /             \
     *             5              15
     *            / \            / \
     *           3  7           /   \
     *             / \         /     \
     *            6  9        /       \
     *              /        /         \
     *             8        11         27
     *                       \        / \
     *                       13      /   \
     *                        \     /     \
     *                        14   20     40
     *                            / \
     *                           17 21
     *                          /    \
     *                         16    25
     */
    private void populateBST() {
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(7);
        bst.insert(6);
        bst.insert(11);
        bst.insert(13);
        bst.insert(14);
        bst.insert(3);
        bst.insert(27);
        bst.insert(40);
        bst.insert(20);
        bst.insert(17);
        bst.insert(16);
        bst.insert(21);
        bst.insert(25);
        bst.insert(9);
        bst.insert(8);
    }
}
