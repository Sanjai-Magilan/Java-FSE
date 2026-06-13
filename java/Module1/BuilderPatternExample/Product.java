package Module1.BuilderPatternExample;

public class Product {
    private  String CPU;
    private  String GPU;
    private  String RAM;
    private  String Storage;

    private Product( ProductBuilder product){
        this.CPU = product.getCPU();
        this.GPU = product.getGPU();
        this.RAM = product.getRAM();
        this.Storage = product.getStorage();
    }

    public void display(){
        System.out.println("CPU     : "+CPU);
        System.out.println("GPU     : "+GPU);
        System.out.println("RAM     : "+RAM);
        System.out.println("Storage : "+Storage);
    }

    public static Product BuildPC( ProductBuilder builder){
        return new Product(builder);
    }
}
