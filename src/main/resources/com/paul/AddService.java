package com.paul;

import org.springframework.stereotype.Service;

@Service
public class AddService {
    public int add(int x, int y) {
        return x+y;
    }
}
