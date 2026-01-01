public class inverted_half_pyramid_rotated_by_180
{
    public static void main (String []arrgs){
    int i,j;
    for(i=5;i>0;i--)
    {
        System.out.println();
        for(j=0;j<5;j++){
        if(j>=i)
        System.out.print("* ");
        else
        System.out.print("  ");
    }
    }
    }
}
