public class GcdClass {
	
	
	public static int generalizedGCD(int num, int[] arr)
    {
       int min=100;
       int obeb=1;
       for(int i=0;i<arr.length;i++){
    	   if(min>arr[i])
    		   min=arr[i];
       }
       if(min<2)
    	   return 1;
		else {
			for (int j = 2; j <= min; j++) {
				for (int k = 0; k < arr.length; k++) {
					boolean flag=true;
					if (j % arr[k] != 0) {
						flag=false;
					}
				if(flag)
					obeb=j;
				}
			}
		}
	return obeb;
    }
	
	public static void main(String[] args)
	{
		int[] arr={14,14,7,35,28};
		int obebVal=generalizedGCD(5,arr );
		System.out.println(obebVal);
	}

}
