package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

public static void main(String[] args) {
   int[] a = {8,3,6,17,11};
   // printMaxMin(a);
   // System.out.println(linSearch(a, 9));
   // System.out.println(binarySearch(new int[]{7,8,9,10,12,22,25,60}, 600));

//   int[] arr = {4,5,5,6,7,8,8,8,9,9};
//   reverseRec(arr, 0, arr.length-1);
   
//   int[] arr = {0,0,1,0,1,1,0};
//   List<Integer> ar = new ArrayList(Arrays.asList(arr));
//   removeDuplicate(ar);
//   System.out.println(ar);
//   leftright(arr);
//   printFreq(arr);
//   System.out.println(Arrays.toString(arr));
   
   int[] price = {1,5,3,8,12};
   findMaxProfit(price);
  }
    
  private static void findMaxProfit(int[] price) {
	int p =0;
	for(int i=1;i<price.length;i++) {
		if(price[i]>price[i-1])
			p +=(price[i]-price[i-1]);
	}
	System.out.println(p);
	
}

static void printFreq(int a[]) {
	  int e = a[0], count = 0;
	  for(int i=0;i<a.length;i++) {
		  if(a[i] == e)
			  count ++;
		  else {
			  System.out.println(e+":"+count);
			  count =1;
			  e = a[i];
		  }
	  }
	  System.out.println(e+":"+count);
  }
  
  static void leftright(int[] a) {
	  int count0 = 0;
	  for(int e:a) {
		  if(e == 0)
			  count0++;
	  }
	  
	  for(int i=0;i<a.length;i++) {
		  if(count0>0) {
			  a[i] = 0;
			  count0--;
		  }else
			  a[i]=1;
	  }
  }
  
  static void removeDuplicate(List<Integer> a) {
//	  int i = 0;
//	  while(i<(a.size()-1)) {
//		  if(a.get(i) == a.get(i+1)) {
//			  a.remove(i+1);
//		  }else {
//			  i++;
//		  }
//	  }
	  
//	  for(int i=0;i<a.size()-1;i++) {
//		  if(a.get(i) == a.get(i+1)) {
//			  a.remove(i+1);
//			  i--;
//		  }
//	  }
  }
  
  static void reverse(int[] a) {
	  int i = 0, j = a.length-1;
	  while(j>i)
		  swap(a, i++, j--);
  }
  
  static void reverseRec(int[] a, int i, int j) {
	  if(j>i) {
		  swap(a,i,j);
		  reverseRec(a, i+1, j-1);
	  }
  }
  
  static void swap(int[] a, int i, int j) {
	  int t = a[i];
	  a[i] = a[j];
	  a[j] = t;
  }
  
  static int  linSearch(int[] a, int k) {
	  for(int i=0;i<a.length;i++) {
		if(a[i] == k) {
			return i;
		}
	  }
	  return -1;
  }
  
  static int linSearchRec(int[] a, int k, int i) {
//	  if(i<a.length) {
//		  if(a[i] == k)
//			  return i;
//		  else
//			  return linSearchRec(a, k, i+1);	
//	  }  
//	  return -1;
	  return (i<a.length)?(a[i] == k ? i: linSearchRec(a, k, i+1)):-1;
  }
  
  static int binarySearch(int[] a, int k) {
	  int start = 0;
	  int end = a.length-1;
	  while(start<=end) {
		  int mid = (start+end)/2;
		  if(k==a[mid])
			  return mid;
		  else if(k>a[mid])
			  start = mid+1;
		  else
			  end = mid -1;
	  }
	  
	  return -1;
  }


  static void printMaxMin(int[] a) {
	  int mx = a[0];
	  int mn = a[0];
	  for(int  i=1;i<a.length;i++) {
		  if(a[i]>mx)
			  mx = a[i];
		  else if(a[i]<mn)
			  mn = a[i];
	  }
	  System.out.println(mx +" " + mn);
  }

}
