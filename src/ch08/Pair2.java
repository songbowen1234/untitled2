package ch08;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Pair2<T> {
    @SuppressWarnings("all") //抑制警告的带虚线的会把虚线取消，如second取消会有虚线在下面，括号里面可以写什么网上搜尽量不用all
    private T second;
    public void setSecond (T newValue){
        second = newValue ;
    }

    public abstract void setSecond(LocalDate newValue);
}


class DateInterval extends Pair2<LocalDate>{
    @Override
    public void setSecond(LocalDate newValue){
        super.setSecond(newValue);
    }
}
//终端中输入Javap 文件名.class查看内容
//Javap -c 文件名.class看的更详细