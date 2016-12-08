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
public class JSONBuilder {
    
    private static final String OBJECT_START = "{ ";
    private static final String OBJECT_END = "} ";
    private static final String ARRAY_START = "[ ";
    private static final String ARRAY_END = "] ";
    private static final String VALUE_SEPARATOR = ", ";
    private static final String SEMICOLON = " : "; 
    
    private StringBuffer _builder;
    
    JSONBuilder(){
        _builder = new StringBuffer();
    }
    
    //public JSONBuilder startObject{
      //  _builder.append("")
   // }
    
}
