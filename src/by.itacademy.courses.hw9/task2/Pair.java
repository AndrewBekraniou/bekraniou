package by.itacademy.courses.hw9.task2;
public class Pair<T, V> {
    T firstelement;
    V secondelement;
    public Pair(T firstelement, V secondelemen) {
        this.firstelement = firstelement;
        this.secondelement = secondelemen;
    }
    public T getFirstelement() {
        return firstelement;
    }
    public void setFirstelement(T firstelement) {
        this.firstelement = firstelement;
    }
    public V getSecondelement() {
        return secondelement;
    }
    public void setSecondelement(V secondelement) {
        this.secondelement = secondelement;
    }
    public String swap() {
        T tmp = firstelement;
        firstelement = (T) secondelement;
        secondelement = (V) tmp;
        return "1 элемент = "+firstelement+"; 2 элемент = "+secondelement;
    }
    @Override
    public String toString() {
        return "Pair{" +
                "firstelement=" + firstelement +
                ", secondelement=" + secondelement +
                '}';
    }
}
