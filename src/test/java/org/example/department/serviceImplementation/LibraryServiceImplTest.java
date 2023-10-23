package org.example.department.serviceImplementation;

import org.example.department.enums.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryServiceImplTest {
    LibraryServiceImpl libraryService;

    @BeforeEach
    void setUp() {
        libraryService = new LibraryServiceImpl();
    }

    @Test
    void fulfillRequestsFirstComeFirstServe() {
        libraryService.addBook("BookC", 2);
        libraryService.makeRequestFirstComeFirstServe("BookC", Position.JUNIOR_STUDENT);
        libraryService.fulfillRequestsFirstComeFirstServe();
        int remainingCount = libraryService.getBookCount("BookC");
        assertEquals(1, remainingCount);
    }

    @Test
    void fulfillRequestsWithPriority() {
        libraryService.addBook("BookD", 4);
        libraryService.makeRequestWithPriority("BookD", Position.SENIOR_STUDENT);
        libraryService.fulfillRequestsWithPriority();
        int remainingCount = libraryService.getBookCount("BookD");
        assertEquals(3, remainingCount);
    }


    @Test
    void displayBookAvailability() {
        libraryService.addBook("BookX", 10);
        libraryService.addBook("BookY", 15);
        libraryService.addBook("BookZ", 8);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        libraryService.displayBookAvailability();
        String output = outputStream.toString();
        assertTrue(output.contains("BookX: 10"));
        assertTrue(output.contains("BookY: 15"));
        assertTrue(output.contains("BookZ: 8"));
    }
    }

