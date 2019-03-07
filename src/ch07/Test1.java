package ch07;

public class Test1 {
    static void f() throws Exception{
        try{            //alt 回车掉try catch
            g() ;
        }catch(Exception e){
            throw new Exception("f里面的异常",e);  //这里没有e只会调出f里面的异常
        }

    }

    static void g() throws Exception {
        throw new Exception("g里面的异常") ; //相当于抛出对象
        //Exception e = new Exception("g里面的异常");
        //throw e;
    }

    public static void main(String[] args) {
        try{
            f();
        }catch (Exception e){
            e.printStackTrace() ;
        }

    }
}
