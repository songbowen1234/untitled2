package ch07;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.*;

public class RiZhi {
    public static void main(String[] args) throws IOException {
       // Logger.getGlobal().severe("info"); //只打印前三个后面四个默认都是不打印，这七个都是简单日志
       // Logger.getGlobal().warning("hello");
       // Logger.getGlobal().info("severe");
       // Logger.getGlobal().config("world");
       // Logger.getGlobal().fine(",,,");
       // Logger.getGlobal().finer("tom");
       // Logger.getGlobal().finest("jerry");

        Logger logger = Logger.getGlobal() ; //加这些命令可以修改日志大银幕到第几个级别
        logger.setUseParentHandlers(false) ;

        Handler handler = new ConsoleHandler() ;//FileHandler() 把后面的换成前面的就是写进日志文件里
        handler.setLevel(Level.FINER) ;//这里面是第几个就打印到这个级别和他之上的
        //ls ~ 能看到Java0.log的文件，里面就是日志

        logger.addHandler(handler );
        logger.setLevel(Level.FINER) ;
        Filter filter = new Filter() { //这个可以再过滤日志
            @Override
            public boolean isLoggable(LogRecord record) {
                if(record.getMessage().length() < 5) //日志名字长度小于五的打印
                return true;
                else
                    return false;
              //  return record.getMessage().length() < 5 ? false : true; 三目运算符
            }
        };
        logger.setFilter(filter);

        Formatter formatter = new Formatter() { //可以按照自己的格式打印输出内容
            @Override
            public String format(LogRecord record) {
                return LocalDateTime.now().toString() + ":" + record .getMessage() +";\n";
            }
        };
        handler.setFormatter(formatter) ;

        Logger.getGlobal().severe("info"); //只打印前三个后面四个默认都是不打印，这七个都是简单日志
        Logger.getGlobal().warning("hello");
        Logger.getGlobal().info("severe");
        Logger.getGlobal().config("world");
        Logger.getGlobal().fine(",,,");
        Logger.getGlobal().finer("tom");
        Logger.getGlobal().finest("jerry");
    }
}
