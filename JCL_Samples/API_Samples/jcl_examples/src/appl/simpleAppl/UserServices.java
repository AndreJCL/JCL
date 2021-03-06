package appl.simpleAppl;

import java.util.Collections;
import java.util.List;

import jdk.jfr.events.ThrowablesEvent;

public class UserServices {
	
	//fibonatti
	public Integer execute(Integer n) throws Exception{
        if (n <= 1) return 1;
        else return execute(n-1) + execute(n-2);
    }
	
	//PA
	public static Integer execute(Integer a0, Integer an, Integer numElementos){
		if(numElementos==null) numElementos = new Integer(1);
		Integer soma = (((a0 + an)*(numElementos))/2);
		
		return soma;
	}
	
	//sorting
	public List<Integer> ordena(List<Integer> valores){
		Collections.sort(valores);
		return valores;
	}
	
	public List<Integer> ordena_Wait(List<Integer> valores){
		Collections.sort(valores);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return valores;
	}
	
	public void IoTActionTask(){
		// do any task in Java
		System.out.println("after the context is reached a task is executed !!");
	}

}
