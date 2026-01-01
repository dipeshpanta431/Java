public class hollow_rectangle {
    public static void main(String[] args) {
        int i;int j;
        for(i=0;i<=4;i++){
            System.out.println();
            for(j=0;j<=5;j++){
                if(i==0 || j==0 || i==4 || j==5)
                System.out.print("* ");
                else
                System.out.print("  ");
            } 
            
        }
       
    }

    
}
