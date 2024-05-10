
package image_processing_project;

import javax.imageio.ImageIO;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;





import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.RescaleOp;
import java.io.IOException;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


class Effects {
     BufferedImage image;
    

    public void redImage() {
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                int p = image.getRGB(i, j);

                int a = (p >> 24) & 0xff;
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;

                // set the green and blue value to 0 and leave the red value unchanged
                g = 0;
                b = 0;

                // reconstruct the pixel with new values
                p = (a << 24) | (r << 16) | (g << 8) | b;
                image.setRGB(i, j, p);
            }
        }
    }

   public void redEyeView() {
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                int p = image.getRGB(i, j);

                int a = (p >> 24) & 0xff;
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;

                // check if pixel color is red
                if (r > g && r > b) {
                    // reduce the red value
                    r -= 50;
                    if (r < 0) {
                        r = 0;
                    }
                }

                // reconstruct the pixel with new values
                p = (a << 24) | (r << 16) | (g << 8) | b;
                image.setRGB(i, j, p);
            }
        }
    }

    public void brightness(int amount) {
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                int p = image.getRGB(i, j);

                int a = (p >> 24) & 0xff;
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;

                // increase the brightness
                r += amount;
                g += amount;
                b += amount;

                // check if the new values are within the valid range
                r = Math.min(255, Math.max(0, r));
                g = Math.min(255, Math.max(0, g));
                b = Math.min(255, Math.max(0, b));

                // reconstruct the pixel with new values
                p = (a << 24) | (r << 16) | (g << 8) | b;
                image.setRGB(i, j, p);
            }
        }
    }

    public void greenEyeView() {
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                int p = image.getRGB(i, j);

                int a = (p >> 24) & 0xff;
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;

                // check if pixel color is green
                if (g > r && g > b) {
                    // reduce the green value
                    g -= 50;
                    if (g < 0) {
                        g = 0;
                    }
                }

                // reconstruct the pixel with new values
                p = (a << 24) | (r << 16) | (g << 8) | b;
                image.setRGB(i, j, p);
            }
        }
    }

    public void blur() {
        int blurSize = 5;
        float[] blurKernel = {
            1/9f, 1/9f, 1/9f,
            1/9f, 1/9f, 1/9f,
            1/9f, 1/9f, 1/9f
        };
        BufferedImageOp blur = new ConvolveOp(new Kernel(blurSize, blurSize, blurKernel));
        image = blur.filter(image, null);
    }
  public void blueEyeView() {
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                int p = image.getRGB(i, j);

                int a = (p >> 24) & 0xff;
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;

                // check if pixel color is blue
                if (b > r && b > g) {
                    // reduce the blue value
                    b -= 50;
                    if (b < 0) {
                        b = 0;
                    }
                }

                // reconstruct the pixel with new values
                p = (a << 24) | (r << 16) | (g << 8) | b;
                image.setRGB(i, j, p);
            }
        }
    }

   public void sharpen() {
        int sharpenSize = 3;
        float[] sharpenKernel = {
            0f, -1f, 0f,
            -1f, 5f, -1f,
            0f, -1f, 0f
        };
        BufferedImageOp sharpen = new ConvolveOp(new Kernel(sharpenSize, sharpenSize, sharpenKernel));
        image = sharpen.filter(image, null);
    }

     public void custom(float[] filter) {
        int filterSize = (int) Math.sqrt(filter.length);
        BufferedImageOp customFilter = new ConvolveOp(new Kernel(filterSize, filterSize, filter));
        image = customFilter.filter(image, null);
    }

   public void adjust(float brightness, float contrast, float gamma) {
        RescaleOp op = new RescaleOp(brightness, contrast, null);
        op.setGamma(gamma);
        image = op.filter(image, null);
    }

    void brightness() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void custom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void adjust() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void getImage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
class Transform {
     BufferedImage image;
    public void horizontalSideStrength(float strength) {
        AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
        tx.translate(-image.getWidth(), 0);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        image = op.filter(image, null);
        float[] brightKernel = { strength, 0, 0, 0, 1, 0, 0, 0, strength };
        BufferedImageOp bright = new ConvolveOp(new Kernel(3, 3, brightKernel));
        image = bright.filter(image, null);
    }

      public void horizontalMirror() {
        AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
        tx.translate(-image.getWidth(), 0);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        image = op.filter(image, null);
    }

      public void verticalMirror() {
        AffineTransform tx = AffineTransform.getScaleInstance(1, -1);
        tx.translate(0, -image.getHeight());
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        image = op.filter(image, null);
    }

     public void rotation(int degrees) {
        if (degrees != 45 && degrees != 90 && degrees != 180 && degrees != 360) {
            System.out.println("Invalid degree value, please use 45, 90, 180, or 360");
            return;
        }
        double radians = Math.toRadians(degrees);
        AffineTransform tx = new AffineTransform();
        tx.rotate(radians, image.getWidth() / 2, image.getHeight() / 2);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        image = op.filter(image, null);
    }
     public void zoomInOut(float zoomFactor) {
        AffineTransform tx = new AffineTransform();
        tx.scale(zoomFactor, zoomFactor);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        image = op.filter(image, null);
    }

    public void crop() {
        // code to crop image
    } public void crop(int x, int y, int width, int height) {
        BufferedImage croppedImage = image.getSubimage(x, y, width, height);
        image = croppedImage;
    }

    void zoomInOut() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void rotation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void horizontalSideStrength() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

class File  {
    BufferedImage image;

    private File(File homeDir, String property) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public void getImage() throws IOException {
     
      //   java.io.File selectedFile = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(homeDir, System.getProperty("user.home")));
        fileChooser.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "jpeg"));
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            java.io.File selectedFile = fileChooser.getSelectedFile();
            try {
                image = ImageIO.read(selectedFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    File() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            java.io.File selectedFile = fileChooser.getSelectedFile();
            try {
                image = ImageIO.read(selectedFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

     public void save() throws IOException {
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp");
    fileChooser.setFileFilter(filter);
    int result = fileChooser.showSaveDialog(null);
    if (result == JFileChooser.APPROVE_OPTION) {
        java.io.File selectedFile = fileChooser.getSelectedFile();
        String format = filter.getDefaultExtension();
        String filePath = selectedFile.getAbsolutePath();
        if (!filePath.endsWith("." + format)) {
            filePath += "." + format;
        }
        ImageIO.write(image, format, (ImageOutputStream) new File(homeDir, filePath));
    }
}



   
}

class Other {
    
     public void exit() {
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
     Stack<BufferedImage> imageStack = new Stack<>();
    BufferedImage currentImage;
    public void undo() {
        if (!imageStack.empty()) {
            currentImage = imageStack.pop();
        } else {
            System.out.println("No previous operations to undo");
        }
    }
  
    public void redo() {
        if (!redoStack.empty()) {
            imageStack.push(currentImage);
            currentImage = redoStack.pop();
        } else {
            System.out.println("No previous operations to redo");
        }
    }

    void reset() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class Class_Execution {
    public static void main(String[] args) throws IOException {
        Effects effects = new Effects();
        Transform transform = new Transform();
        File file = new File();
        Other other = new Other();

        // call methods from different classes
        effects.getImage();
        effects.redImage();
        effects.redEyeView();
        effects.greenEyeView();
        effects.blur();
        effects.brightness();
        effects.blueEyeView();
        effects.sharpen();
        effects.custom();
        effects.adjust();
        transform.horizontalSideStrength();
        transform.horizontalMirror();
        transform.verticalMirror();
        transform.rotation();
        transform.zoomInOut();
        transform.crop();
        file.openFile();
        file.save();
        other.exit();
        other.reset();
        other.undo();
        other.redo();
    }
}
