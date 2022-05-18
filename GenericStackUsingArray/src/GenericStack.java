public class GenericStack<E>{
    private E[] list = (E[]) new Object[5];
    private int index = 0;

    public int getSize(){
        return this.list.length;
    }

    public boolean isEmpty(){
        return this.index - 1 < 0;
    }

    public E peek(){
        return this.list[this.index -1];
    }

    private void incrementSize(){
        E[] newList = (E[]) new Object[this.getSize() * 2];
        System.arraycopy(list, 0, newList, 0, this.getSize());
        this.list = newList;
    }

    public void push(E data){
        if (index >= this.getSize()) {
            this.incrementSize();
        }
        list[index] = data;
        index += 1;
    }

    public E pop(){
        E currentData = list[index - 1];
        if(currentData != null){
            index -= 1;
            return currentData;
        }
        return null;
    }

    public void printStackData(){
        for(int i = 0; i < index; i++) System.out.println(list[i]);
    }
}
