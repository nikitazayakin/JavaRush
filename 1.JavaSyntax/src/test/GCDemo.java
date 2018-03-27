package test;

class GCDemo {
    public static void main(String args[]) {
        int i ;
        long a;
        Runtime r=Runtime.getRuntime();
        System.out.println("Amount of free memory is" + r.freeMemory());
        Long values[]=new Long[200000];
        System.out.println("Amount of free memory is" + r.freeMemory());

        for(a=100000,i=0; i<200000; a++,i++) {
            values[i]=new Long(a);
        }
        System.out.println("Amount of free memory after creating array is" + r.freeMemory());
        for (i=0;i<200 ; i++) {
            values [i]=null;
        }
        r.gc () ;
        System.out.println("Amount of free memory after garbage collection is" + r.freeMemory( ));
    }
}
