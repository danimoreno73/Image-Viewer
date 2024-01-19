package software.ulpgc.ImageViewer;

import software.ulpgc.ImageViewer.Controller.NextImageCommand;
import software.ulpgc.ImageViewer.Controller.PrevImageCommand;
import software.ulpgc.ImageViewer.Model.FileImageLoader;
import software.ulpgc.ImageViewer.Model.Image;
import software.ulpgc.ImageViewer.View.MainFrame;

import java.io.File;

public class Main {

    public static final String root = "D:\\Dani\\Pictures\\Saved Pictures\\Imagenes DALL-E";

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        Image image = new FileImageLoader(new File(root)).load();

        mainFrame.imageDisplay().show(image);

        mainFrame.addCommand(">", new NextImageCommand(mainFrame.imageDisplay()));
        mainFrame.addCommand("<", new PrevImageCommand(mainFrame.imageDisplay()));

        mainFrame.setVisible(true);

    }

}
