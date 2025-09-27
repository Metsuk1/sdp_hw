package adapters;

import adaptees.GifViewer;
import interfaces.ImageViewer;

//Adapter
public class GifAdapter implements ImageViewer {
    private GifViewer gifViewer;

    public GifAdapter(GifViewer gifViewer) {
        this.gifViewer = gifViewer;
    }

    @Override
    public void display(String fileName) {
        gifViewer.renderGif(fileName);
    }
}
