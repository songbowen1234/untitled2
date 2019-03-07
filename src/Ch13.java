import java.io.*;
import java.util.Properties;

public class Ch13 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties() ;
        properties.setProperty("name","tom");
        properties.setProperty("age","10"); //在程序里写几个建 值 对儿

        System.out.println(properties.getProperty("name") );

        OutputStream out = new FileOutputStream("my.propertise"); //把建 值 对儿存在叫my.pro[ertise文件中
        properties.store(out,"this is a comment");            //对文件描述可以为空null

        //假设事先已经存在一个文件，如db.propertise
        Properties db = new Properties() ;
        db.load(new FileInputStream("db.propertise") ); //读出db.propertise文件内容
        db.forEach((k,v) -> System.out.println(k+"="+v)); //可用下面的替换
        for(Object key : db.keySet()){
            System.out.println(key+ "=" +db.getProperty((String)key));
        }


    }
}
