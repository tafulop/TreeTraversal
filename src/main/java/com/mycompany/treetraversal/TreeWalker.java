/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.treetraversal;

/**
 * Target example:
  [{"root/1": 
        [{"root/1/1": "end"},
        {"root/1/2": "end"},
        {"root/1/3": "end"}]},
  {"root/2": "end"},
  {"root/3": "end"}]
 * 
 * 
 * @author fulop
 */
public class TreeWalker {
    
    static private StringBuilder builder = new StringBuilder();
    
    static void walk(TreeData node){
    
        System.out.println("visiting: " + node.getName());
   
        if(node.getChildren().isEmpty()){
            System.out.println("Leaf node found:" + node.getName());
            builder.append("\"end\"");
            return;
        }
        
        // each node is obj
        builder.append("[");
        
        // same level
        for(TreeData data : node.getChildren()){
            builder.append("{\"" + data.getName() + "\": ");
            walk(data);
            if(node.getChildren().indexOf(data) != (node.getChildren().size() - 1)){     
                builder.append("}, ");
            }else{
                System.out.println("Last item: " + data.getName());
                builder.append("} ");
            }
            
        }
        
        builder.append("]");
        
        System.out.println("Level change: " + node.getName());
        System.out.println(builder.toString());
    
    }
    
}
