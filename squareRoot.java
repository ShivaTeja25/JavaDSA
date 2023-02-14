class squareRoot
{
     long floorSqrt(long x)
	 {
		
		long low = 0, high = x, ans = -1;

        while(low<=high) {

            long mid = (low + high) / 2;

            if(mid*mid == x) return mid;

            else if(mid*mid > x) {

                high = mid-1;

            }else {

                low = mid + 1;

                ans = mid;

            }

        }

        return ans;
	 }
}
