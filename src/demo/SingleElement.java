package demo;
public class SingleElement {
    public static void main(String[] args) 
    {
        int a[]= {2,2,4,3,1,1,4,6,6};
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    a[i]=0;
                    a[j]=0;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                System.out.println("Single element in array is : "+a[i]);
            }
        }
    }
}
