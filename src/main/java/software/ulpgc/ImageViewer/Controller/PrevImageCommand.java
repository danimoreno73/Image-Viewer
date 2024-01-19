package software.ulpgc.ImageViewer.Controller;

import software.ulpgc.ImageViewer.View.ImageDisplay;

public class PrevImageCommand implements Command{

    private final ImageDisplay imageDisplay;

    public PrevImageCommand(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }


    @Override
    public void execute() {
        imageDisplay.show(imageDisplay.image().prev());
    }
}
