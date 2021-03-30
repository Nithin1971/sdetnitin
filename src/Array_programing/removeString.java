package Array_programing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class removeString {
public static void main(String[] args) {
	String [] arr={"Harsha", "varun", "hArsha"};
	for(int i=0; i<arr.length; i++){
	arr[i]=arr[i].toLowerCase();
	}
	/***********importent********************/
	List<String> a = Arrays.asList(arr);
//	System.out.println(s[0]);
	LinkedHashSet<String> Ls=new LinkedHashSet<String>(a);
	for(String l:Ls)
	{
		System.out.println(l);
	}
//	for(int i=0; i<arr.length; i++){
//		arr[i]=arr[i].toLowerCase();
//		Ls.add(arr[i]);
//		
//	}
	
//	Iterator<String> irt=Ls.iterator();
//	while(irt.hasNext()){
//	System.out.println(irt.next());	
//	}
	
	
//	for(int i=0; i<Ls.size(); i++){
//		System.out.println(Ls);
//	}
//	
	
	
//	int l = arr.length;
//	for(int i=0; i<l; i++){
//		String larr = arr[i].toLowerCase();
//		for(int j=i+1; j<l; j++){
//			String larr1 = arr[j].toLowerCase();
//			if(larr.equals(larr1)){
//				arr[j]="";
//			}
//		}
//	}
//	System.out.println(arr.length);
//	for(int i=0;i<l; i++){
//		System.out.println(arr[i]);
//	}
}
}
