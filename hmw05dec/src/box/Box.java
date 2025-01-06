package box;
// 1. Create a generic class Box<T> that can store a single item of any type. Add methods to set, get, and clear the item.
public class Box<T> {

    private T boxContent;

    public Box(T boxContent){
        this.boxContent= boxContent;
    }

    public T getBoxContent() {
        return boxContent;
    }

    public void setBoxContent(T boxContent) {
        this.boxContent = boxContent;
    }

    public void clearBoxContent(){
        boxContent = null;
    }
}
