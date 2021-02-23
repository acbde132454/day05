package com.powernode.exception;

import java.awt.*;
import java.io.IOException;

public class Fu {
    public void demo( int a, int b ) throws IOException, FontFormatException {
        if( a < 0 ) {
            throw new IOException();
        }
        if( b < 0 ) {
            throw new FontFormatException("");
        }
    }
}
