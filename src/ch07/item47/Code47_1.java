package ch07.item47;


import java.util.stream.Stream;

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

    public static <E> Iterable<E> iterableOf(Stream<E> stream){
        return stream::iterator;
    }
}
