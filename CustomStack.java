package krStack;
import java.util.ArrayList;

public class CustomStack<E> {

    public E last;//ласт добав элем в стэк
    public ArrayList<E> array;//список элем стэка

    public CustomStack() {//пустой стэка
        array = new ArrayList<>();
    }

    public boolean isEmpty() {//проверка на пустоту
        return this.last == null;
    }

    public void push(E elem) {//добавление в конец стэка
        if (this.isEmpty()) {
            this.last = elem;
            this.array.add(elem);
        } else {
            int size = this.array.size();
            this.last = elem;
            this.array.add(size+1, elem);
        }
    }

    public E pop() {//врзвращает последний элемент => удаляет
        if (isEmpty()) {
            throw new RuntimeException("Массив пуст");
        }
        E result = this.last;
        this.array.remove(result);
        return result;
    }

    public E peek() {////врзвращает последний элемент => не удаляет
        if (isEmpty()) {
            throw new RuntimeException("Массив пуст");
        }
        return this.last;
    }

    public void remove(E elem) {//последний элемент стэка улетает
        if (isEmpty()) {
            throw new RuntimeException("Массив пуст");
        }
        this.array.remove(elem);
    }

}
