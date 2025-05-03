package ProblemsLeetcode;

import java.util.LinkedList;
import java.util.List;
class MedianFinder {
	List<Integer> list = new LinkedList<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
		int index = findIndex(num);
		list.add(num, index);
    }
    
    public double findMedian() {
        int s=list.size();
        if(s%2 == 0)
        {
            return (list.get(s/2)+list.get(s/2-1))/2.0;
        } else {
			return list.get(s/2);
		}
    }

	public int findIndex(int num)
    {
		int f = 0, r = list.size();
		int m = (f + r) / 2;
		while(f<=r)
		{
			if (list.get(m) == num) {
				return m;
			} else if (list.get(m) > num) {
				r = m;
			} else {
				f=m;
			}
		}
		return r;
    }
}
