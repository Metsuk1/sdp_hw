import adaptees.GifViewer;
import adaptees.PngViewer;
import adapters.GifAdapter;
import adapters.PngAdapter;
import interfaces.ImageViewer;

//Client usage
public class Main {
    public static void main(String[] args) {
        ImageViewer png = new PngAdapter(new PngViewer());
        png.display("photo.png");

        ImageViewer gif = new GifAdapter(new GifViewer());
        gif.display("animation.gif");
    }
}
