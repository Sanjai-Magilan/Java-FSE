package Module1.BuilderPatternExample;

public class ProductBuilder {
    private  String CPU;
    private  String GPU;
    private  String RAM;
    private  String Storage;

    public ProductBuilder setCPU(String CPU){
        this.CPU = CPU;
        return this;
    }

    public ProductBuilder setGPU(String GPU){
        this.GPU=GPU;
        return this;
    }

    public ProductBuilder setRAM (String RAM){
        this.RAM = RAM;
        return this;
    }

    public ProductBuilder setStorage(String Storage) {
        this.Storage = Storage;
        return this;
    }

    public Product Build(){
        return Product.BuildPC(this);
    }

    public String getCPU() { return CPU; }
    public String getGPU() { return GPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return Storage; }
}
