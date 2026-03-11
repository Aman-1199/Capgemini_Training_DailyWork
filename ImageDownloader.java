public class ImageDownloader {
    public static void main(String[] args) throws InterruptedException {
        String[] images ={"image","image2","image3"};
        for (int i = 0; i < images.length; i++) {
            Downloader loader=new Downloader(images[i]);
            loader.start();
            loader.join();
        }
    }
}
class Downloader extends Thread{
    String image;
    Downloader(String image){
        this.image=image;
    }
    public void run(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Downlaoding"+image);
    }
}
