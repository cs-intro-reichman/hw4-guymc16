public class Primes {
    public static void main(String[] args) {
        
        int N = Integer.parseInt(args[0]);
        boolean [] array = new boolean[N+1];
        int p = 2;
        int multi = 2;
        int count = 0;


System.out.println("Prime numbers up to " + N + ":");

        for (int i=2;i<N+1; i++)
    {
        array[i] = true;
    }
        while (p*p<=N) 
        {  
        if (array[p]) 
        {
            multi = p*p;
            while (multi <=N) 
            {
                array[multi] = false;
                multi+= p;
            }
        }
        p++;
    }
    

    for (int i=2;i<N+1; i++)
    {
        if (array[i] == true)
        {
        System.out.println(i);
        count++;
        }
    }
    System.out.println("There are " + count + " primes between 2 and " + N + " (" + (int)(((double)count/N)*100) + "% are primes)");
    }
}