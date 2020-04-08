package com.codegym.task.task16.task1631;

import com.codegym.task.task16.task1631.common.*;
import java.lang.IllegalArgumentException;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageType) {
        ImageReader reader;
        if (imageType == ImageTypes.BMP) reader = new BmpReader();
        else if(imageType == ImageTypes.JPG) reader = new JpgReader();
        else if(imageType == ImageTypes.PNG) reader = new PngReader();
        else throw new IllegalArgumentException("Unknown image type");
        return reader;
    }
}
