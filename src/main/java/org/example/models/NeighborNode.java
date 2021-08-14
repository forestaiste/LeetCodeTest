package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class NeighborNode {
    public int val;
    public List<NeighborNode> neighbors;
    public NeighborNode() {
        val = 0;
        neighbors = new ArrayList<NeighborNode>();
    }
    public NeighborNode(int _val) {
        val = _val;
        neighbors = new ArrayList<NeighborNode>();
    }
    public NeighborNode(int _val, ArrayList<NeighborNode> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
