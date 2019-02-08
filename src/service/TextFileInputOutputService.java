package service;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;

public class TextFileInputOutputService implements InputOutputService {

    @Override
    public List<Shape> read(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            List<Shape> shapes = new ArrayList<>();
            String line = reader.readLine();
            while (line != null) {

                String[] parts = line.split(" ");

                switch (parts[0]) {
                    case "R":
                        shapes.add(new Rectangle(Double.valueOf(parts[1]), Double.valueOf(parts[2]), Double.valueOf(parts[3]), Double.valueOf(parts[4]), Double.valueOf(parts[5]), Double.valueOf(parts[6]), Double.valueOf(parts[7]), Double.valueOf(parts[8])));
                        break;
                    case "T":
                        shapes.add(new Triangle(Double.valueOf(parts[1]), Double.valueOf(parts[2]), Double.valueOf(parts[3]), Double.valueOf(parts[4]), Double.valueOf(parts[5]), Double.valueOf(parts[6])));
                        break;
                    case "C":
                        shapes.add(new Circle(Double.valueOf(parts[1]), Double.valueOf(parts[2]), Double.valueOf(parts[3]), Double.valueOf(parts[4])));
                        break;
                }
                line = reader.readLine();

            }
            return shapes;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void write(File file, List<Shape> shapes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Shape shape : shapes) {
                writer.write(shape.print());
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
