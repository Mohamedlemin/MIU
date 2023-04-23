package MPP.Week3.lab8.exo4;

import java.util.List;

public interface MyInterface<T,B,C>{
 abstract C  countWord(List<T> words,B c , B d , C len);
}
