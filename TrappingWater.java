public class TrappingWater {
    public static int trapped_water(int height[]){
        int n=height.length;

        //LEFT MAX BOUNDARY
        int leftMAX[]=new int[n];
        leftMAX[0]=height[0];
        for(int i=1;i<n;i++){
            leftMAX[i]=Math.max(height[i], leftMAX[i-1]);
        }

        //RIGHT MAX BOUNDARY
        int rightMAX[]=new int[n];
        rightMAX[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMAX[i]=Math.max(height[i],rightMAX[i+1]);
        }

        int trappdWATER=0;


        //loop
        for(int i=0;i<n;i++){

            //WATER LEVEL= min(LEFT MAX , RIGHT MAX)
            int waterLevel=Math.min(leftMAX[i],rightMAX[i]);

            //TRAPPED WATER = WATER LEVEL - HEIGHT[i]
            trappdWATER+=waterLevel-height[i];

        }
        return trappdWATER;
        
        
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trapped_water(height));
    }
}