
public class Solution {
	public int maxArea(int[] height){
		int a = 0;
		int n = height.length;
		int b = n - 1;
		int contain = 0;
		
		while(a != b){
			if(height[a] > height[b]){
				contain = Math.max(contain, (b - a) * height[b]);
				b = b - 1;
			}else{
				contain = Math.max(contain, (b - a) * height[a]);
				a = a + 1;
			}
		}
		
		return contain;
	}

}
