package com.datastructures.trees;

/**
 * Created by Hisoka on 2017-08-07.
 */
public class Node {
    public int data;
    public Node parent;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public boolean isLeafNode() {
        return left == null && right == null;
    }

    public String toString() {
        if (this == null) {
            return "null";
        } else {
            return "" + data;
        }
    }

    public RELATION determineRelationTo(Node potentialFamily) {
        if (this.parent == potentialFamily) {
            return RELATION.PARENT;
        } else if (this.left == potentialFamily) {
            return RELATION.LEFT_CHILD;
        } else if (this.right == potentialFamily) {
            return RELATION.RIGHT_CHILD;
        } else {
            return RELATION.UNKNOWN;
        }
    }


    public enum RELATION {
        PARENT,
        LEFT_CHILD,
        RIGHT_CHILD,
        UNKNOWN; // I don't know what else to call it :S
    }
}
