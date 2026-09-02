// // import java.util.*;

// // public class jayHash_map{

// // 		public static void main(String[] args){
// // 			Scanner sc = new Scanner(System.in);
// // 			int n = sc.nextInt();
// // 			int arr[] = new int[n];
// // // 			for (int i = 0 ; i < n ; i++){
// // // 				arr[i]= sc.nextInt();
					
// // // 		  	}

       
// //       HashMap <Integer,Integer> map = new HashMap<>();  

// // 			for (int i = 0; i<n; i ++){
// // 				if(map.containsKey(arr[i])){

// // 				map.put(arr[i],map.get(arr[i]) + 1);

// // 				}
// // 				else{
// // 				map.put(arr[i], 1);
// // 				}
// // 			}

// // 			for (int key : map.keySet()){
// // 				if(map.get(key)>n/3){
// // 					System.out.println(key);
// // 				}
// // 			}
			
			
// // 		}
// // }


// import java .util.*;
// public class jayHash_map{
// 	public static void main(String [] args){
// 		Scanner sc = new Scanner (System.in);
// 		int n  = sc.nextInt();
// 		int [] arr = new int[n];
// 		for(int i = 0;i<n;i++){
// 			arr[i] = sc.nextInt();			
//   		}
// 		HashMap <Integer , Integer> map = new HashMap<>();
// 		for(int i=0;i<n;i++){
// 			int p = arr[i];
// 			map.put(p,map.getOrDefault(p,0) +1);

// 		}

// 		System.out.println("answer");
// 		for(int key : map.keySet()){
// 			if(map.get(key)>n/3)
// 				System.out.println(key);
// 		}
// 	}
// }




// import java.util.*;
// public class jayHash_map{
// 	public static void main(String [] args){
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		int [] arr = new int [n];
// 		for(int i = 0;i<n;i++){
// 			arr [i] = sc.nextInt();
// 		}

// 		System.out.println("second arr");
// 		int p = sc.nextInt();
// 		int [] arra = new int [p];
// 		for(int j = 0;j<p;j++){
// 			arra [j] = sc.nextInt();
// 		}	


	
		
// 	HashSet<Integer> set = new HashSet<>();
// 	for(int i=0;i<n;i++){
// 		set.add(arr[i]);	
// 	}

// 	System.out.println("anss");
// 	for(int j=0;j<p;j++){
// 		if(set.contains(arra[j])){
// 			System.out.println(arra[j]);
// 			set.remove(arra[j]);
// 		}	
// 	}

	
	
	

// 	}
	
// }


import java.util.*;
public class jayHash_map{
	public static void main(String [] args){
		System.out.print("Enter the value of n :");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the element in array :");

		int [] arr = new int[n];
		for(int i= 0; i<n;i++){
			arr[i]=sc.nextInt();
			}




		System.out.print("Enter the value of K :");
		int k = sc.nextInt();


		
		int count =0;
		
		int l = 0;
		int r= 0;

		int sum =0;

//  [1,2,3]
		while(r<n){
			sum = sum + arr[r];
			

      while(sum > k){
				sum = sum -arr[l];
				l++;
		}

		if(sum==k){
				count ++;
			}
			
		r++;
    

	}

	sc.close();
	System.out.print(count);



		// for(int i = 0;i<n;i++){
		// 	int sum =0;
		// 	for(int j=i;j<n;j++){
		// 		sum = sum + arr[j];
		// 		if(sum ==k){
		// 			count = count + 1;
		// 		}
			
		// 	}
			
		// }
		// System.out.print(count);
	
	}
}










