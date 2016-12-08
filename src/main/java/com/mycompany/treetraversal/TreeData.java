/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.treetraversal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fulop
 */
public class TreeData{
    
    private String name;
    private TreeData parent;
    private List<TreeData> children;
    
    
    public TreeData(String name){
        children = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeData getParent() {
        return parent;
    }

    public void setParent(TreeData parent) {
        this.parent = parent;
    }

    public List<TreeData> getChildren() {
        return children;
    }

    public void setChildren(List<TreeData> children) {
        this.children = children;
    }
    
}
