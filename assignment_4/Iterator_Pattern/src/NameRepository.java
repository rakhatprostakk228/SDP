// Класс коллекции, содержащей имена
public class NameRepository {
    public String names[] = {"John", "Jane", "Alice", "Bob"};

    // Метод для получения итератора
    public Iterator getIterator() {
        return new NameIterator();
    }

    // Внутренний класс - Конкретный Итератор
    private class NameIterator implements Iterator {
        int index;

        public boolean hasNext() {
            return index < names.length;
        }

        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}