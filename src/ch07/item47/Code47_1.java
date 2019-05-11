package ch07.item47;


import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static java.lang.ProcessHandle.allProcesses;

public class Code47_1 {
    public static void main(String[] args) {

        for(ProcessHandle ph: allProcesses()::iterator){
        // 프로세스
        }

        for(ProcessHandle ph: (Iterable<ProcessHandle>)allProcesses()::iterator){
        // 프로세스
        }

        for(ProcessHandle ph: iterableOf(allProcesses())){
            // 프로세스
        }

    }
    // Stream<E>를 Iterable<E>로 중개해주는 어댑터
    public static <E> Iterable<E> iterableOf(Stream<E> stream){
        return stream::iterator;
    }

    // Iterator<E>를 Stream<E>로 중개해주는 어댑터
    public static<E> Stream<E> streamOf(Iterable<E> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
