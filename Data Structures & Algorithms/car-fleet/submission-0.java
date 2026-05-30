class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=speed.length;
        double[][] car= new double[n][2];
        int fleet=1;
        double prev=0.0;
        for(int i=0;i<n;i++)
        {
            car[i][0]=position[i];
            car[i][1]= (double)(target-position[i]) / speed[i];
        }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(rt[i]+" ");
        // }
        Arrays.sort(car,(a,b)->Double.compare(a[0],b[0]));
        prev=car[n-1][1];
        for(int i=n-2;i>=0;i--)
        {
            if(car[i][1]<=prev) continue;
            else{
                prev=car[i][1];
                fleet++;
            }
        }
        return fleet;
    }
}
