package org.example;

public class BTVN2 {
    public static void main( String[] args )
    {
        //1. Viết chương trình in ra các số từ 1 đến 100
        for(int i=1;i<=100;i++){
            System.out.println(i);
        }

        //2. In ra các số từ 100 đến 1
        for(int i=100;i>0;i--){
            System.out.println(i);
        }
        //3. Viết chương trình tính tổng của 50 số đầu tiên từ 1
        int sum=0;
        for(int i=1;i<=50;i++){
            sum =sum +i;
        }
        System.out.println("Tổng của 50 số đầu tiên từ 1 là:"+sum);

        //4. Viết chương trình tính tổng của 50 số chẵn đầu tiên từ 0
        int sumchan =0;
        for(int i=0; i<=100; i+=2){
            sumchan = sumchan+i;
        }
        System.out.println("Tổng của 50 số chẵn đầu tiên là:"+sumchan);

        //5. Viết chương trình tính n!
        int gt=1;
        int n = 20;
        for (int i = 1; i < n; i++) {
            gt = gt*i;
        }
        System.out.println("Giai thua cua "+ n +" la: "+ gt);

        //6. Viết chương trình in ra 10 số đầu tiên trong dãy Fibonaci
        int fibonaci[]={1,1,2,3,5,8,13,21,34,55};
        for(int i=0; i<fibonaci.length; i++){
            System.out.println(fibonaci[i]);
        }

    }
}
