package edu.skypro.hamework2_11.service;

import edu.skypro.hamework2_11.exception.InvalidInputException;
import org.springframework.stereotype.Service;

@Service
public class ValidatorServiceImpl implements ValidatorService{

    @Override
    public int validateItemId(int id) {
        if (id < 1) {
            throw new InvalidInputException();
        }
        return id;
    }
}
