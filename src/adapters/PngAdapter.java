package adapters;

import adaptees.PngViewer;
import interfaces.ImageViewer;

//Adapter
public class PngAdapter implements ImageViewer {
    private PngViewer pngViewer;

    public PngAdapter(PngViewer pngViewer) {
        this.pngViewer = pngViewer;
    }

    @Override
    public void display(String fileName) {
        pngViewer.showPng(fileName);
    }
}
