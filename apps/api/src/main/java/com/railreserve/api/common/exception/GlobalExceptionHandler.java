package com.railreserve.api.common.exception;


import com.railreserve.api.booking.exception.SeatUnavailableException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(
            SeatUnavailableException.class
    )
    public ResponseEntity<?> handleSeatConflict(
            SeatUnavailableException ex
    ) {


        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(
                        new ErrorResponse(
                                ex.getMessage()
                        )
                );

    }


    record ErrorResponse(
            String message
    ) {
    }


}