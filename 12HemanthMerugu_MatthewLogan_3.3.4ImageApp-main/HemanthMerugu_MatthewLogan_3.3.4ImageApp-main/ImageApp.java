/*
  ImageApp: 
 */
import java.awt.Color;

public class ImageApp
{
  public static void main(String[] args)
  {

    // use any file from the lib folder
    String pictureFile = "C:\\Users\\6\\Downloads\\CSA Projects\\PLTW 3.3.4\\12HemanthMerugu_MatthewLogan_3.3.4ImageApp-main\\HemanthMerugu_MatthewLogan_3.3.4ImageApp-main\\lib\\rainbow.jpg";
    String pictureFile2 = "C:\\Users\\6\\Downloads\\CSA Projects\\PLTW 3.3.4\\12HemanthMerugu_MatthewLogan_3.3.4ImageApp-main\\HemanthMerugu_MatthewLogan_3.3.4ImageApp-main\\lib2\\balloon.png";

    // Get an image, get 2d array of pixels, show a color of a pixel, and display the image
    Picture origImg = new Picture(pictureFile);
    Pixel[][] origPixels = origImg.getPixels2D();
    System.out.println(origPixels[0][0].getColor());
    origImg.explore();

    // Image #1 Using the original image and pixels, recolor an image by changing the RGB color of each Pixel
    for (int row = 0; row < origPixels.length; row++) {
        for (int col = 0; col < origPixels[row].length; col++) {
            Pixel pixel = origPixels[row][col];
            Color currentColor = pixel.getColor();
            int red = currentColor.getRed();
            int green = currentColor.getGreen();
            int blue = currentColor.getBlue();
          
            Color newColor = new Color(blue, red, green);
            pixel.setColor(newColor);
        }
    }
    Picture recoloredImg = origImg; // recolored
    recoloredImg.explore(); // displays the image

    // Image #2 Using the original image and pixels, create a photographic negative of the image
    Picture negImg = new Picture(pictureFile);
    Pixel[][] negPixels = negImg.getPixels2D();

    for (int row = 0; row < negPixels.length; row++) {
      for (int col = 0; col < negPixels[row].length; col++) {
          Pixel pixel = negPixels[row][col];
          Color currentColor = pixel.getColor();
          int red = currentColor.getRed();
          int green = currentColor.getGreen();
          int blue = currentColor.getBlue();
          red = 255-red;
          blue = 255-blue;
          green = 255-green;
        
          Color newColor = new Color(red, green, blue);
          pixel.setColor(newColor);
      }
  }
  Picture negImgPicture = negImg; // recolored
  negImgPicture.explore(); // displays the image

    /* to be implemented */

    // Image #3 Using the original image and pixels, create a grayscale version of the image
    Picture grayscaleImg = new Picture(pictureFile);
    Pixel[][] grayscalePixels = grayscaleImg.getPixels2D();
    for (int row = 0; row < grayscalePixels.length; row++) {
      for (int col = 0; col < grayscalePixels[row].length; col++) {
          Pixel pixel = grayscalePixels[row][col];
          Color currentColor = pixel.getColor();
          int red = currentColor.getRed();
          int green = currentColor.getGreen();
          int blue = currentColor.getBlue();
        
          int average = (red + green + blue) / 3;
          Color newColor = new Color(average, average, average);
          pixel.setColor(newColor);
  
      }
    }
    grayscaleImg.explore(); // displays the image
    /* to be implemented */

    // Image #4 Using the original image and pixels, rotate it 180 degrees
    Picture upsidedownImage = new Picture(pictureFile);
    Pixel[][] upsideDownPixels = upsidedownImage.getPixels2D();

    /* to be implemented */

    // Image #5 Using the original image and pixels, rotate image 90
    Picture rotateImg = new Picture(pictureFile);
    Pixel[][] rotatePixels = rotateImg.getPixels2D();

    /* to be implemented */

    // Image #6 Using the original image and pixels, rotate image -90
    Picture rotateImg2 = new Picture(pictureFile);
    Pixel[][] rotatePixels2 = rotateImg2.getPixels2D();

    /* to be implemented */


    // Final Image: Add a small image to a larger one

    /* create new picture
       scale new picture down
       explore new picture
    */
    Picture newImg = new Picture(pictureFile2);
   // scale the small image (balloon) to be smaller if desired
   Picture balloon = new Picture(pictureFile2);
   //Picture smallBalloon = balloon.getPictureWithWidth(200); // scale width to 200 px (keeps aspect)

   // paste the balloon onto the recolored original (or use origImg to paste onto original)
   // coordinates: startRow (y), startCol (x)
   int pasteY = 30; // row
   int pasteX = 50; // col

   // Use the paste method added to Picture to respect alpha in PNG
   origImg.paste(balloon, pasteY, pasteX);

   // show and write the result
   origImg.explore();
   origImg.write("rainbow_with_balloon.jpg");
    



    // for testing  2D algorithms
    int[][] test1 = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };
    int[][] test2 = new int[4][4];


  }
}
