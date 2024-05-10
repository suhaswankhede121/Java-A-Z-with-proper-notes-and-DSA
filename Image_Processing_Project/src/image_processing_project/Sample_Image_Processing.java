import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class Sample_Image_Processing {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                BufferedImage originalImage = ImageIO.read(selectedFile);

                // 3D Effect
                BufferedImage 3dBufferedImage Image = apply3DEffect(originalImage);

                // Rotate Image
                BufferedImage rotatedImage = rotateImage(3dImage, 90);

                // Save in different formats
                ImageIO.write(rotatedImage, "jpg", new File("rotated_image.jpg"));
                ImageIO.write(rotatedImage, "png", new File("rotated_image.png"));
                ImageIO.write(rotatedImage, "gif", new File("rotated_image.gif"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static BufferedImage apply3DEffect(BufferedImage originalImage) {
    int width = originalImage.getWidth();
    int height = originalImage.getHeight();
    BufferedImage 3dBufferedImage Image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

    // Iterate through each pixel in the image
    for (int y = 0; y < height; y++) {
        for (int x = 0; x < width; x++) {
            int pixel = originalImage.getRGB(x, y);

            // Get the Red, Green, and Blue components of the pixel
            int red = (pixel >> 16) & 0xff;
            int green = (pixel >> 8) & 0xff;
            int blue = pixel & 0xff;

            // Apply 3D effect by adjusting the color values
            red = (int) (red * 0.393 + green * 0.769 + blue * 0.189);
            green = (int) (red * 0.349 + green * 0.686 + blue * 0.168);
            blue = (int) (red * 0.272 + green * 0.534 + blue * 0.131);

            // Check that the new color values are within the valid range
            red = Math.min(255, Math.max(0, red));
            green = Math.min(255, Math.max(0, green));
            blue = Math.min(255, Math.max(0, blue));

            // Set the new pixel color in the 3D image
            int newPixel = (red << 16) | (green << 8) | blue;
            3dImage.setRGB(x, y, newPixel);
        }
    }

    return 3dImage;
}
    private static BufferedImage rotateImage(BufferedImage image) {
    return rotateImage(image);
}

    private static BufferedImage rotateImage(double image) {
        int width = image.getWidth();
        int height = image.getHeight();
        double angle = 0;
        // Calculate the new width and height of the rotated image
        int newWidth = (int) (width * Math.cos(Math.toRadians(angle)) + height * Math.sin(Math.toRadians(angle)));
        int newHeight = (int) (width * Math.sin(Math.toRadians(angle)) + height * Math.cos(Math.toRadians(angle)));
        // Create a new BufferedImage to hold the rotated image
        BufferedImage rotatedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        // Perform the rotation
        for (int y = 0; y < newHeight; y++) {
            for (int x = 0; x < newWidth; x++) {
                int newX = (int) (x * Math.cos(Math.toRadians(angle)) - y * Math.sin(Math.toRadians(angle)));
                int newY = (int) (x * Math.sin(Math.toRadians(angle)) + y * Math.cos(Math.toRadians(angle)));
                // Check if the coordinates are within the bounds of the original image
                if (newX >= 0 && newX < width && newY >= 0 && newY < height) {
                    rotatedImage.setRGB(x, y, image.getRGB(newX, newY));
                }
            }
        }
        return rotatedImage;
    }
}
