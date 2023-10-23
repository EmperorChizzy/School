package org.example.department.serviceImplementation;

import org.example.department.entities.BookRequest;
import org.example.department.enums.Position;

import java.util.*;

public class LibraryServiceImpl {
    private static Queue<BookRequest> firstComeFirstServeQueue = new LinkedList<>();
        private static PriorityQueue<BookRequest> priorityQueue = new PriorityQueue<>(Comparator.comparing(BookRequest::getPriority));
        private static Map<String, Integer> bookCounts = new HashMap<>();

    /**
     *
     * Making my request on First Come, First Served
     * @param bookTitle
     * @param requesterType
     */

    public void makeRequestFirstComeFirstServe(String bookTitle, Position requesterType) {
        boolean availabilityOfBook = isBookAvailable(bookTitle);
        if (availabilityOfBook) {
            firstComeFirstServeQueue.add(new BookRequest(requesterType, bookTitle));
            System.out.println(requesterType + " requested the book '" + bookTitle + "' (First Come First Serve).");
        } else {
            System.out.println("Book '" + bookTitle + "' is not available.");
        }
    }

    /**
     *
     * servicing my requests based on First Come Fist Serve Basis
     */
    public void fulfillRequestsFirstComeFirstServe() {
        while (!firstComeFirstServeQueue.isEmpty()) {
            BookRequest request = firstComeFirstServeQueue.poll();
            String bookTitle = request.getBookTitle();
            if (isBookAvailable(bookTitle)) {
                offloadBooks(bookTitle, 1); // Decrease quantity when fulfilling the collection
                System.out.println("Issued '" + bookTitle + "' to " + request.getRequesterType());
            } else {
                System.out.println("No pending book requests in the First Come First Serve queue.");
            }
        }
    }

    /**
     *
     * Making my request based on priority
     * @param bookTitle
     * @param requesterType
     * @return
     */
    public String makeRequestWithPriority(String bookTitle, Position requesterType) {
        if (isBookAvailable(bookTitle)) {
            priorityQueue.offer(new BookRequest(requesterType, bookTitle));
            System.out.println(requesterType + " requested the book '" + bookTitle + "'.");
        } else {
            System.out.println("Book '" + bookTitle + "' is not available.");
        }
        return bookTitle;
    }

    /**
     *
     * Servicing the requests based on priority
     */
    public void fulfillRequestsWithPriority() {
        while (!priorityQueue.isEmpty()) {
            BookRequest request = priorityQueue.poll();
            String bookTitle = request.getBookTitle();
            if (isBookAvailable(bookTitle)) {
                offloadBooks(bookTitle, 1); // Decrease quantity when fulfilling the collection
                System.out.println("Issued '" + bookTitle + "' with priority to " + request.getRequesterType() + ".");
            } else {
                System.out.println("No pending book requests in the Priority queue.");
            }
        }
    }
    private boolean isBookAvailable(String bookTitle) {
        return bookCounts.getOrDefault(bookTitle, 0) > 0;
    }

    public void addBook(String bookTitle, int initialCount) {
        bookCounts.put(bookTitle, initialCount);
    }

    public int getBookCount(String bookTitle) {
        return bookCounts.getOrDefault(bookTitle, 0);
    }

    public void stockUpBook(String bookTitle, int count) {
        bookCounts.put(bookTitle, getBookCount(bookTitle) + count);
    }

    public void offloadBooks(String bookTitle, int count) {
        int currentCount = getBookCount(bookTitle);
        if (currentCount >= count) {
            bookCounts.put(bookTitle, currentCount - count);
        } else {
            System.out.println("Not enough copies of '" + bookTitle + "' available.");
        }
    }

    public void displayBookAvailability() {
        System.out.println("Book Availability:");
        for (Map.Entry<String, Integer> entry : bookCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}