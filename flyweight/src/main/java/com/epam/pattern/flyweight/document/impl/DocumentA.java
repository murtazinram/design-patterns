package com.epam.pattern.flyweight.document.impl;

import com.epam.pattern.flyweight.document.Document;

public class DocumentA implements Document {

    @Override
    public String read() {
        return this.toString() + " Reading document A";
    }
}
