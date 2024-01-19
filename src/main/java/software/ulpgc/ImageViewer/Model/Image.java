package software.ulpgc.ImageViewer.Model;

public interface Image {

    String name();

    Image next();

    Image prev();

}
