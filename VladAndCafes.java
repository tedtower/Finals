import java.util.*;

public class VladAndCafes {

    public static void main (String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int num = sc.nextInt();
    		Set<Integer> set = new LinkedHashSet<>();
    		for (int i = 0; i < num; i++) {
    			int tmp = sc.nextInt();
    			if (set.contains(tmp))
    				set.remove(tmp);
    			set.add(tmp);
    		}
    		System.out.println(set.iterator().next());
    }
}