package AST.node;

public class ComponentDefinition extends ASTNode{
    private Decorator decorator;
    private Block block;

    public void print(int i) {
        decorator.print();
        block.print(i);
    }

    public Decorator getDecorator() { return decorator; }
    public void setDecorator(Decorator decorator) { this.decorator = decorator; }
    public Block getBlock() { return block; }
    public void setBlock(Block block) { this.block = block; }
}
