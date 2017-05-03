// QUESTION:
// You are given an array of random integers. Return an 
// array where all of the possible two item combinations add up to less
// than a provided maximum value.

//int[] nums = { 5, 2, 8, 6, 10, 20, 30}
//int max = 15;
//5,2.  5,6 . 2,8. 2,6

class PairOfLessMax{
public List<String> findAll(int[] nums, int max){

1ptr = 0;
2ptr = nums.length()-1;

List<String> result = new ArrayList<String>();
while(1ptr!=2ptr){
	if(nums[1ptr]+nums[2ptr]<max){
		result.append(1ptr);
		result.append(2ptr);	
	}
	2ptr--;
	if(2ptr==1ptr){
		1ptr++;
		2ptr=nums.length()-1;

	}


}
return result;

}
}