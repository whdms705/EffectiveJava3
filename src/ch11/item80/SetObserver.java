package ch11.item80;

// 집합 관찰자 콜백 인터페이스
public interface SetObserver<E> {
    // ObservableSet에 원소가 더해지면 호출된다.
    void added(ObservableSet<E> set, E element);
}
