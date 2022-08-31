package ResearchBlocks;

/**
 * 7 кью
 */
public class Block {
    private int length;
    private int width;
    private int height;
    public static void main(String[] args) {
        Block b = new Block(new int[]{2,4,6});
        System.out.println(b.getWidth());
        System.out.println(b.getLength());
        System.out.println(b.getHeight());
        System.out.println(b.getVolume());
        System.out.println(b.getSurfaceArea());
    }

    public Block(int[] array) {
        this.length = array[1];
        this.width = array[0];
        this.height = array[2];
    }

    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
    public int getHeight() {
        return height;
    }
    public int getVolume() {
        return this.height*this.width*this.length;
    }
    public int getSurfaceArea() {
        int a = (width*height)*2;
        int b = (length*height)*2;
        int c = (width*length)*2;
        return a+b+c;
    }
}
