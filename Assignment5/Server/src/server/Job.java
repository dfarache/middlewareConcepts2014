
package server;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Job {
    
    private final Class job;
    private final String methodName;
    private final Object obj;
    
    public Job(Class<?>job, String methodName, Object obj){
        this.job = job;
        this.methodName = methodName;
        this.obj = obj;
    }
    
    //http://tutorials.jenkov.com/java-reflection/methods.html
    public Object executeMethod(){
        Object returnValue = null;
        try{
            Method method = job.getMethod(methodName);
            //1st null cause method is static
            returnValue = method.invoke(obj);
        }catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException ex){
            System.err.println(ex);
        }
        return returnValue;
    }
}
