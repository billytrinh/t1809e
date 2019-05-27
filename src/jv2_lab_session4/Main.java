package jv2_lab_session4;

public class Main {
   // public static Integer x = 2;
    public static void main(String args[]){
        Snt snt = new Snt(2);
        //Integer x = 2;
        SubThread st1 =  new SubThread(snt);
        SubThread st2 =  new SubThread(snt);
        st1.start();
        st2.start();

//        Runnable r =  new Runnable() {
//            @Override
//            public void run() {
//               for (int j = 0;j<100;j++){
//                   synchronized (x){
//                       for (int i = x+1;true;i++){
//                           if(checkSNT(i)){
//                               System.out.println("SNT: "+i);
//                               x = i;
//                               break;
//                           }
//                       }
//                   }
//                   try {
//                       Thread.sleep(500);
//                   }catch (Exception e){}
//               }
//            }
//            public boolean checkSNT(int n){
//                for (int i=2;i<=n/2;i++){
//                    if(n%i==0){
//                        return false;
//                    }
//                }
//                return true;
//            }
//        };
//
//        new Thread(r).start();
//        new Thread(r).start();
    }
}
