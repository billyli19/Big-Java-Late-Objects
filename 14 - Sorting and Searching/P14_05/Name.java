/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_05;

/**
 *
 * @author billy
 */
public class Name {
    private String key;
    private String value;
    
    public Name(String k, String v){
        key = k;
        value = v;
    }
    
    public String getKey(){
        return key;
    }
    
    public String getValue(){
        return value;
    }
}
