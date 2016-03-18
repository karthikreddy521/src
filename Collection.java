import java.util.*;

public class Collection {

	public static void main(String[] args) 
	{
/*
		ArrayList ar=new ArrayList();//this is a non generic collection which 
		//accepts all kinds of objects like Integer,String,
		
		ar.add("Karthik");
		ar.add("harish");
		ar.add(12);
		ar.add("Ranga");
	
	Iterator i=ar.iterator();
	while(i.hasNext())
	{
	System.out.println(i.next());
	}
	
	for(Object s:ar)
	{
	System.out.println(s);	
	}
	*/
		
	   //Student s1=new Student(1,"karthik");
	   //Student s2=new Student(2,"harish");
	   Student s3=new Student(1,"aa",23);
	   Student s4=new Student(4,"ranga",22);
	   
	   
	   
	   
	   ArrayList<Student> ar=new ArrayList();
	   //ArrayList<Student> ar2=new ArrayList();
	 
	  // ar.add(s1);
	   //ar.add(s2);
	  // ar.add("kkr");
	   ar.add(s4);
	   ar.add(s3);
	   
	   //ar2.add(s3);
	   //ar2.addAll(ar);
	   
	   for(Student s:ar)
		{
		   Student st=s;
		System.out.println(st.name+" "+st.rno);	
		}
	   /*
	   ListIterator<Student> i=ar.listIterator();
	   
	   while(i.hasNext())
	   {
		   Student s=i.next();
		   //System.out.println(s.name);
	   }
	   while(i.hasPrevious())
	   {
		   Student s=i.previous();
		   //System.out.println(s.name);
	   }
	   
	   
		//System.out.println("After\n\n");
		//ar2.removeAll(ar);//this method removes all elements from arraylist "ar" which match elements in ar2
		//ar.remove(s3);
		
		
		 for(Student s:ar2)
			{
			Student st=s;
			//System.out.println(st.name+" "+st.rno);	
			}
	   ar2.retainAll(ar);//this method retains all the elements which ar removed by removeall method..

	LinkedList<Student> l=new LinkedList();
	
	 l.add(s1);
	   l.add(s2);
	  // ar.add("kkr");
	  ListIterator li=l.listIterator();
	  while(li.hasNext())
	  {
		  Student s=(Student)(li.next());
		  System.out.println(s.name); 
	  }
	  
	
	
	}

*/
	/*
		
		List l=new ArrayList();
		List q=new LinkedList();
		
		HashSet<String> al=new HashSet<String>();  
		
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 
		l.add("kk");
		l.add("rr");
		
	    q.add("kk");
		q.add("rr");
		System.out.println(l);
		System.out.println(q);
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");
		
		  
		System.out.println("iterating the queue elements:");  
		
		Iterator it=queue.iterator();  
		while(it.hasNext()){  
		System.out.println(it.next());  
		}  
		  
		queue.remove();  
		queue.poll();  
		  
		System.out.println("after removing two elements:");  
		
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		  
		}  
		

		 TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		ArrayList<Integer> al=new ArrayList();  
		al.add((201));  
		al.add(Integer.valueOf(101));  
		al.add(230);//internally will be converted into objects as Integer.valueOf(230)  
		  
		Collections.sort(al);  
		System.out.println(al.get(0)); 
		*/
		/*
		HashMap<Integer,String> hm=new HashMap();
		hm.put(1,"karthik");
		hm.put(2, "shiva Gangi");
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		LinkedHashMap<String,String> lh=new LinkedHashMap();
		lh.put("one","karthik");
		lh.put("two", "shiva Gangi");
		
		for(Map.Entry m:lh.entrySet())
		{
		System.out.println(m.getKey()+""+m.getValue());	
		}
		*/
		
		  /*
		  Iterator itr2=.iterator();  
			while(itr2.hasNext()){  
			System.out.println(itr2.next());  
	
		*/	
		
		
	}	
		
	
	}
	

class Student implements Comparable
{
	int rno;
	String name;
	int age;
	Student(int a,String s,int g)
	{
		this.rno=a;
		this.name=s;
		this.age=g;
	}
	
	public int compareTo(Object obj)
	{  
		Student st=(Student)obj;  
		if(age==st.age)  
		return 0;  
		else if(age>st.age)  
		return 1;  
		else  
		return -1;

	}
	
	
	
}
	
 

