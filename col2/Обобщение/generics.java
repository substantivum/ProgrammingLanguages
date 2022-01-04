class Generics {
	public static  <T> void count(T[] a) {
		int odd = 0;
		int even = 0;
        	for (int i = 0; i < a.length; i++) {
            		if (a[i] instanceof Integer) {
                		if ((int) a[i] % 2 == 1) {
                   			 odd += 1;
               					 }
               			if ((int) a[i] % 2 == 0) {
                    			even += 1;
                		}
            		}
       		 }
        	System.out.println("Even: " + even);
        	System.out.println("Odd: " + odd);
    	}



    	public static <T> void swap(ArrayList<T> a){
        	Scanner in = new Scanner(System.in);
        	System.out.print("Enter number of first element: ");
        	int m1 = in.nextInt();
        	System.out.print("Enter number of second element: ");
        	int m2 = in.nextInt();
        	Collections.swap(a, m1-1, m2-1);
        	for (T c:
             	a) {
            	System.out.println(c);
        	}
    	}



    	public static <T> void maxmini(ArrayList<T> a){
        	Scanner in = new Scanner(System.in);
		System.out.print("Enter begining: ");
        	int m1 = (in.nextInt())-1;
        	System.out.print("Enter ending: ");
        	int m2 = (in.nextInt())-1;
        	ArrayList<Integer>asd = new ArrayList<>();
        	for (int i = m1; i < m2;i++){
            	if (a.get(i) instanceof Integer){
            		asd.add((Integer) a.get(i));

        	}}
        	System.out.println(Collections.min(asd));
        	System.out.println(Collections.max(asd));

    }
}