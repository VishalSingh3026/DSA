package Stack_Queues;

public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super(); // it will call the customStack
    }
    public DynamicStack(int size){
        super(size); // it will call the customStack(int size)
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            //double the size
            int[] temp =new int[data.length*2];

            // copy all previous items in new data
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(item);
    }





}
