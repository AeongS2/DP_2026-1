package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.Comparator;

public class BookShelfIteratorByYearDesc implements Iterator<Book> {
    private Book[] sortedBooks;
    private int index;

    public BookShelfIteratorByYearDesc(BookShelf bookShelf) {
        int size = bookShelf.getLength();
        this.sortedBooks = new Book[size];

        // 기존 데이터 복사
        for (int i = 0; i < size; i++) {
            sortedBooks[i] = bookShelf.getBookAt(i);
        }

        // 연도 기준 내림차순 정렬 (최신 → 오래된)
        Arrays.sort(sortedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b2.getYear() - b1.getYear(); // 내림차순
            }
        });

        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < sortedBooks.length;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return sortedBooks[index++];
    }
}