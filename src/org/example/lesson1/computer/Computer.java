package org.example.lesson1.computer;

public class Computer <K extends Input, V extends Output>{
    private K input;
    private V output;

    public Computer(K input, V output) {
        this.input = input;
        this.output = output;
    }

    public K getInput() {
        return input;
    }

    public void setInput(K input) {
        this.input = input;
    }

    public V getOutput() {
        return output;
    }

    public void setOutput(V output) {
        this.output = output;
    }
}
