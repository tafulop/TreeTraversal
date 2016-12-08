/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.treetraversal;

/**
 *
 * @author fulop
 */
public class TreeBuilder {
    
    public static void main(String[] args){
        
        // root
        TreeData root = new TreeData("root");
       
        // level 1
        root.getChildren().add(new TreeData("root/1"));
        root.getChildren().add(new TreeData("root/2"));
        root.getChildren().add(new TreeData("root/3"));
        
        // level 2
        root.getChildren().get(0).getChildren().add(new TreeData("root/1/1"));
        root.getChildren().get(0).getChildren().add(new TreeData("root/1/2"));
        root.getChildren().get(0).getChildren().add(new TreeData("root/1/3"));
     /*   
        root.getChildren().get(1).getChildren().add(new TreeData("root/2/1"));
        root.getChildren().get(1).getChildren().add(new TreeData("root/2/2"));  // LEAF
        
        root.getChildren().get(2).getChildren().add(new TreeData("root/3/2"));  // LEAF
        
        // level 3
        root.getChildren().get(0).getChildren().get(0).getChildren().add(new TreeData("root/1/1/1"));   // LEAF
        root.getChildren().get(0).getChildren().get(0).getChildren().add(new TreeData("root/1/1/2"));   // LEAF
        root.getChildren().get(0).getChildren().get(0).getChildren().add(new TreeData("root/1/1/3"));   // LEAF
        
        root.getChildren().get(0).getChildren().get(1).getChildren().add(new TreeData("root/1/2/1"));   // LEAF
        root.getChildren().get(0).getChildren().get(2).getChildren().add(new TreeData("root/1/3/1"));   // LEAF
        
        root.getChildren().get(1).getChildren().get(0).getChildren().add(new TreeData("root/2/1/1"));   // LEAF
        
        root.getChildren().get(1).getChildren().get(0).getChildren().add(new TreeData("root/1/1/1"));   // LEAF
*/
        
        TreeWalker.walk(root);
    
    }
    
    
}
