public class test {
    int algorithm(int N){
        if(N==0)
            return 0;
        int sum = 0;
            for(int i=0;i<N;i++)
                for(int j=0;j<N;j++)
                    sum++;
            for(int i=0;i>0;i--)
                for(int j=0;j<N;j++)
                    for(int k=0;k<N;k++)
                        sum++;
            for(int i=0;i<4;i++)
                for(int j=0;j<2;j++)
                    sum+=algorithm1(N/2)
            return sum;
}
}


