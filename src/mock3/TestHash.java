package mock3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestHash {

	public static void main(String[] args) {
//		Hashtable ht = new Hashtable<>();
//		ht.put(null, "");
//		ht.get(null);
//		Set s = new TreeSet<>();
//		s.add(null);
//		s.contains(null);
		
		Map s1 = new TreeMap<>();
		s1.put(2, "a");
		s1.put(1, "f");
		System.out.println(s1.size()+ s1.toString());
		
		
		Set sstree = new TreeSet();
		sstree.add(10);
		sstree.add(2);
		System.out.println(sstree.size()+ sstree.toString());
		
		HashMap m1 = new HashMap<>();
		m1.put(2, "a");
		m1.put(5, "f");
		m1.put(1, "f");
		System.out.println(m1.size() +" "+m1);
		
		HashSet ss = new HashSet();
		ss.add(10);
		ss.add(2);
		System.out.println(ss.size()+ ss.toString());
		
		
		Hashtable ht = new Hashtable();
		ht.put(2, "b");
		ht.put(1, "f");
		ht.put(1, "g");
		
		System.out.println(ht.size() + ht.toString()); //Não Ordena
		
		ReadWriteLock rwl = new ReentrantReadWriteLock();
		//rwl.readLock().lock();
		//rwl.writeLock().lock();
		
		System.out.printf("One day has %d hours, %d minutes, %d seconds",
				TimeUnit.DAYS.toHours(1), TimeUnit.DAYS.toMinutes(1), TimeUnit.DAYS.toSeconds(1));
		//Thread.sleep(TimeUnit.SECONDS.toMillis(2); //2 segundos p/ milisegundos
	}
}
