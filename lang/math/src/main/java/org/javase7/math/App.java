package org.javase7.math;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ScriptException
    {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        Object answer = engine.eval("((2+9)*(10-7))/(3*2)");
        
        System.out.println( answer );
    }
}
