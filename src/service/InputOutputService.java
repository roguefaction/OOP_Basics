package service;

import shapes.Shape;

import java.io.File;
import java.util.List;


public interface InputOutputService {
    List<Shape> read(File file);
    void write(File file, List<Shape> shapes);
}
